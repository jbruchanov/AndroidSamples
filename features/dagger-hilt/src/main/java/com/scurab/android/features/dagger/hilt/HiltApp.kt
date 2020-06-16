package com.scurab.android.features.dagger.hilt

import android.app.Application
import com.scurab.android.features.dagger.hilt.di.INetworkAPI
import com.scurab.android.features.dagger.hilt.di.Logger
import com.scurab.android.features.dagger.hilt.di.NetworkAPI
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class HiltApp : Application() {

    @Inject
    lateinit var logger: Logger

    @Inject
    lateinit var network: INetworkAPI

    override fun onCreate() {
        super.onCreate()
    }
}