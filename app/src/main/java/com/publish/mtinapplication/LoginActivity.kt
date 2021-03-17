package com.publish.mtinapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var btnLogin: Button =findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            var intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}