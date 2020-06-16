package com.scurab.android.features.dagger.hilt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.scurab.android.features.dagger.hilt.di.ActivityDependency
import com.scurab.android.features.dagger.hilt.di.HiltViewModel
import com.scurab.android.features.dagger.hilt.di.INetworkAPI
import com.scurab.android.features.dagger.hilt.di.Logger
import com.scurab.android.features.dagger.hilt.di.NetworkAPI
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltActivity : AppCompatActivity() {

    @Inject
    lateinit var api: INetworkAPI

    @Inject
    lateinit var act: ActivityDependency

    @Inject
    lateinit var viewModel: HiltViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.logger.log("X")


        LinearLayout(this).also {
            it.orientation = LinearLayout.VERTICAL
            it.addView(Button(this@HiltActivity).apply {
                text = "Activity"
                setOnClickListener {
                    startActivity(Intent(this@HiltActivity, HiltActivity::class.java))
                }
            })
            repeat(2) { counter ->
                it.addView(Button(this@HiltActivity).apply {
                    text = "Fragment$counter"
                    setOnClickListener {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, HiltFragment())
                            .commit()
                    }
                })
            }
            it.addView(FrameLayout(this).also {
                it.id = R.id.fragment_container
            })
            setContentView(it)
        }
    }
}