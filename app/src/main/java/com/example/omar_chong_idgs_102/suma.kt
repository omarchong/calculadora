package com.example.omar_chong_idgs_102

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class suma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma)

        var num1 = findViewById<View>(R.id.sum_num1) as EditText
        var num2 = findViewById<View>(R.id.sum_num2) as EditText
        var calculo = findViewById<View>(R.id.sum_opr) as Button
        calculo.setOnClickListener(View.OnClickListener {
            var res = num1.text.toString().toInt() + num2.text.toString().toInt()
            var texto3: TextView = findViewById(R.id.sum_res) as TextView
            texto3.text = res.toString()
        })

        var salir_sum = findViewById<Button>(R.id.salir_suma)
        salir_sum.setOnClickListener{
            val accion1 = Intent(this, menu::class.java)
            startActivity(accion1)
        }
    }
}