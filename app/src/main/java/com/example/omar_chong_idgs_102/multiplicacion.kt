package com.example.omar_chong_idgs_102

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class multiplicacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplicacion)



        var num1 = findViewById<View>(R.id.mult_num1) as EditText
        var num2 = findViewById<View>(R.id.mult_num2) as EditText
        var calculo = findViewById<View>(R.id.mul_opr) as Button
        calculo.setOnClickListener(View.OnClickListener {
            var res = num1.text.toString().toInt() * num2.text.toString().toInt()
            var texto3: TextView = findViewById(R.id.mul_res) as TextView
            texto3.text = res.toString()
        })

        var salir_mul = findViewById<Button>(R.id.salir_mul)
        salir_mul.setOnClickListener{
            val accion1 = Intent(this, menu::class.java)
            startActivity(accion1)
        }

    }
}