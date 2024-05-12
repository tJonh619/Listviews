package com.example.appcurso

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listViewModules)
        val moduleNames = arrayOf(
            "Conceptos básicos de las Bases de datos",
            "Acciones sobre una Base de Datos I",
            "Manejo de tablas dinámicas",
            "Acciones sobre una Base de Datos II"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, moduleNames)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedModuleName = moduleNames[position]
            Toast.makeText(this, "Module selected: $selectedModuleName", Toast.LENGTH_SHORT).show()

            // Aquí puedes abrir la actividad correspondiente según el módulo seleccionado
            // Ejemplo:
            when (position) {
                0 -> startActivity(Intent(this, SecondActivity::class.java))
                1 -> startActivity(Intent(this, ThreeActivity::class.java))
                2 -> startActivity(Intent(this, FourActivity::class.java))
                3 -> startActivity(Intent(this, FiveActivity::class.java))
                // Agrega más casos según sea necesario para cada módulo
            }
        }
    }
}
