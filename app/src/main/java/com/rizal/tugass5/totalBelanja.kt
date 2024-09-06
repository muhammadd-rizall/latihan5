package com.rizal.tugass5

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class totalBelanja : AppCompatActivity() {
    private lateinit var etTtlBelanja : EditText
    private lateinit var btninput : Button
    private lateinit var ttlBelanjaSetealhDiskon : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_total_belanja)

        etTtlBelanja = findViewById(R.id.etTtlBelanja)
        btninput = findViewById(R.id.btninput)
        ttlBelanjaSetealhDiskon = findViewById(R.id.ttlBelanjaSetelahDiskon)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btninput.setOnClickListener() {
            val totalBelanja = etTtlBelanja.text.toString().toInt()

            if ( totalBelanja >= 100000 && totalBelanja <= 500000 ) {
                val diskon = etTtlBelanja.text.toString().toInt() * 0.1
                ttlBelanjaSetealhDiskon.setText("Diskon anda sebesar " + diskon)
            } else if ( totalBelanja > 500000 && totalBelanja <= 1000000 ) {
                val diskon = etTtlBelanja.text.toString().toInt() * 0.2
                ttlBelanjaSetealhDiskon.setText("Diskon anda sebesar " + diskon)
            } else if ( totalBelanja > 1000000 ) {
                val diskon = etTtlBelanja.text.toString().toInt() * 0.3
                ttlBelanjaSetealhDiskon.setText("Diskon anda sebesar " + diskon)
            } else {
                ttlBelanjaSetealhDiskon.setText("Anda tidak mendapatkan diskon")
            }

        }
    }
}