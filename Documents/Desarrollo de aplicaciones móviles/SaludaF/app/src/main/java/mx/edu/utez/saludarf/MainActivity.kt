package mx.edu.utez.saludarf

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var num1EditText: EditText
    private lateinit var num2EditText: EditText
    private lateinit var resultadoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calcu)
        num1EditText = findViewById(R.id.num1)
        num2EditText = findViewById(R.id.num2)
        resultadoTextView = findViewById(R.id.Mensaje)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onButtonClick(view: View){
        val strNum1 = num1EditText.text.toString()
        val strNum2 = num2EditText.text.toString()

        if (strNum1.isEmpty() || strNum2.isEmpty()){
            resultadoTextView.text = "Ingresa los numeros"
            return
        }
        val numero1: Float
        val numero2: Float
        try{
            numero1 = strNum1.toFloat()
            numero2 =strNum2.toFloat()
        } catch (e: NumberFormatException){
            resultadoTextView.text = "Ingresa numeros reales"
            return
        }
        var resultadof: Float

        when(view.id){
            R.id.suma -> {
                resultadof = numero1 + numero2
            }
            R.id.resta -> {
                resultadof = numero1 - numero2
            }
            R.id.multi -> {
                resultadof = numero1 * numero2
            }
            R.id.div -> {
                if (numero2 == 0f){
                    resultadoTextView.text = "No se puede dividir entre 0"
                }
                resultadof = numero1 / numero2
            }
            else -> {
                resultadoTextView.text = "No valido"
                return
            }


        }

        resultadoTextView.text = "El resultado es: $resultadof"


    }




}