package mx.edu.utez.uii_t1.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import mx.edu.utez.uii_t1.R

@Composable
fun Imagen(imagen: Int, desc: String, escala: ContentScale = ContentScale.Fit){
    Image(
        painter = painterResource(imagen),
        contentDescription = "Es una imagen de la Uni",
        contentScale = escala,
        alignment = Alignment.Center
    )
}