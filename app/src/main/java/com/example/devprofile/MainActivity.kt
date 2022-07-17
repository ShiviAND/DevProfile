package com.example.devprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.devprofile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)

        binding.mainViewModel=mainViewModel
        binding.lifecycleOwner=this

//       mainViewModel.mtext.observe(this, Observer {
//           binding.tvBinding.text=it.toString()
//       })
//
//        mainViewModel.btntext.observe(this, Observer {
//            binding.button.text=it.toString()
//        })
//
//        binding.button.setOnClickListener{
//            mainViewModel.updateText()
//
//        }

        }




}


