package com.publish.mtinapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProviders
import com.publish.mtinapplication.entities.FormOne
import com.publish.mtinapplication.localstorage.viewmodel.FormOneViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class LoginActivity : AppCompatActivity() {

    private lateinit var formOneViewModel: FormOneViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var btnLogin: Button =findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            var intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            finish()

            //TODO:: Insert into Room Database
            /*formOneViewModel = ViewModelProviders.of(this).get(FormOneViewModel::class.java)

            val formData = FormOne(0, "A", "dg", "df", "sdf", "sdf", "sdf")

            GlobalScope.launch(Dispatchers.IO) {
                formOneViewModel.insertFormOneData(formData)
            }*/
        }
    }
}