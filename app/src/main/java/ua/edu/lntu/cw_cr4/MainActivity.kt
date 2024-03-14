package ua.edu.lntu.cw_cr4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
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
import androidx.compose.ui.layout.VerticalAlignmentLine
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
    val checkedState1 = remember { mutableStateOf(false) }
    val checkedState2 = remember { mutableStateOf(false) }
    val checkedState3 = remember { mutableStateOf(false) }

    Column {
        Row (verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier,

        ) {
            Text(text = "Завдання №1",
                fontSize =  25.sp
                )
            Checkbox(
                checked = checkedState1.value,
                onCheckedChange = { isChecked ->
                    checkedState1.value = isChecked
                }
            )
        }
        Button(onClick = { navController.navigate("second_screen") }) {
            Text("Перейти до завдання 1")
        }
        Row (verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier,

            ) {
            Text(text = "Завдання №2",
                    fontSize =  25.sp
            )
            Checkbox(
                checked = checkedState2.value,
                onCheckedChange = { isChecked ->
                    checkedState2.value = isChecked
                }
            )
        }
        Button(onClick = { navController.navigate("third_screen") }) {
            Text("Перейти до завдання 2")
        }
        Row (verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier,

            ) {
            Text(text = "Завдання №3",
                fontSize =  25.sp
            )
            Checkbox(
                checked = checkedState3.value,
                onCheckedChange = { isChecked ->
                    checkedState3.value = isChecked
                }
            )
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
            Text("Перейти до головного меню")
        }
    }
}

@Composable
fun ThirdScreen(navController: NavHostController) {

    Column {

        Button(onClick = { navController.navigate("first_screen") }) {
            Text("Перейти до головного меню")
        }
    }
}
@Composable
fun FourthScreen(navController: NavHostController) {

    Column {

        Button(onClick = { navController.navigate("first_screen") }) {
            Text("Перейти до головного меню")
        }
    }
}


