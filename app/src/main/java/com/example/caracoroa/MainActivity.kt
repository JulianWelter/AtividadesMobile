package com.example.caracoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        jogar.setOnClickListener{
            val intent=Intent(applicationContext,resultado::class.java)
            val numero= Random().nextInt(2)
            intent.putExtra("numero",numero)
            startActivity(intent)
        }
    }
}