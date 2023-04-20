package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LifecycleDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle_demo)
    }

    override fun onStart() {
        super.onStart()
        Log.d("mytag","onResume")
    }

    override fun onResume() {
        super.onResume()
        Log.d("mytag","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("mytag","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("mytag","onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("mytag","ondestroy")
    }
}