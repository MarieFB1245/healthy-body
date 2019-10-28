package com.example.healthybody

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button1 = findViewById(R.id.button1) as Button
        button1.setOnClickListener {
            val intent = Intent(this, Registerinformation::class.java)
            startActivity(intent)

        }
    }
}
