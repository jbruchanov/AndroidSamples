package com.scurab.android.features.dagger.hilt.di

import dagger.Binds
import dagger.BindsInstance
import dagger.Module
import dagger.Provides
import dagger.hilt.GeneratesRootInput
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@GeneratesRootInput
annotation class GenerateMyModule


@Module
@InstallIn(ApplicationComponent::class)
object Binding {
    @Provides
    fun binding(networkAPI: NetworkAPI) : INetworkAPI = networkAPI
}

@Module
@InstallIn(ApplicationComponent::class)
class SessionModule(val session: Session) {

}


class Session(val key: String)