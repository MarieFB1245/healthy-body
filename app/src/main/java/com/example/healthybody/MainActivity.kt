package com.example.healthybody

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b2 = findViewById(R.id.b2) as Button
        b2.setOnClickListener {
                val intent = Intent(this, Register::class.java)
            startActivity(intent)

        }
    }






}



