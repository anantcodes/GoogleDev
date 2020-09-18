package com.anant.googledev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    lateinit var btnSearch:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSearch=findViewById(R.id.btnSearch)
        btnSearch.setOnClickListener {
            val intent = Intent(this, DisplayActivity::class.java)
            startActivity(intent)
        }
    }
}
