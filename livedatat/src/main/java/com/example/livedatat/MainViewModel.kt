package com.example.livedatat

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    private val livetext= MutableLiveData<String>("initial value")

     val livetextfetcher: LiveData<String>
         get() =livetext

    fun setText(){
        livetext.value="Privately Updated"
    }


}