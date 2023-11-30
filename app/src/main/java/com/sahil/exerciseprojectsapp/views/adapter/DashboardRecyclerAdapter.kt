package com.sahil.exerciseprojectsapp.views.adapter

import com.sahil.exerciseprojectsapp.R
import com.sahil.exerciseprojectsapp.base.BaseRecyclerAdapter
import com.sahil.exerciseprojectsapp.databinding.LayoutItemExerciseBinding
import javax.inject.Inject

class DashboardRecyclerAdapter @Inject constructor(): BaseRecyclerAdapter<LayoutItemExerciseBinding,String>() {
    override fun layoutId(): Int {
        return R.layout.layout_item_exercise
    }


    override fun onBindViewHolder(holder: BaseViewHolder<LayoutItemExerciseBinding>, position: Int) {
        holder.binding.model=list[position]
    }


}