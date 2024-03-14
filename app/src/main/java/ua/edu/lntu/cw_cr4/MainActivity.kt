package ua.edu.lntu.cw_cr4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ua.edu.lntu.cw_cr4.ui.theme.IPZ_CW_CR4_Syshchuk_VladislavTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_CR4_Syshchuk_VladislavTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainWindow()
                }
            }
        }
    }
}


@Composable
fun MainWindow() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "first_screen") {
        composable("first_screen") {
            FirstScreen(navController)
        }
        composable("second_screen") {
            SecondScreen(navController)
        }
        composable("third_screen") {
            ThirdScreen(navController)
        }
        composable("fourth_screen") {
            FourthScreen(navController)
        }
    }
}

@Composable
fun FirstScreen(navController: NavHostController) {

    Column {

        Button(onClick = { navController.navigate("second_screen") }) {
            Text("Перейти до завдання 1")
        }
        Button(onClick = { navController.navigate("third_screen") }) {
            Text("Перейти до завдання 2")
        }
        Button(onClick = { navController.navigate("fourth_screen") }) {
            Text("Перейти до завдання 3")
        }
    }
}

@Composable
fun SecondScreen(navController: NavHostController) {
    Column {

        Button(onClick = { navController.navigate("first_screen") }) {
            Text("Go to Second Screen")
        }
    }
}

@Composable
fun ThirdScreen(navController: NavHostController) {

    Column {

        Button(onClick = { navController.navigate("first_screen") }) {
            Text("Go to Second Screen")
        }
    }
}
@Composable
fun FourthScreen(navController: NavHostController) {

    Column {

        Button(onClick = { navController.navigate("first_screen") }) {
            Text("Go to Second Screen")
        }
    }
}


