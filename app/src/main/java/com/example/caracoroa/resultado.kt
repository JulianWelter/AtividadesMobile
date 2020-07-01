package com.example.caracoroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val dados: Bundle?=intent.extras
        val numero =dados?.getInt("numero")
        if(numero==0){
            imgResultado.setImageResource(R.drawable.moeda_cara)
        }
        else{
            imgResultado.setImageResource(R.drawable.moeda_coroa)
        }
        voltar.setOnClickListener{
            finish()
        }
    }
}