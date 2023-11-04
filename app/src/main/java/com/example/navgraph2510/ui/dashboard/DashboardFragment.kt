package com.example.navgraph2510.ui.dashboard

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
import com.example.navgraph2510.databinding.FragmentDashboardBinding

class DashboardFragment : BaseFragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {



        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)
        observeNavigation(dashboardViewModel)

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        binding.buttonDashboard.setOnClickListener{
//            findNavController().navigate(R.id.navigation_home)
//            findNavController().navigate(R.id.action_navigation_dashboard_to_navigation_home)
            val txt = binding.editText.text.toString()
            val car = Car(txt,100)
            var dog:Dog=Dog("BjorecForeverYoung",11)
            var action
            =DashboardFragmentDirections.actionNavigationDashboardToNavigationHome(car)



            action.helloImHomeFragment=txt
            action.bye
            action.iAmHomeFragment

         //   findNavController().navigate(action)
            dashboardViewModel.navigate(action)


//            findNavController().navigate(action)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}