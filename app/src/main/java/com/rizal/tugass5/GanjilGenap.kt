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

class GanjilGenap : AppCompatActivity() {
    private lateinit var etangaka : EditText
    private lateinit var btnchek : Button
    private lateinit var txtHasilcheck : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ganjil_genap)

        etangaka = findViewById(R.id.etangka)
        btnchek = findViewById(R.id.btnchek)
        txtHasilcheck = findViewById(R.id.txtHasilchek)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnchek.setOnClickListener() {

                val angka = etangaka.text.toString().toInt()

                if ( angka % 2 == 0 ) {
                    txtHasilcheck.setText("Bilangan " + angka + " adalah bilangan genap")
                } else {
                    txtHasilcheck.setText("Bilangan " + angka + " adalah bilangan ganjil")
                }


        }
    }
}