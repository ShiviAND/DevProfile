package com.example.devprofile.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.devprofile.api.ApiInterface
import com.example.devprofile.model.Jokes

class MemesRepository(private val apiInterface: ApiInterface) {

    private val memesLiveData= MutableLiveData<Jokes>()

    val memes: LiveData<Jokes>
    get() = memesLiveData

    suspend fun getMemes(){
        val result= apiInterface.getJokes()
        if(result.body()!=null){
            memesLiveData.postValue(result.body())
        }
    }
}