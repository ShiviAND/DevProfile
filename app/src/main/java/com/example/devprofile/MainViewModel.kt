package com.example.devprofile

import androidx.lifecycle.ViewModel

class MainViewModel(val initialval: Int): ViewModel() {
     var count= initialval

     fun incrementcount() {
        count++


    }

}