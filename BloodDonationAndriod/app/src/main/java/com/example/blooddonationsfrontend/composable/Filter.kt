//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Button
//import androidx.compose.material3.DropdownMenu
//import androidx.compose.material3.DropdownMenuItem
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.example.blooddonationsfrontend.data.model.FilterOption
//import java.util.logging.Filter
//
//@Composable
//fun showFilterOption(){
//
//    var filterOption by remember {
//        mutableStateOf(FilterOption(""))
//    }
//
//    Column {
//        Text("Select an option:")
//        Column {
//            Button(onClick = { filterOption = FilterOption("Blood") }) {
//                Text("Blood")
//            }
//            Button(onClick = { filterOption = FilterOption("Kidney")}) {
//                Text("Kidney")
//            }
//            Button(onClick = { filterOption = FilterOption("Liver")}) {
//                Text("Liver")
//            }
//        }
//    }
//}
//@Preview
//@Composable
//fun hideFilterOptions(){
//    var filterOption by remember {
//        mutableStateOf(FilterOption(""))
//    }
//
//    var selectedOption by remember {
//        mutableStateOf(FilterOption(""))
//    }
//    Column {
//        showFilterOption()

//        if (FilterOption.selectedOption.isNotEmpty()){
//            hideFilterOptions()
//
//            Text("Selected option: ${filterOption.selectedOption}")
//        }
//    }

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.blooddonationsfrontend.data.model.FilterOption

@Composable
fun FilterOptions(onFilterSelected: (FilterOption) -> Unit) {
    val filterOptions = listOf("Blood", "Kidney", "Liver")
    var selectedOption by remember { mutableStateOf("") }

    Column {
        Text("Select an option:")
        filterOptions.forEach { option ->
            Button(
                onClick = {
                    selectedOption = option
                    onFilterSelected(FilterOption(option))
                },
                modifier = Modifier.padding(vertical = 4.dp)
            ) {
                Text(option)
            }
        }
    }
}

@Preview
@Composable
fun PreviewFilterOptions() {
    FilterOptions(onFilterSelected = { /* Handle selected filter option */ })
}



//@Composable
//fun FilterOptionScreen() {
//    var selectedOption by remember { mutableStateOf<FilterOption?>(null) }
//
//    Column {
//        FilterOptions { option ->
//            selectedOption = option
//        }
//
//        selectedOption?.let {
//            Text("Selected option: ${it.value}", modifier = Modifier.padding(top = 8.dp))
//        }
//    }
//}



