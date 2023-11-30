package com.sahil.exerciseprojectsapp.views.activities

import android.os.Bundle
import androidx.activity.viewModels
import com.sahil.exerciseprojectsapp.R
import com.sahil.exerciseprojectsapp.base.BaseActivity
import com.sahil.exerciseprojectsapp.databinding.ActivityMainBinding
import com.sahil.exerciseprojectsapp.vm.MainActivityVm
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val vm:MainActivityVm by viewModels()
    override fun layoutId(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}