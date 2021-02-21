package com.example.flipper

import android.app.Application

open class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        FlipperManager.instance.setup(applicationContext)
    }
}
