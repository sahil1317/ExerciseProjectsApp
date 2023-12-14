package com.sahil.exerciseprojectsapp.views.adapter

import com.sahil.exerciseprojectsapp.R
import com.sahil.exerciseprojectsapp.base.BaseRecyclerAdapter
import com.sahil.exerciseprojectsapp.databinding.LayoutItemExerciseBinding
import javax.inject.Inject

class DashboardRecyclerAdapter @Inject constructor(): BaseRecyclerAdapter<LayoutItemExerciseBinding,String>() {
    private var itemClick: OnItemCallBack?=null
    override fun layoutId(): Int {
        return R.layout.layout_item_exercise
    }

    fun setOnItemClick(itemClick:OnItemCallBack){
     this.itemClick=itemClick
    }

    override fun onBindViewHolder(holder: BaseViewHolder<LayoutItemExerciseBinding>, position: Int) {
        holder.binding.model=list[position]
        holder.itemView.setOnClickListener {
            itemClick?.onClick(position)
        }
    }

    interface OnItemCallBack{
        fun onClick(position: Int)
    }


}