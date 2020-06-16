package com.scurab.android.features.dagger.hilt.di

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject

@FragmentScoped
class HiltFragmentViewModel @Inject constructor(val logger: Logger) : ViewModel() {

    init {
        logger.log("HiltViewModel")
    }
}