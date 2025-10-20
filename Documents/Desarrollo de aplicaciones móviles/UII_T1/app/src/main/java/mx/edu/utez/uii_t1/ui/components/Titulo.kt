package mx.edu.utez.uii_t1.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Titulo(titulo: String, tamano: Int = 30, color: Long = 0XFFFFFFFF, modifier: Modifier = Modifier){
    Text(
        text = titulo,
        fontSize = tamano.sp,
        fontWeight = FontWeight.Bold,
        color = Color(color),
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.Cursive,
        modifier = modifier
        )
}
