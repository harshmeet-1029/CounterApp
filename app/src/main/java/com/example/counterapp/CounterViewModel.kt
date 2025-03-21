package com.example.counterapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel:ViewModel() {
    private var _count = mutableStateOf(0)
    val count:State<Int> = _count

    fun increment(){
        _count.value +=1
    }

    fun decremenet(){
        if(_count.value>0) _count.value-=1
    }
}
//https://chatgpt.com/share/67dcb11a-3194-8002-84b9-bed262c763cf
