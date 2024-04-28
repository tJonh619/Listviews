package com.example.appcurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThreeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        fun StartAct(moduleName: String, videoUrl: String, databaseFileName: String, databaseUrl: String )
        {
            val intent = Intent(this, VideoDetailActivity::class.java)
            intent.putExtra("module_name", moduleName.toString())
            intent.putExtra("video_url", videoUrl.toString())
            intent.putExtra("database_file_name", databaseFileName.toString())
            intent.putExtra("database_url", databaseUrl.toString())

            startActivity(intent)
        }
        // Definir la acción al hacer clic en btn4

        // Configurar el clic del primer botón
        val btn5 = findViewById<Button>(R.id.btn5)
        btn5.setOnClickListener {
            // Abrir VideoDetailActivity con los datos del primer módulo
            val moduleName = "¿Cómo ingresar datos en una Base de Datos de Excel? | Gestión de la Información #5"
            val videoUrl = "https://goo.gl/5kEcGd"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"


            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
            // Iniciar la actividad VideoDetailActivity con los datos del cuarto módulo
        }

        // Aquí puedes agregar configuraciones similares para los otros botones, si es necesario

        val btn6 = findViewById<Button>(R.id.btn6)
        btn6.setOnClickListener {
            val moduleName = "Aprende a ordenar Bases de Datos en Excel | Gestión de la Información #6"
            val videoUrl = "https://goo.gl/eGZ5j9"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"

            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }


        //boton 7
        val btn7 = findViewById<Button>(R.id.btn7)

        // Definir la acción al hacer clic en btn3
        btn7.setOnClickListener {
            val moduleName = "¿Cómo generar subtotales en una Base de Datos en Excel? | Gestión de la Información #7"
            val videoUrl = "https://goo.gl/cq9NGR"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX\t\t\t\n"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del tercer módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        //btn8
        // Asociar el botón btn4 desde el diseño XML
        val btn8 = findViewById<Button>(R.id.btn8)

        // Definir la acción al hacer clic en btn4
        btn8.setOnClickListener {
            val moduleName = "¿Cómo se generan autofiltros en una Base de Datos en Excel? | Gestión de la Información #8"
            val videoUrl = "https://goo.gl/Zcm4r6"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }


        // Asociar el botón btn4 desde el diseño XML
        val btn9 = findViewById<Button>(R.id.btn9)

        // Definir la acción al hacer clic en btn4
        btn9.setOnClickListener {
            val moduleName = "¿Cómo crear un filtro avanzado en una Base de Datos en Excel? | Gestión de la Información #9"
            val videoUrl = "https://goo.gl/z6Nzwu"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

        // Asociar el botón btn4 desde el diseño XML
        val btn10 = findViewById<Button>(R.id.btn10)

        // Definir la acción al hacer clic en btn4
        btn10.setOnClickListener {
            val moduleName = "Aprende a validar datos en Excel | Gestión de la Información #10"
            val videoUrl = "https://goo.gl/JyMCeE"
            val databaseFileName = "BD_VENTAS"
            val databaseUrl = "https://www.poli.edu.co/sites/default/files/basesdatos/BD_VENTAS.XLSX"

            // Crear un intent para abrir VideoDetailActivity y pasar los datos del cuarto módulo
            StartAct(moduleName, videoUrl, databaseFileName, databaseUrl)
        }

    }
}