package com.example.viewpacerkotlin.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.viewpacerkotlin.MainViewModel
import com.example.viewpacerkotlin.R
import com.example.viewpacerkotlin.databinding.FragmentFirstBinding



class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        binding.plusBtn.setOnClickListener {
            viewModel.onIncrementClick()
            Log.d("tag", "clicked")
        }

        binding.minusBtn.setOnClickListener {
            viewModel.onItemDecrementClick()
        }

    }

}
