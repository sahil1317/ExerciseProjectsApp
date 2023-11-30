package com.sahil.exerciseprojectsapp.base

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import timber.log.Timber.*


@HiltAndroidApp
class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        enableTimber()
    }

    private fun enableTimber() {
//        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
//        } else {
//            Timber.plant(CrashReportingTree())
//        }
    }
}