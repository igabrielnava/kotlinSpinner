package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner_id = findViewById<Spinner>(R.id.spinner_id)

        val frutas = arrayOf("Rojo", "Amarillo", "Verde", "Anaranjado", "Azul", "Negro", "Blanco")

        val adaptador = ArrayAdapter(this@MainActivity, android.R.layout.simple_spinner_dropdown_item, frutas)
        spinner_id.adapter = adaptador


    }
}