package com.scurab.android.jetpackapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class JetPackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = this::class.java.simpleName
    }
}