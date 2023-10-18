package com.example.pmt2_practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var ANB: Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ANB = 0

        Log.i("Estados", "Creando la actividad: " + ANB)
        Log.i("Estados", "Evento onCreate: " + ANB)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        ANB++
        Log.i("Estados", "Evento onStart: " + ANB)
    }

    override fun onResume() {
        super.onResume()
        ANB++
        Log.i("Estados", "Evento onResume: " + ANB)
    }

    override fun onStop() {
        super.onStop()
        ANB++
        Log.i("Estados", "Evento onStop: " + ANB)
    }

    override fun onDestroy() {
        super.onDestroy()
        ANB++
        Log.i("Estados", "Evento onDestroy: " + ANB)
    }

}