package com.example.dummy_kotlin_project

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btn_show_toast).setOnClickListener {
            Toast.makeText(this, getString(R.string.some_text), Toast.LENGTH_LONG).show()
        }
    }
}