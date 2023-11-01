package com.tmr9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.tmr9.R.*

class Login : ComponentActivity() {

    lateinit var btnLogin : Button
    lateinit var btnRegister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(layout.activity_login)

        btnLogin = findViewById(id.btnLogin)
        btnLogin.setOnClickListener {
            val intentlogin = Intent(this, MainActivity::class.java)
            startActivity(intentlogin)
        }

        btnRegister = findViewById(id.btnRegister)
        btnRegister.setOnClickListener {
            val intentregister = Intent(this, Register::class.java)
            startActivity(intentregister)
        }
    }
}