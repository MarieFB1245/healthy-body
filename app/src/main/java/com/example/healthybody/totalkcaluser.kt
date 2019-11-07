package com.example.healthybody

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class totalkcaluser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_totalkcaluser)
    }
    fun start (v:View){
        val intent = Intent(this, homeuser::class.java)
        startActivity(intent)
    }

}
