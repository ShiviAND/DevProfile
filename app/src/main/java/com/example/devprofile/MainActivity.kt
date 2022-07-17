package com.example.devprofile

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.devprofile.api.ApiInterface
import com.example.devprofile.api.ApiUtilities
import com.example.devprofile.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val usersApi = ApiUtilities.getInstance().create(ApiInterface::class.java)

        GlobalScope.launch {
            val result = usersApi.getUsers()

            if (result.body() != null) {
               // Log.d("Shivi", "onCreate: ${result.body()}")


                result.body()!!.forEach {
                    Log.d("Shivi", "name: ${it.login}")
                }
            }

        }


    }


}


