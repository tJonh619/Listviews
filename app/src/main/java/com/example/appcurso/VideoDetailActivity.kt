package com.example.appcurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.net.Uri


class VideoDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_detail)

        // Obtener los datos pasados desde MainActivity
        val moduleName = intent.getStringExtra("module_name")
        val videoUrl = intent.getStringExtra("video_url")
        val databaseFileName = intent.getStringExtra("database_file_name")
        val databaseUrl = intent.getStringExtra("database_url")

        // Mostrar los datos en TextViews
        findViewById<TextView>(R.id.tvModuleName).text = "Module Name: $moduleName"
        findViewById<TextView>(R.id.tvVideoUrl).text = "Video URL: $videoUrl"
        findViewById<TextView>(R.id.tvDatabaseFileName).text = "Database File Name: $databaseFileName"
        findViewById<TextView>(R.id.tvDatabaseUrl).text = "Database URL: $databaseUrl"

        // Configurar clics para abrir enlaces
        findViewById<TextView>(R.id.tvVideoUrl).setOnClickListener {
            openUrl(videoUrl)
        }

        findViewById<TextView>(R.id.tvDatabaseUrl).setOnClickListener {
            openUrl(databaseUrl)
        }
    }

    private fun openUrl(url: String?) {
        if (!url.isNullOrBlank()) {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}
