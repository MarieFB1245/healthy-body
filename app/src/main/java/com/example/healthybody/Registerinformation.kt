package com.example.healthybody

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.time.Instant

class Registerinformation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registerinformation)
    }

    fun register (v:View){
        val intent = Intent(this, totalkcaluser::class.java)
        startActivity(intent)
    }

}
