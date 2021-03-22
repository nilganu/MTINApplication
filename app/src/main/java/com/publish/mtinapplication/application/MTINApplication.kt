package com.publish.mtinapplication.application

import android.app.Application

class MTINApplication : Application() {

    companion object {
        //Singleton Object
        private lateinit var singleton: MTINApplication

        fun getApplicationInstance(): MTINApplication = singleton
    }

    override fun onCreate() {
        super.onCreate()
        singleton = this
    }
}