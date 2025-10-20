package mx.edu.utez.uii_t1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import mx.edu.utez.uii_t1.ui.components.Imagen
import mx.edu.utez.uii_t1.ui.components.Titulo
import mx.edu.utez.uii_t1.ui.theme.UII_T1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UII_T1Theme {
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UII_T1Theme {
        Greeting("Android")
    }
}

@Composable
fun HomeScreen(){
    var nombre by remember { mutableStateOf("") }
    var saludo by remember { mutableStateOf("") }
    var currentImageResId by remember { mutableStateOf(R.drawable.tecmi)}
    var imagen by remember { mutableStateOf(R.drawable.utez) }
    Column (verticalArrangement = Arrangement.spacedBy(12.dp)){
        Image(
            painter = painterResource(id = currentImageResId),
            contentDescription = if (saludo.isNotEmpty()) "Imagen de saludo" else "Imagen por defecto",
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Fit
        )

        Titulo("Escribe tu nombre", modifier = Modifier.background(Color(0xFF000000)))
        Titulo("Ola k ace",  50, color = 0XFFa89f9e)
        Titulo("Puro DS", color = 0XFFa89f9e)
        Imagen(R.drawable.utez, "utez sorprendida")

        //Los textField ocupan una variable para hacer camnbios
        TextField(
            value = nombre,
            onValueChange = {nombre = it},
            placeholder = {
                Text(text = "Ingresa tu nombre:")
            }
        )
        Button(
            onClick = {
                saludo = "¡Hola, $nombre!"
                currentImageResId = R.drawable.utez
                imagen = R.drawable.tecmi
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            )
        ) {
            Text(text = "Saludo de vegetta 777")
        }
        if(saludo.isNotEmpty()){
            Text(
                text = "Te mando un saludo guapisimo: $nombre",
                fontSize = 30.sp,

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    UII_T1Theme{
        HomeScreen()
    }
}