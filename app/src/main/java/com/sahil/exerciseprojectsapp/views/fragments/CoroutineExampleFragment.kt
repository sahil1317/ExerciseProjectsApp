package com.sahil.exerciseprojectsapp.views.fragments

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import com.sahil.exerciseprojectsapp.R
import com.sahil.exerciseprojectsapp.base.BaseFragment
import com.sahil.exerciseprojectsapp.databinding.FragmentCoroutineExampleBinding
import timber.log.Timber


class CoroutineExampleFragment : BaseFragment<FragmentCoroutineExampleBinding>() ,OnClickListener{


    override fun layoutId(): Int {
        return R.layout.fragment_coroutine_example
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewOnClick()
    }

    private fun setViewOnClick() {
        binding?.BtnClick?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0){
            binding?.BtnClick->{
                Timber.e("process Start   Thread ${Thread.currentThread().name}")
                binding?.BtnClick?.isEnabled=false
                operationOne()
                operationTwo()
                operationThree()
                operationFour()
                binding?.BtnClick?.isEnabled=true
                Timber.e("process Complete  Thread ${Thread.currentThread().name}")
            }
        }
    }

    fun operationOne(){
        Thread{
            Timber.e("operation operationOne Start   Thread ${Thread.currentThread().name}")
            var value=9000000000000
            while (value!= 0.toLong()){
                value--
            }
            Timber.e("operation one completed    Thread ${Thread.currentThread().name}")
        }.start()

    }
    fun operationTwo(){
        Thread {
            Timber.e("operation operationTwo Start    Thread ${Thread.currentThread().name}")
            var value = 9000000000000
            while (value != 0.toLong()) {
                value--
            }
            Timber.e("operation operationTwo completed   Thread ${Thread.currentThread().name}")
        }.start()
    }
    fun operationThree(){
        Thread {
            Timber.e("operation operationThree Start   Thread ${Thread.currentThread().name}")
            var value = 9000000000000
            while (value != 0.toLong()) {
                value--
            }
            Timber.e("operation operationThree completed   Thread ${Thread.currentThread().name}")
        }.start()
    }
    fun operationFour(){
        Thread {

            Timber.e("operation operationFour Start     Thread ${Thread.currentThread().name}")
            var value = 9000000000000
            while (value != 0.toLong()) {
                value--
            }
            Timber.e("operation operationFour completed        Thread ${Thread.currentThread().name}")
        }.start()
    }

}