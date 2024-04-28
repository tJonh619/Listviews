package com.example.appcurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnModule1 = findViewById<Button>(R.id.btnModule1)
        btnModule1.setOnClickListener {
            // Abrir la próxima actividad (SecondActivity)
            startActivity(Intent(this, SecondActivity::class.java))
        }

        val btnModule2 = findViewById<Button>(R.id.btnModule2)
        btnModule2.setOnClickListener {
            // Abrir la próxima actividad (SecondActivity)
            startActivity(Intent(this, ThreeActivity::class.java))
        }

        val btnModule3 = findViewById<Button>(R.id.btnModule3)
        btnModule3.setOnClickListener {
            // Abrir la próxima actividad (SecondActivity)
            startActivity(Intent(this, FourActivity::class.java))
        }

        val btnModule4 = findViewById<Button>(R.id.btnModule4)
        btnModule4.setOnClickListener {
            // Abrir la próxima actividad (SecondActivity)
            startActivity(Intent(this, FiveActivity::class.java))
        }
    }
}