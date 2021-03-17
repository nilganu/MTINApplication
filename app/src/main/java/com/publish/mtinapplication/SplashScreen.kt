package com.publish.mtinapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        var animutil=AnimationUtils.loadAnimation(applicationContext,R.anim.splashscreenanimation)
        var animutil1=AnimationUtils.loadAnimation(applicationContext,R.anim.splashscreenanimation2)
        var imageView=findViewById<ImageView>(R.id.imageView)
        var textView=findViewById<TextView>(R.id.textView)
        var textView1=findViewById<TextView>(R.id.textView1)
        imageView.animation=animutil
        textView.animation=animutil1
        textView1.animation=animutil1

        Handler().postDelayed(Runnable {
            var intent=Intent(applicationContext,LoginActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}