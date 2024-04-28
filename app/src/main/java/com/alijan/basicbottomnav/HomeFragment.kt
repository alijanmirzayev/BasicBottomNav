package com.alijan.basicbottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.alijan.basicbottomnav.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater)

        binding.buttonHome.setOnClickListener {
            val navigation = HomeFragmentDirections.actionHomeFragmentToDetailFragment(info = "Kecid baş verdi", info2 = "salam")
            Navigation.findNavController(it).navigate(navigation)
        }

        return binding.root
    }
}