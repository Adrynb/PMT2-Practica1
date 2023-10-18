package com.example.pmt2_practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class numPrimo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num_primo)
    }

    private fun cal_primos(n:Int):ArrayList<Int>{
        var elementos = ArrayList<Int>()

        for(i in 1 < .. < n){

        }
    }

    private fun esPrimo(n:Int, divisor:Int):Boolean{

        if(divisor == 1){
            return true;
        }
        else if(n % divisor == 0){
            return false;
        }
        else{
            return esPrimo(n, divisor - 1)
        }

    }
}