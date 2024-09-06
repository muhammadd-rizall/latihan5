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

class suhu : AppCompatActivity() {

    private lateinit var etcelcius : EditText
    private lateinit var btnfahrenhit : Button
    private lateinit var btnkelvin : Button
    private lateinit var btnreamur: Button
    private lateinit var txtHasil : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suhu)

        etcelcius = findViewById(R.id.etcelcius)
        btnfahrenhit = findViewById(R.id.btnfahrenhit)
        btnkelvin = findViewById(R.id.btnkelvin)
        btnreamur = findViewById(R.id.btnreamur)
        txtHasil = findViewById(R.id.txtHasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnfahrenhit.setOnClickListener() {
            val hasil = (9 / 5) * etcelcius.text.toString().toInt() + 32
            txtHasil.setText("Hasil Konversinya = " + hasil)
        }

        btnkelvin.setOnClickListener() {
            val hasil = etcelcius.text.toString().toInt() + 273.15
            txtHasil.setText("Hasil Konversinya = " + hasil)
        }

        btnreamur.setOnClickListener() {
            val hasil = etcelcius.text.toString().toInt() * 0.8
            txtHasil.setText("Hasil Konversinya = " + hasil)
        }



    }
}