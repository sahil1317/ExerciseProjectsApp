package com.sahil.exerciseprojectsapp.views.fragments

import android.os.Bundle
import android.view.View
import com.sahil.exerciseprojectsapp.R
import com.sahil.exerciseprojectsapp.base.BaseFragment
import com.sahil.exerciseprojectsapp.databinding.FragmentDashboardBinding


class DashboardFragment : BaseFragment<FragmentDashboardBinding>() {
    override fun layoutId(): Int {
        return R.layout.fragment_dashboard
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}