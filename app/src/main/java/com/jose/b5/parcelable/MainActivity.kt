package com.jose.b5.parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonMandar).setOnClickListener()
        {
            val dni:String = findViewById<EditText>(R.id.editTextTextDni).text.toString()
            val nombre:String = findViewById<EditText>(R.id.editTextTextNombre).text.toString();
            //Es como un array de chars
            val edad = findViewById<EditText>(R.id.editTextEdad).text.toString().toInt()

            /*val intento = Intent(applicationContext, Parcelable2Activity::class.java)
            intento.putExtra("DATOS", com.jose.b5.personalibrary.Persona(dni, nombre, edad))
            startActivity(intento)*/
        }
    }
}