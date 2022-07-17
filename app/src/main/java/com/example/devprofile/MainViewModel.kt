package com.example.devprofile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

     var mtext=MutableLiveData<String>()
     var btntext=MutableLiveData<String>()

//    val mtext:LiveData<String>
//        get() = _mtext
//    val btntext:LiveData<String>
//        get() = _btntext

    init {
        mtext.value="1st text"
        btntext.value="1st button text"
    }

    fun updateText(){
         mtext.value="2nd hai ye wala"
         btntext.value="2nd button text"
    }
}