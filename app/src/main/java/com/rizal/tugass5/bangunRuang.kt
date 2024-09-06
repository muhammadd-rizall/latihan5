package com.rizal.tugass5

import android.annotation.SuppressLint
import android.health.connect.datatypes.units.Volume
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class bangunRuang : AppCompatActivity() {
    private lateinit var etPanjang : EditText
    private lateinit var etLebar: EditText
    private lateinit var etTinggi : EditText
    private lateinit var btnLp : Button
    private lateinit var btnVolume: Button
    private lateinit var txthasil : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bangun_ruang)

        etPanjang = findViewById(R.id.etPanjang)
        etLebar = findViewById(R.id.etLebar)
        etTinggi = findViewById(R.id.etTinggi)
        btnLp = findViewById(R.id.btnLp)
        btnVolume = findViewById(R.id.btnVolume)
        txthasil = findViewById(R.id.txthasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLp.setOnClickListener() {
            val panjang = etPanjang.text.toString().toInt()
            val lebar = etLebar.text.toString().toInt()
            val tinggi = etTinggi.text.toString().toInt()
            val hasil = 2 * ( panjang * lebar + panjang * tinggi + lebar * tinggi )
            txthasil.setText("Luas Permukaan Balok adalah " + hasil)
        }

        btnVolume.setOnClickListener() {
            val panjang = etPanjang.text.toString().toInt()
            val lebar = etLebar.text.toString().toInt()
            val tinggi = etTinggi.text.toString().toInt()
            val hasil = panjang * lebar * tinggi
            txthasil.setText("Volume Balok adalah " + hasil)
        }
    }
}