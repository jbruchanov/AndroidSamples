package com.scurab.android.features.jetpack.camerax

import android.content.Context
import java.io.File

fun getOutputDirectory(context: Context, folder: String = "CameraX"): File {
    val mediaDir = context.externalMediaDirs.firstOrNull()?.let {
        File(it, folder).apply { mkdirs() }
    }
    return if (mediaDir != null && mediaDir.exists()) mediaDir else context.filesDir
}