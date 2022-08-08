package com.example.viewmodelchc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelchc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainViewModel=ViewModelProvider(this,MainViewModelFactory(5)).get(MainViewModel::class.java)
        binding.textView.text=""+mainViewModel.count

        binding.button.setOnClickListener {
            mainViewModel.increment()
            binding.textView.text=""+mainViewModel.count
        }

    }
}