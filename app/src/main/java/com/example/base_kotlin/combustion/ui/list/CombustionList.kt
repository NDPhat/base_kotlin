package com.example.base_kotlin.combustion.ui.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable

@Composable
fun CombustionList(

) {
    LazyColumn() {

        items(10) { child ->
            ListItem(title = Icon(Icons.Default.Clear, contentDescription = ""), contentName = "Hello", contentDetail = "Hi", value = "100", detailValue = "02/03")
        }
    }
}
