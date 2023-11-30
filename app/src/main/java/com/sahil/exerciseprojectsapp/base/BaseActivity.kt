package com.sahil.exerciseprojectsapp.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.sahil.exerciseprojectsapp.R

abstract open class BaseActivity<T:ViewDataBinding> : AppCompatActivity() {
    var binding: T?=null

   abstract fun layoutId():Int
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,layoutId())
    }
}