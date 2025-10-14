package com.example.ejemplopreferencias

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent

class ActivityMenu : AppCompatActivity() {

    lateinit var btn1: Button
    lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btn1 = findViewById(R.id.button1)
        btn2 = findViewById(R.id.button2)

        btn1.setOnClickListener {
            var intent = Intent(this@ActivityMenu, MainActivity::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            var intent = Intent(this@ActivityMenu, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}