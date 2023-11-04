package com.example.navgraph2510.ui.home

import BaseFragment
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navgraph2510.R
import com.example.navgraph2510.databinding.FragmentDetails2Binding

class Details : BaseFragment() {

    companion object {
        fun newInstance() = Details()
    }

    private lateinit var viewModel: DetailsViewModel
    private lateinit var binding: FragmentDetails2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this)[DetailsViewModel::class.java]
        observeNavigation(viewModel)
//        observeNavigation(viewModel)
     binding = FragmentDetails2Binding.inflate(inflater, container, false)
        binding.button4.setOnClickListener {
            viewModel.navigateBack()
            findNavController().navigateUp()
        }

        return binding.root
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)
//        // TODO: Use the ViewModel
//    }

}

