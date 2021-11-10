package com.example.counter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.counter.databinding.FragmentMainCountBinding

class MainCount : Fragment() {
private var _binding : FragmentMainCountBinding?=null
val binding  get() =  _binding

    private val viewModle : countViewModle by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainCountBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        upDateScore()
        binding?.addOne?.setOnClickListener {
            viewModle.plusOne()
            upDateScore()
        }
        binding?.add4?.setOnClickListener {
            viewModle.plusFour()
            upDateScore()
        }
        binding?.Take2?.setOnClickListener {
            viewModle.TakeTwo()
            upDateScore()
        }

        }
    private fun upDateScore(){
        binding?.textView?.text = viewModle.score.toString()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}