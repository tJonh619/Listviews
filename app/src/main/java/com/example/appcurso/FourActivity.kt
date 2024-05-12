package com.example.appcurso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class FourActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        // Obtén una referencia al ListView desde el layout
        val listView = findViewById<ListView>(R.id.listViewFour)

        // Define los elementos para la lista
        val actions = arrayOf(
            "¿Cómo crear Tablas Dinámicas en Excel? | Gestión de la Información #11",
            "Agrupar campos en Tablas Dinámicas en Excel | Gestión de la Información #12",
            "Mostrar datos como porcentaje de fila o columna | Gestión de la Información #13",
            "Segmentación de Datos en Tablas Dinámicas en Excel | Gestión de la Información #14"
        )

        // Crea un adaptador para la lista
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, actions)

        // Establece el adaptador en el ListView
        listView.adapter = adapter

        // Establece un listener para manejar los clics en los elementos de la lista
        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedAction = actions[position]
            Toast.makeText(this@FourActivity, "Seleccionaste: $selectedAction", Toast.LENGTH_SHORT).show()

            // Configura un intent para abrir VideoDetailActivity y pasa los datos necesarios
            val intent = Intent(this, VideoDetailActivity::class.java)
            intent.putExtra("module_name", selectedAction)

            // Configura los datos específicos según la acción seleccionada
            when (position) {
                0 -> {
                    intent.putExtra("video_url", "https://goo.gl/2npG6Y")
                    intent.putExtra("database_file_name", "BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                1 -> {
                    intent.putExtra("video_url", "https://goo.gl/SKGwGt")
                    intent.putExtra("database_file_name", "BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                2 -> {
                    intent.putExtra("video_url", "https://goo.gl/urrrP5")
                    intent.putExtra("database_file_name", "BD_VENTAS")
                    intent.putExtra("database_url", "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX")
                }
                3 -> {
                    intent.putExtra("video_url", "https://goo.gl/e5NfSt")
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

