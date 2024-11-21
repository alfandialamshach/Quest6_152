package com.example.project6.ui.view.widget

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun DynamicSelectedTextField(
    selectedValue: String,
    options: List<String>,
    label: String,
    onValueChangeEvent: (String) -> Unit,
    modifier: Modifier =Modifier
){

}