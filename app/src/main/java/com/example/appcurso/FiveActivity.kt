package com.example.appcurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FiveActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        fun StartAct(moduleName: String, videoUrl: String, databaseFileName: String, databaseUrl: String )
        {
            val intent = Intent(this, VideoDetailActivity::class.java)
            intent.putExtra("module_name", moduleName.toString())
            intent.putExtra("video_url", videoUrl.toString())
            intent.putExtra("database_file_name", databaseFileName.toString())
            intent.putExtra("database_url", databaseUrl.toString())

            startActivity(intent)
        }

        val btn15 = findViewById<Button>(R.id.btn15)
        // Definir la acción al hacer clic en btn4
        btn15.setOnClickListener {
            val moduleName = "Combinando correspondencia con Word y una base de datos en Excel | Gestión de la Información #15"
            val videoUrl = "https://goo.gl/LPM51S"
            val databaseFileName = "No 4.5 TABLA DINAMICA BD PERSONAL"
            val databaseUrl = "http://comunicaciones.poligran.edu.co/documentacion/No4-5-TABLA-DINAMICA-BD-PERSONAL.xlsm"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        val btn16 = findViewById<Button>(R.id.btn16)
        // Definir la acción al hacer clic en btn4
        btn16.setOnClickListener {
            val moduleName = "Formato condicional en Excel Parte 1 | Gestión de la Información #16"
            val videoUrl = "https://goo.gl/fxXnqo"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        val btn17 = findViewById<Button>(R.id.btn17)
        // Definir la acción al hacer clic en btn4
        btn17.setOnClickListener {
            val moduleName = "Formato condicional en Excel Parte 2 | Gestión de la Información #17"
            val videoUrl = "https://goo.gl/1ybnkZ"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        val btn18 = findViewById<Button>(R.id.btn18)
        // Definir la acción al hacer clic en btn4
        btn18.setOnClickListener {
            val moduleName = "Formato condicional en Excel Parte 3 | Gestión de la Información #18"
            val videoUrl = "https://goo.gl/HVRNvA"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        val btn19 = findViewById<Button>(R.id.btn19)
        // Definir la acción al hacer clic en btn4
        btn19.setOnClickListener {
            val moduleName = "¿Cómo generar minigráficos en Excel? | Gestión de la Información #19"
            val videoUrl = "https://goo.gl/wZB4VD"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        val btn20 = findViewById<Button>(R.id.btn20)
        // Definir la acción al hacer clic en btn4
        btn20.setOnClickListener {
            val moduleName = "Cinta y barra de menú rápida en Excel | Gestión de la Información #20"
            val videoUrl = "https://goo.gl/pj8wua"
            val databaseFileName = "Libro limpio Excel"
            val databaseUrl = "N/A"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        val btn21 = findViewById<Button>(R.id.btn21)
        // Definir la acción al hacer clic en btn4
        btn21.setOnClickListener {
            val moduleName = "Conoce todos los menús en la presentación de excel | Gestión de la Información #21"
            val videoUrl = "https://goo.gl/FtMcTZ"
            val databaseFileName = "Libro limpio Excel & BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        val btn22 = findViewById<Button>(R.id.btn22)
        // Definir la acción al hacer clic en btn4
        btn22.setOnClickListener {
            val moduleName = "Conoce todas las opciones de menú en Excel | Gestión de la Información #22"
            val videoUrl = "https://goo.gl/XxTo2b"
            val databaseFileName = "Libro limpio Excel"
            val databaseUrl = "N/A"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        val btn23 = findViewById<Button>(R.id.btn23)
        // Definir la acción al hacer clic en btn4
        btn23.setOnClickListener {
            val moduleName = "¿Cómo hacer consultas web desde Excel y generar Bases de Datos? | Gestión de la Información #23"
            val videoUrl = "https://goo.gl/XnXS9W"
            val databaseFileName = "CONSULTA_WEB"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/CONSULTA_WEB.XLSX"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        val btn24 = findViewById<Button>(R.id.btn24)
        // Definir la acción al hacer clic en btn4
        btn24.setOnClickListener {
            val moduleName = "Creación de Macros en Excel | Gestión de la Información #24"
            val videoUrl = "https://goo.gl/NhNsT3"
            val databaseFileName = "No 4.5 TABLA DINAMICA BD PERSONAL"
            val databaseUrl = "http://comunicaciones.poligran.edu.co/documentacion/No4-5-TABLA-DINAMICA-BD-PERSONAL.xlsm"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }
    }
}