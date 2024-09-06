package com.rizal.tugass5

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnsuhu : Button
    private lateinit var btnDiskon : Button
    private lateinit var btnbangun : Button
    private lateinit var btnbilangan :Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnsuhu = findViewById(R.id.btnsuhu)
        btnDiskon = findViewById(R.id.btnDiskon)
        btnbangun = findViewById(R.id.btnbangun)
        btnbilangan = findViewById(R.id.btnbilangan)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnsuhu.setOnClickListener(){
            val intent = Intent(this@MainActivity,suhu::class.java)
            startActivity(intent)
        }
       btnDiskon.setOnClickListener(){
           val intent = Intent(this@MainActivity,totalBelanja::class.java)
           startActivity(intent)
       }

        btnbangun.setOnClickListener(){
            val intent = Intent(this@MainActivity,bangunRuang::class.java)
            startActivity(intent)
        }
        btnbilangan.setOnClickListener(){
            val intent = Intent(this@MainActivity, GanjilGenap::class.java)
            startActivity(intent)
        }
    }
}