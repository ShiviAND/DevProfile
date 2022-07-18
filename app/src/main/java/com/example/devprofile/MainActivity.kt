package com.example.devprofile

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.devprofile.api.ApiInterface
import com.example.devprofile.api.ApiUtilities
import com.example.devprofile.repository.MemesRepository
import com.example.devprofile.viewmodel.MemesViewModel
import com.example.devprofile.viewmodel.MemesViewModelFactory

class MainActivity : AppCompatActivity() {


    private lateinit var memesViewModel: MemesViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val apiInterface = ApiUtilities.getInstance().create(ApiInterface::class.java)
        val memesRepository = MemesRepository(apiInterface)

        memesViewModel = ViewModelProvider(
            this,
            MemesViewModelFactory(memesRepository)
        ).get(MemesViewModel::class.java)
        memesViewModel.memes.observe(this, {
            // Log.d("Shivi", "onCreate: ${it.toString()}")

            it.data.memes.iterator().forEach {
                Log.d("Shivi", "name: ${it.name}")
            }
        })

    }
}


