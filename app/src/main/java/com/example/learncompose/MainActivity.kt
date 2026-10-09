package com.example.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.learncompose.screen.ProductListScreen

class MainActivity : ComponentActivity() {
    private val viewModel: ProductViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //  TextExample()
            //  RowLayout()
            // ColumnLayout()
            // MOdifier()
            // ImageLayout()
            //  ButtonLayout()
            // CardLayout()
            // DividerLayout()
            // StateManageMent()
            //   AlertDialogAndPopUp()
            //   LoginScreen(navController)
            //   NavGraph()
            //  LazyColumnAndLazyRowLayout()
            // ScaffoldLayout()
            //  NavBarGraph()
            // ToastAndSnackBar()
            ProductListScreen(viewModel = viewModel)
        }
    }
}