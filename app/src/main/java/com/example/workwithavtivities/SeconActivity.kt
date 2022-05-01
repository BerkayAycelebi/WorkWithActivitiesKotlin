package com.example.workwithavtivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SeconActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secon)
    }

    fun PassActivity2(view:View)
    {
        val i= Intent(applicationContext,MainActivity::class.java)
        startActivity(i)
    }
}