package com.example.aplicacioncotizacion

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.aplicacioncotizacion.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class MainActivity : aplicacioncotizacionCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

    }

}