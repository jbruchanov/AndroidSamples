package com.scurab.android.features.dagger.hilt.di

import androidx.lifecycle.ViewModel
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class HiltViewModel @Inject constructor(val logger: Logger) : ViewModel() {

    init {
        logger.log("HiltViewModel")
    }
}