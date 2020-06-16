package com.scurab.android.features.dagger.hilt.di

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class ActivityDependency @Inject constructor(@ApplicationContext val context: Context) {

    init {
        println(context)
    }
}