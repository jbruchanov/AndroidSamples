package com.scurab.android.features.dagger.hilt.di

import android.util.Log
import javax.inject.Inject

class Logger @Inject constructor() {
    fun log(msg: String) {
        Log.d("Logger", msg)
    }
}