import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilterMenuExample() {
    var menuExpanded by remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf("") }

    Column {
        Button(
            onClick = { menuExpanded = true },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Show Filter Menu")
        }

        FilterMenu(
            onItemSelected = { item ->
                selectedItem = item
                menuExpanded = false
            },
            expanded = menuExpanded,
            onMenuDismissed = { menuExpanded = false }
        )

        if (selectedItem.isNotBlank()) {
            Text(
                text = "Selected Item: $selectedItem",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilterMenu(
    onItemSelected: (String) -> Unit,
    expanded: Boolean,
    onMenuDismissed: () -> Unit
) {
    val items = listOf("Blood Donation", "Kidney Donation")
    var selectedIndex by remember { mutableStateOf(0) }

    DropdownMenu(
        expanded = expanded,
        onDismissRequest = onMenuDismissed
    ) {
        Column {
            items.forEachIndexed { index, item ->
                DropdownMenuItem(
                    onClick = {
                        selectedIndex = index
                        onItemSelected(items[index])
                        onMenuDismissed()
                    }
                ) {
                    CompositionLocalProvider(LocalContentAlpha provides 1f) {
                        Text(
                            text = "item",
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        }
    }
}