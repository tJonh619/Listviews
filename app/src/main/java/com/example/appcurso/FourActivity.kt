package com.example.appcurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FourActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)


        fun StartAct(moduleName: String, videoUrl: String, databaseFileName: String, databaseUrl: String )
        {
            val intent = Intent(this, VideoDetailActivity::class.java)
            intent.putExtra("module_name", moduleName.toString())
            intent.putExtra("video_url", videoUrl.toString())
            intent.putExtra("database_file_name", databaseFileName.toString())
            intent.putExtra("database_url", databaseUrl.toString())

            startActivity(intent)
        }

        val btn11 = findViewById<Button>(R.id.btn11)
        // Definir la acción al hacer clic en btn4
        btn11.setOnClickListener {
            val moduleName = "¿Cómo crear Tablas Dinámicas en Excel? | Gestión de la Información #11"
            val videoUrl = "https://goo.gl/2npG6Y"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        val btn12 = findViewById<Button>(R.id.btn12)
        // Definir la acción al hacer clic en btn4
        btn12.setOnClickListener {
            val moduleName = "Agrupar campos en Tablas Dinámicas en Excel | Gestión de la Información #12"
            val videoUrl = "https://goo.gl/SKGwGt"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        val btn13 = findViewById<Button>(R.id.btn13)
        // Definir la acción al hacer clic en btn4
        btn13.setOnClickListener {
            val moduleName = "Mostrar datos como porcentaje de fila o columna | Gestión de la Información #13"
            val videoUrl = "https://goo.gl/urrrP5"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        val btn14 = findViewById<Button>(R.id.btn14)
        // Definir la acción al hacer clic en btn4
        btn14.setOnClickListener {
            val moduleName = "Segmentación de Datos en Tablas Dinámicas en Excel | Gestión de la Información #14"
            val videoUrl = "https://goo.gl/e5NfSt"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }
    }
}