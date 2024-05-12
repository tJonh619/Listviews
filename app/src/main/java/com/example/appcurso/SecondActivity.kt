package com.example.appcurso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_xml)

        val listView: ListView = findViewById(R.id.listView)

        // Definir los nombres de los módulos
        val modules = arrayOf(
            "Conceptos básicos de Bases de Datos en Excel | Gestión de la Información #1",
            "Ejemplos de Bases de Datos en Excel | Gestión de la Información #2",
            "Diversos ejemplos de Bases de Datos en Excel | Gestión de la Información #3",
            "¿Qué es una Tabla Resumen en Excel y qué es una Base de Datos? | Gestión de la Información #4"
            // Puedes agregar más elementos según sea necesario
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, modules)
        listView.adapter = adapter

        // Manejar el clic en un elemento de la lista
        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedModule = modules[position]

            // Configurar datos específicos para cada módulo
            val intent = Intent(this, VideoDetailActivity::class.java)
            intent.putExtra("module_name", selectedModule)

            // Configurar datos según el módulo seleccionado
            when (position) {
                0 -> {
                    intent.putExtra("video_url", "https://goo.gl/Rof9Yf")
                    intent.putExtra("database_file_name", "No usa una base de datos como ejemplo")
                    intent.putExtra("database_url", "N/A")
                }
                1 -> {
                    intent.putExtra("video_url", "https://goo.gl/iUF2rL")
                    intent.putExtra("database_file_name", "No 1 EJEMPLO BD")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/No-1-EJEMPLO-BD.XLS")
                }
                2 -> {
                    intent.putExtra("video_url", "https://goo.gl/baXcJW")
                    intent.putExtra("database_file_name", "EJEMPLO_BANCOS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/EJEMPLO_BANCOS.XLSX")
                }
                3 -> {
                    intent.putExtra("video_url", "https://goo.gl/hj8vYo")
                    intent.putExtra("database_file_name", "No 3 NO BD")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/No-3-NO-BD.XLS")
                }
                // Puedes agregar más casos según sea necesario para cada módulo
            }

            // Iniciar la actividad de detalles
            startActivity(intent)
        }
    }
}
