package com.tmr9

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity

class Gallery : ComponentActivity() {

    private lateinit var btnBackGallery: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        btnBackGallery = findViewById(R.id.btnBackGallery)
        btnBackGallery.setOnClickListener {
            val intentBackGallery = Intent(this, MainActivity::class.java)
            startActivity(intentBackGallery)
        }
    }
}