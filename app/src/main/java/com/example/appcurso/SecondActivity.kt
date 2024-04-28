package com.example.appcurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_xml)

        fun StartAct(moduleName: String, videoUrl: String, databaseFileName: String, databaseUrl: String )
        {
            val intent = Intent(this, VideoDetailActivity::class.java)
            intent.putExtra("module_name", moduleName.toString())
            intent.putExtra("video_url", videoUrl.toString())
            intent.putExtra("database_file_name", databaseFileName.toString())
            intent.putExtra("database_url", databaseUrl.toString())

            startActivity(intent)
        }
        // Configurar el clic del primer botón
        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            // Abrir VideoDetailActivity con los datos del primer módulo
            val moduleName = "Conceptos básicos de Bases de Datos en Excel"
            val videoUrl = "https://goo.gl/Rof9Yf"
            val databaseFileName = "No usa una base de datos como ejemplo"
            val databaseUrl = "N/A"

            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        // Aquí puedes agregar configuraciones similares para los otros botones, si es necesario

        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            val moduleName = "Conceptos básicos de Bases de Datos en Excel | Gestión de la Información #1 "
            val videoUrl = "https://goo.gl/iUF2rL"
            val databaseFileName = "No 1 EJEMPLO BD"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/No-1-EJEMPLO-BD.XLS"

            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }


        //boton 3
        val btn3 = findViewById<Button>(R.id.btn3)

        // Definir la acción al hacer clic en btn3
        btn3.setOnClickListener {
            val moduleName = "Diversos ejemplos de Bases de Datos en Excel | Gestión de la Información #3"
            val videoUrl = "https://goo.gl/baXcJW"
            val databaseFileName = "EJEMPLO_BANCOS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/EJEMPLO_BANCOS.XLSX"

            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        //btn4
        // Asociar el botón btn4 desde el diseño XML
        val btn4 = findViewById<Button>(R.id.btn4)

        // Definir la acción al hacer clic en btn4
        btn4.setOnClickListener {
            val moduleName = "¿Que es una Tabla Resumen en Excel y que es una Base de Datos? | Gestión de la Información #4"
            val videoUrl = "https://goo.gl/hj8vYo"
            val databaseFileName = "No 3 NO BD"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/No-3-NO-BD.XLS"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

    }
}
