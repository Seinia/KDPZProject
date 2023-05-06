package com.example.kdpzproject.presentation.fragments.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.kdpzproject.R
import com.example.kdpzproject.databinding.FragmentFirstBinding
import com.example.kdpzproject.presentation.models.FirstCatDataSet
import com.xwray.groupie.GroupieAdapter

class FirstFragment: Fragment(R.layout.fragment_first) {

    lateinit var binding: FragmentFirstBinding

    private var adapter = GroupieAdapter()


    private lateinit var animeViewModel: FirstViewModel




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFirstBinding.bind(view)





        binding.RV1.adapter = adapter


        animeViewModel = ViewModelProvider(this).get(FirstViewModel::class.java)


        animeViewModel.catLiveData.observe(viewLifecycleOwner)
        {
            cat ->
            cat.forEach {
               adapter.add(FirstCatDataSet(it))
            }
        }




        adapter.setOnItemClickListener { item, _ ->
            var dataSet = item as FirstCatDataSet
            adapter.clear()
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(dataSet.cat))
        }
    }

}
