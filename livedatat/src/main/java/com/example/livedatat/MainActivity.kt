package com.example.livedatat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.livedatat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.livetextfetcher.observe(this, Observer {

            binding.textView.text=it
        })

        binding.button.setOnClickListener {
            mainViewModel.setText()
        }

    }
}