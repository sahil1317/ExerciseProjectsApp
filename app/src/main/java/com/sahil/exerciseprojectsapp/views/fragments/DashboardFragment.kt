package com.sahil.exerciseprojectsapp.views.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.sahil.exerciseprojectsapp.R
import com.sahil.exerciseprojectsapp.base.BaseFragment
import com.sahil.exerciseprojectsapp.databinding.FragmentDashboardBinding
import com.sahil.exerciseprojectsapp.views.adapter.DashboardRecyclerAdapter
import com.sahil.exerciseprojectsapp.vm.DashboardVm
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject


@AndroidEntryPoint
class DashboardFragment : BaseFragment<FragmentDashboardBinding>() {

    @Inject
    lateinit var adapter:DashboardRecyclerAdapter

    private val viewModel:DashboardVm by viewModels()

    override fun layoutId(): Int {
        return R.layout.fragment_dashboard
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecycler()
        observeData()
    }

    private fun observeData() {
        viewModel.exerciseList.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
        viewModel.adapterItemSelected.observe(viewLifecycleOwner){fragment->
            Timber.e("DASHBOARD_ADAPTER_CLICK----------->       $fragment")
                    goNextFragment(fragment)

            }
        }


    private fun setRecycler() {
        binding?.exerciseRecycler?.adapter=adapter
        adapter.setOnItemClick(viewModel)

    }

}