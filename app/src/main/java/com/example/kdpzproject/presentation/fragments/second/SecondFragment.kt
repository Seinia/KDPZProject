package com.example.kdpzproject.presentation.fragments.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.kdpzproject.R
import com.example.kdpzproject.databinding.FragmentSecondBinding


class SecondFragment : Fragment(R.layout.fragment_second) {


    val args: SecondFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val binding = FragmentSecondBinding.bind(view)

        binding.tvnamecat2.text = args.catData.fact
        binding.tvdesccat2.text = args.catData.length.toString()


        binding.btnback.setOnClickListener {
            findNavController().popBackStack()
        }
    }



}