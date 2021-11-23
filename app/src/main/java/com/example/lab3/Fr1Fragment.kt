package com.example.lab3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lab3.databinding.FragmentFr1Binding


class Fr1Fragment : Fragment() {
    private val navigationController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFr1Binding.inflate(layoutInflater)

        binding.bnToSecond.setOnClickListener {
            navigationController.navigate(R.id.action_fr1Fragment_to_fr2Fragment)
        }
        return binding.root
    }


}