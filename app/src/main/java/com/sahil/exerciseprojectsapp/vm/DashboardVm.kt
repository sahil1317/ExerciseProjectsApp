package com.sahil.exerciseprojectsapp.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sahil.exerciseprojectsapp.R
import com.sahil.exerciseprojectsapp.views.adapter.DashboardRecyclerAdapter
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class DashboardVm @Inject constructor():ViewModel() ,DashboardRecyclerAdapter.OnItemCallBack{


    var exerciseList:MutableLiveData<ArrayList<String>> = MutableLiveData()
    private var _adapterItemSelected:MutableLiveData<Int> = MutableLiveData()
     var adapterItemSelected:LiveData<Int> = _adapterItemSelected



    init {
        fetchExerciseList()
    }
  private  fun fetchExerciseList(){
        val list= ArrayList<String>()
        list.add("Coroutine Example")
        list.add("Multithreading")

        exerciseList.postValue(list)
    }

    override fun onClick(position: Int) {
        when(position){
            0->{
                _adapterItemSelected.postValue(R.id.action_dashboardFragment_to_coroutineExampleFragment)
            }
        }

    }

}