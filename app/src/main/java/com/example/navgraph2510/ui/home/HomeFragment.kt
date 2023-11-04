package com.example.navgraph2510.ui.home

import BaseFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.navgraph2510.Car
import com.example.navgraph2510.Dog
import com.example.navgraph2510.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val arguments: HomeFragmentArgs = HomeFragmentArgs.fromBundle(requireArguments())
        var hello = arguments.helloImHomeFragment
        // var car : Car =arguments.car

        // val dog: Dog =arguments.bjork
        var textView: TextView = binding.textHome
        val txt = arguments.helloImHomeFragment
        homeViewModel.txt(txt)
        // homeViewModel.txt(dog.toString())
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it

        }
        homeViewModel.text1.observe(viewLifecycleOwner) {
            binding.textHome1.text = it
        }
        binding.button.setOnClickListener {
            val direction = HomeFragmentDirections.actionNavigationHomeToDetails2()
            homeViewModel.navigate(direction)
//            findNavController().navigate(direction)
        }
       observeNavigation( homeViewModel)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}