package com.scurab.android.features.dagger.hilt.di

import javax.inject.Inject
import javax.inject.Singleton

interface INetworkAPI {
    fun something(): String
}

@Singleton
class NetworkAPI @Inject constructor() : INetworkAPI {
    override fun something(): String {
        return "NetworkAPI"
    }
}