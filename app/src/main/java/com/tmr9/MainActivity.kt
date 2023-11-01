package com.tmr9

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    lateinit var tv_history : ImageView
    lateinit var tv_chatus : ImageView
    lateinit var tv_gallery : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_history = findViewById(R.id.tv_history)
        tv_history.setOnClickListener {
            val intentHistory = Intent(this, History::class.java)
            startActivity(intentHistory)
        }

        tv_chatus = findViewById(R.id.tv_chatus)
        tv_chatus.setOnClickListener {
            val intentChat = Intent(this, Chat::class.java)
            startActivity(intentChat)
        }

        tv_gallery = findViewById(R.id.tv_gallery)
        tv_gallery.setOnClickListener {
            val intentGallery = Intent(this, Gallery::class.java)
            startActivity(intentGallery)
        }
    }
}