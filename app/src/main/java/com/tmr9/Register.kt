package com.tmr9

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class Register : ComponentActivity() {

    lateinit var btnLogin : Button
    lateinit var btnRegister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intentlogin = Intent(this, Login::class.java)
            startActivity(intentlogin)
        }

        btnRegister = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener {
            val intentregister = Intent(this, Login::class.java)
            startActivity(intentregister)}
    }
}