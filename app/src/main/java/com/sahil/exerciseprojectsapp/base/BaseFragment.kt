package com.sahil.exerciseprojectsapp.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<T:ViewDataBinding> : Fragment() {
    var binding:T?=null

    abstract fun layoutId():Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)

        binding=DataBindingUtil.inflate(inflater,layoutId(),container,false)
    }
}