package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        val color = ContextCompat.getColor(this,R.color.red)
        println("color : "+color)

        var btn = findViewById<Button>(R.id.click)
        btn.setOnClickListener{
            Toast.makeText(this,"click!", Toast.LENGTH_SHORT).show()
        }
    }
}