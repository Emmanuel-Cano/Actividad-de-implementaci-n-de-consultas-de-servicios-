package mx.edu.utez.calculadoraf

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvResultado: TextView
    private var numero1: Double = 0.0
    private var operador: String = ""
    private var limpiarPantalla = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvResultado = findViewById(R.id.tvResultado)

        val botonesNumeros = listOf(
            findViewById<Button>(R.id.btn0),
            findViewById<Button>(R.id.btn1),
            findViewById<Button>(R.id.btn2),
            findViewById<Button>(R.id.btn3),
            findViewById<Button>(R.id.btn4),
            findViewById<Button>(R.id.btn5),
            findViewById<Button>(R.id.btn6),
            findViewById<Button>(R.id.btn7),
            findViewById<Button>(R.id.btn8),
            findViewById<Button>(R.id.btn9)
        )

        for ((index, boton) in botonesNumeros.withIndex()) {
            boton.setOnClickListener { agregarNumero(index.toString()) }
        }

        findViewById<Button>(R.id.btnSuma).setOnClickListener { guardarOperacion("+") }
        findViewById<Button>(R.id.btnRest).setOnClickListener { guardarOperacion("-") }
        findViewById<Button>(R.id.btnMul).setOnClickListener { guardarOperacion("×") }
        findViewById<Button>(R.id.btnDiv).setOnClickListener { guardarOperacion("÷") }

        findViewById<Button>(R.id.btnIgual).setOnClickListener { calcular() }

        findViewById<Button>(R.id.btnC).setOnClickListener { limpiar() }
    }

    private fun agregarNumero(num: String) {
        if (limpiarPantalla || tvResultado.text.toString() == "0") {
            tvResultado.text = ""
            limpiarPantalla = false
        }
        tvResultado.text = tvResultado.text.toString() + num
    }

    private fun guardarOperacion(op: String) {
        numero1 = tvResultado.text.toString().toDouble()
        operador = op
        limpiarPantalla = true
    }

    private fun calcular() {
        val numero2 = tvResultado.text.toString().toDoubleOrNull() ?: return
        val resultado = when (operador) {
            "+" -> numero1 + numero2
            "-" -> numero1 - numero2
            "×" -> numero1 * numero2
            "÷" -> if (numero2 != 0.0) numero1 / numero2 else Double.NaN
            else -> numero2
        }
        tvResultado.text = resultado.toString()
    }

    private fun limpiar() {
        tvResultado.text = "0"
        numero1 = 0.0
        operador = ""
        limpiarPantalla = false
    }
}
