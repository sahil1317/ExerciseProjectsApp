package com.sahil.exerciseprojectsapp.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class DashboardVm @Inject constructor():ViewModel() {
    var exerciseList:MutableLiveData<ArrayList<String>> = MutableLiveData()


    init {
        fetchExerciseList()
    }
  private  fun fetchExerciseList(){
        val list= ArrayList<String>()
        list.add("Multithreading")

        exerciseList.postValue(list)
    }

}