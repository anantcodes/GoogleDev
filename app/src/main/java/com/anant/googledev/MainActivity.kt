package com.anant.googledev

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var btnSearch:Button
    lateinit var txtIDE:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSearch=findViewById(R.id.btnSearch)
        txtIDE=findViewById(R.id.txtIDE)





        btnSearch.setOnClickListener {
            val intent = Intent(this, DisplayActivity::class.java)
            startActivity(intent)
        }



        txtIDE.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://ideone.com")))
        }


    }
}
