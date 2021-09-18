package com.example.omar_chong_idgs_102

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

    //Button salida//
        var salida = findViewById<Button>(R.id.salir)
        salida.setOnClickListener{
            val accion2 = Intent(this, MainActivity::class.java)
            startActivity(accion2)
        }
    //Button suma//
        var op_suma = findViewById<Button>(R.id.op_suma)
        op_suma.setOnClickListener{
            val accion2 = Intent(this, suma::class.java)
            startActivity(accion2)
        }

        //Button resta//

        

    }
}