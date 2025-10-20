package mx.edu.utez.uii_t2_calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.edu.utez.uii_t2_calculadora.ui.theme.UII_T2_CalculadoraTheme
import kotlin.math.pow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UII_T2_CalculadoraTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun HomeScreen(){

    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column (verticalArrangement = Arrangement.spacedBy(12.dp)){

        TextField(
            value = num1,
            onValueChange = {num1 = it},
            placeholder = {
                Text(text = "Ingresa el primer numero:")
            }
        )

        TextField(
            value = num2,
            onValueChange = {num2 = it},
            placeholder = {
                Text(text = "Ingresa el segundo numero:")
            }
        )
        Row {

            Button(
                onClick = {
                    val n1 = num1.toDoubleOrNull() ?: 0.0
                    val n2 = num2.toDoubleOrNull() ?: 0.0

                    resultado = (n1 + n2).toString()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                )
            ) {
                Text(text = "Sumita")
            }

            Button(
                onClick = {
                    val n1 = num1.toDoubleOrNull() ?: 0.0
                    val n2 = num2.toDoubleOrNull() ?: 0.0

                    resultado = (n1 - n2).toString()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                )
            ) {
                Text(text = "Restita")
            }


            Button(
                onClick = {
                    val n1 = num1.toDoubleOrNull() ?: 0.0
                    val n2 = num2.toDoubleOrNull() ?: 0.0

                    resultado = n1.pow(n2).toString()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                )
            ) {
                Text(text = "Potencia")
            }
        }


        Row {
            Button(
                onClick = {
                    val n1 = num1.toDoubleOrNull() ?: 0.0
                    val n2 = num2.toDoubleOrNull() ?: 0.0

                    resultado = (n1 * n2).toString()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                )
            ) {
                Text(text = "Multi")
            }


            Button(
                onClick = {
                    val n1 = num1.toDoubleOrNull() ?: 0.0
                    val n2 = num2.toDoubleOrNull() ?: 0.0

                    resultado = if (n2 != 0.0) (n1/n2).toString()else "Error, no se puede dividir entre 0"
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                )
            ) {
                Text(text = "Division")
            }


            Button(
                onClick = {
                    val n1 = num1.toDoubleOrNull() ?: 0.0
                    val n2 = num2.toDoubleOrNull() ?: 0.0

                    resultado = if (n2 != 0.0) (n1%n2).toString()else "Error modulo con 0"
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                )
            ) {
                Text(text = "Modulito")
            }

        }

        if(resultado.isNotEmpty()){
            Text(
                text = "El resultado es: $resultado",
                fontSize = 30.sp,
                color = Color.Black
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    UII_T2_CalculadoraTheme {
        HomeScreen()
    }
}