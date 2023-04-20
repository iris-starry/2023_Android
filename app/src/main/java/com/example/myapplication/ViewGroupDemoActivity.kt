package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ViewGroupDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.linear_layout_demo)
        setContentView(R.layout.nested_viewgroup_demo)
        supportActionBar?.hide()
    }
}