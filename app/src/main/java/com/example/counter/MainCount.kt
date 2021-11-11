package com.example.counter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.counter.databinding.FragmentMainCountBinding

class MainCount : Fragment() {
private var _binding : FragmentMainCountBinding?=null
val binding  get() =  _binding

    private val viewModle : CountViewModle by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //_binding = FragmentMainCountBinding.inflate(inflater,container,false)
        _binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main_count,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       binding?.countViewModle = viewModle
        binding?.lifecycleOwner = viewLifecycleOwner


        binding?.addOne?.setOnClickListener {
            viewModle.plusOne()
        }
        binding?.add4?.setOnClickListener {
            viewModle.plusFour()

        }
        binding?.Take2?.setOnClickListener {
            viewModle.TakeTwo()

        }

        }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}