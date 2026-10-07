package com.example.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.learncompose.screen.ToastAndSnackBar

class MainActivity : ComponentActivity() {
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
            ToastAndSnackBar()
        }
    }
}