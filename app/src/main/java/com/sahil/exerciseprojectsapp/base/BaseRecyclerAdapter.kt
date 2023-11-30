package com.sahil.exerciseprojectsapp.base

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.sahil.exerciseprojectsapp.databinding.LayoutItemExerciseBinding

abstract class BaseRecyclerAdapter<R:ViewDataBinding,T>: RecyclerView.Adapter<BaseRecyclerAdapter.BaseViewHolder<R>>() {

     var list:ArrayList<T> = ArrayList()
    private var binding:R?=null

    abstract fun layoutId():Int
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<R> {
        binding=DataBindingUtil.inflate(LayoutInflater.from(parent.context),layoutId(),parent,false)
        return BaseViewHolder(binding!!)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun submitList(list:ArrayList<T>){
        this.list=list
        notifyDataSetChanged()
    }
    fun updateItem(item:T,position:Int){
        this.list.set(position,item)
        notifyItemChanged(position)
    }
    fun deleteItem(item:T,position:Int){
        this.list.remove(item)
        notifyItemRemoved(position)
    }


    class BaseViewHolder<R:ViewDataBinding>(val binding:R) : RecyclerView.ViewHolder(binding.root){
    }
}