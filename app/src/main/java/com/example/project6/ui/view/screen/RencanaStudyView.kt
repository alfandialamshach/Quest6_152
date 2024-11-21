package com.example.project6.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import com.example.project6.model.Mahasiswa

@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
) {
    var chosenDropdwn by remember {
        mutableStateOf(
            ""
        )
    }

}