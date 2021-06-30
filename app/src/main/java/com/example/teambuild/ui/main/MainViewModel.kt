package com.example.teambuild.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var _count: MutableLiveData<Int> = MutableLiveData(2)
    val count: LiveData<Int> = _count

    fun incCount(){
        _count.value = _count.value?.plus(1)
    }

    fun decCount() {
        _count.value = _count.value?.minus(1)
    }
}