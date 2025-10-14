package com.example.ejemplopreferencias

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.content.Intent


class MainActivity : AppCompatActivity() {

    lateinit var edt1: EditText
    lateinit var edt2: EditText
    lateinit var btn1: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        edt1 = findViewById(R.id.editText1)
        edt2 = findViewById(R.id.editText2)
        btn1 = findViewById(R.id.button1)

        btn1.setOnClickListener {
            var intent = Intent(this@MainActivity, MainActivity2::class.java)

            intent.putExtra("matr", edt1.text.toString())
            intent.putExtra("nom", edt2.text.toString())

            startActivity(intent)
        }

    }
}