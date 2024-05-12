package com.example.appcurso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        // Obtén una referencia al ListView desde el layout
        val listView = findViewById<ListView>(R.id.listViewThree)

        // Define los elementos para la lista
        val actions = arrayOf(
            "¿Cómo ingresar datos en una Base de Datos de Excel? | Gestión de la Información #5",
            "Aprende a ordenar Bases de Datos en Excel | Gestión de la Información #6",
            "¿Cómo generar subtotales en una Base de Datos en Excel? | Gestión de la Información #7",
            "¿Cómo se generan autofiltros en una Base de Datos en Excel? | Gestión de la Información #8",
            "¿Cómo crear un filtro avanzado en una Base de Datos en Excel? | Gestión de la Información #9",
            "Aprende a validar datos en Excel | Gestión de la Información #10"
        )

        // Crea un adaptador para la lista
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, actions)

        // Establece el adaptador en el ListView
        listView.adapter = adapter

        // Establece un listener para manejar los clics en los elementos de la lista
        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedAction = actions[position]
            Toast.makeText(this@ThreeActivity, "Seleccionaste: $selectedAction", Toast.LENGTH_SHORT).show()

            // Configura un intent para abrir VideoDetailActivity y pasa los datos necesarios
            val intent = Intent(this, VideoDetailActivity::class.java)
            intent.putExtra("module_name", selectedAction)

            // Configura los datos específicos según la acción seleccionada
            when (position) {
                0 -> {
                    intent.putExtra("video_url", "https://goo.gl/5kEcGd")
                    intent.putExtra("database_file_name", "BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                1 -> {
                    intent.putExtra("video_url", "https://goo.gl/eGZ5j9")
                    intent.putExtra("database_file_name", "BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                2 -> {
                    intent.putExtra("video_url", "https://goo.gl/cq9NGR")
                    intent.putExtra("database_file_name", "BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                3 -> {
                    intent.putExtra("video_url", "https://goo.gl/Zcm4r6")
                    intent.putExtra("database_file_name", "BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                4 -> {
                    intent.putExtra("video_url", "https://goo.gl/z6Nzwu")
                    intent.putExtra("database_file_name", "BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                5 -> {
                    intent.putExtra("video_url", "https://goo.gl/JyMCeE")
                    intent.putExtra("database_file_name", "BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                // Agrega más casos según sea necesario para cada acción
            }

            // Inicia la actividad de detalles
            startActivity(intent)
        }
    }
}

