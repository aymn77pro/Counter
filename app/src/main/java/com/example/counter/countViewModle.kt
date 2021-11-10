package com.example.counter

import androidx.lifecycle.ViewModel

class countViewModle : ViewModel() {

    private var _score = 0
    val score get() = _score

    fun plusOne(){
        _score = _score+1
    }
    fun TakeTwo(){
       if (_score<=2)  {
           _score = 0
       } else{
           _score = _score-2
       }
    }
    fun plusFour(){
        _score=_score+4
    }
}