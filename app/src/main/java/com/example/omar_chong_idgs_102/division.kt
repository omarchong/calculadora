package com.example.omar_chong_idgs_102

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class division : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_division)

        var num1 = findViewById<View>(R.id.div_num1) as EditText
        var num2 = findViewById<View>(R.id.div_num2) as EditText
        var calculo = findViewById<View>(R.id.div_opr) as Button
        calculo.setOnClickListener(View.OnClickListener {
            var res = num1.text.toString().toInt() / num2.text.toString().toInt()
            var texto3: TextView = findViewById(R.id.div_res) as TextView
            texto3.text = res.toString()
        })

        //Button sair//
        var salir_div = findViewById<Button>(R.id.salir_div)
        salir_div.setOnClickListener{
            val accion1 = Intent(this, menu::class.java)
            startActivity(accion1)
        }


    }
}