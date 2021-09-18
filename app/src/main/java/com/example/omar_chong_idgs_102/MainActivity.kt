package com.example.omar_chong_idgs_102

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.view.View
import android.widget.EditText
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var info = "Omar Chong Lopez"
        var texto: TextView = findViewById(R.id.titulo) as TextView
            texto.text = info.toString()
        var texto2: TextView = findViewById(R.id.txt01) as TextView


        var i =1
        var salida = "Los datos son: "

        while(i < 5) {

            if(i == 1){
                salida = salida + 10
            }else{
                salida = salida + 1
            }
            i++
        }
        texto2.text = salida.toString()
        Toast.makeText(this, "El resultado es:" + salida, Toast.LENGTH_LONG).show()

        var num1 = findViewById<View>(R.id.num01) as EditText
        var num2 = findViewById<View>(R.id.num02) as EditText
        var calculo = findViewById<View>(R.id.suma) as Button
        calculo.setOnClickListener(View.OnClickListener {
            var res = num1.text.toString().toInt() + num2.text.toString().toInt()
            var texto3: TextView = findViewById(R.id.resultado) as TextView
                texto3.text = res.toString()
        })

    //-----------------------------------//
        var operadores = findViewById<Button>(R.id.operadores)
        operadores.setOnClickListener{
            val accion1 = Intent(this, menu::class.java)
            startActivity(accion1)
        }

    }
}