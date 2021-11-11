package com.example.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModle : ViewModel() {

    private val _score = MutableLiveData(0)
    val score:LiveData<Int> get() = _score

    fun plusOne(){
        _score.value = _score.value?.inc()
    }
    fun TakeTwo(){
       if (_score.value!!<=2)  {
           _score.value = 0
       } else{
           _score.value = (_score.value)?.minus(2)
       }
    }
    fun plusFour(){
        _score.value=_score.value?.plus(4)
    }
}