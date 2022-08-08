package com.example.viewmodelchc

import androidx.lifecycle.ViewModel

class MainViewModel(val initailValue:Int): ViewModel() {

    var count:Int=initailValue

    fun increment(){
        count++
    }

}