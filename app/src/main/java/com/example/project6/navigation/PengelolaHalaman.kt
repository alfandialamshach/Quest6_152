package com.example.project6.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project6.model.Mahasiswa
import com.example.project6.ui.view.viewmodel.MahasiswaViewModel

enum class Halaman {
    Splash,
    Mahasiswa
}

@Composable
fun MahasiswaApp(modifier: Modifier = Modifier,
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
            navHostController: NavHostController = rememberNavController())
{
    val mahasiswaUiState =mahasiswaViewModel.mahasiswaUiState.collectAsState().value

    NavHost(
        navController = naController,

    )
}