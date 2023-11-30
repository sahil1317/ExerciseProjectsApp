package com.sahil.exerciseprojectsapp.base

import android.util.Log
import com.google.firebase.crashlytics.FirebaseCrashlytics
import timber.log.Timber


class CrashReportingTree : Timber.Tree() {
    protected override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return
        }
        FirebaseCrashlytics.getInstance().log(message)
        if (t != null) {
            if (priority == Log.ERROR) {
                FirebaseCrashlytics.getInstance().recordException(t)
            } else if (priority == Log.WARN) {
                FirebaseCrashlytics.getInstance().log(t.message.toString())
            }
        }
    }
}