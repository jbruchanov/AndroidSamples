package com.scurab.android.features.dagger.hilt

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.scurab.android.features.dagger.hilt.di.HiltFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltFragment : Fragment(R.layout.fragment) {

    @Inject
    lateinit var viewModel: HiltFragmentViewModel

    val testViewModel: TestViewModel by viewModels()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel.logger.log("Hovno")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

class TestViewModel : ViewModel() {

}