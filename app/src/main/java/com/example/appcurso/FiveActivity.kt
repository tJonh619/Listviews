package com.example.appcurso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class FiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        // Obtén una referencia al ListView desde el layout
        val listView = findViewById<ListView>(R.id.listViewFive)

        // Define los elementos para la lista
        val actions = arrayOf(
            "Combinando correspondencia con Word y una base de datos en Excel | Gestión de la Información #15",
            "Formato condicional en Excel Parte 1 | Gestión de la Información #16",
            "Formato condicional en Excel Parte 2 | Gestión de la Información #17",
            "Formato condicional en Excel Parte 3 | Gestión de la Información #18",
            "¿Cómo generar minigráficos en Excel? | Gestión de la Información #19",
            "Cinta y barra de menú rápida en Excel | Gestión de la Información #20",
            "Conoce todos los menús en la presentación de excel | Gestión de la Información #21",
            "Conoce todas las opciones de menú en Excel | Gestión de la Información #22",
            "¿Cómo hacer consultas web desde Excel y generar Bases de Datos? | Gestión de la Información #23",
            "Creación de Macros en Excel | Gestión de la Información #24"
        )

        // Crea un adaptador para la lista
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, actions)

        // Establece el adaptador en el ListView
        listView.adapter = adapter

        // Establece un listener para manejar los clics en los elementos de la lista
        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedAction = actions[position]
            Toast.makeText(this@FiveActivity, "Seleccionaste: $selectedAction", Toast.LENGTH_SHORT).show()

            // Configura un intent para abrir VideoDetailActivity y pasa los datos necesarios
            val intent = Intent(this, VideoDetailActivity::class.java)
            intent.putExtra("module_name", selectedAction)

            // Configura los datos específicos según la acción seleccionada
            when (position) {
                0 -> {
                    intent.putExtra("video_url", "https://goo.gl/LPM51S")
                    intent.putExtra("database_file_name", "No 4.5 TABLA DINAMICA BD PERSONAL")
                    intent.putExtra("database_url", "http://comunicaciones.poligran.edu.co/documentacion/No4-5-TABLA-DINAMICA-BD-PERSONAL.xlsm")
                }
                1 -> {
                    intent.putExtra("video_url", "https://goo.gl/fxXnqo")
                    intent.putExtra("database_file_name", "BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                2 -> {
                    intent.putExtra("video_url", "https://goo.gl/1ybnkZ")
                    intent.putExtra("database_file_name", "BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                3 -> {
                    intent.putExtra("video_url", "https://goo.gl/HVRNvA")
                    intent.putExtra("database_file_name", "BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                4 -> {
                    intent.putExtra("video_url", "https://goo.gl/wZB4VD")
                    intent.putExtra("database_file_name", "BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                5 -> {
                    intent.putExtra("video_url", "https://goo.gl/pj8wua")
                    intent.putExtra("database_file_name", "Libro limpio Excel")
                    // No hay URL de base de datos para este caso
                }
                6 -> {
                    intent.putExtra("video_url", "https://goo.gl/FtMcTZ")
                    intent.putExtra("database_file_name", "Libro limpio Excel & BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                7 -> {
                    intent.putExtra("video_url", "https://goo.gl/XxTo2b")
                    intent.putExtra("database_file_name", "Libro limpio Excel")
                    // No hay URL de base de datos para este caso
                }
                8 -> {
                    intent.putExtra("video_url", "https://goo.gl/XnXS9W")
                    intent.putExtra("database_file_name", "CONSULTA_WEB")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/CONSULTA_WEB.XLSX")
                }
                9 -> {
                    intent.putExtra("video_url", "https://goo.gl/NhNsT3")
                    intent.putExtra("database_file_name", "No 4.5 TABLA DINAMICA BD PERSONAL")
                    intent.putExtra("database_url", "http://comunicaciones.poligran.edu.co/documentacion/No4-5-TABLA-DINAMICA-BD-PERSONAL.xlsm")
                }
                // Agrega más casos según sea necesario para cada acción
            }

            // Inicia la actividad de detalles
            startActivity(intent)
        }
    }
}
