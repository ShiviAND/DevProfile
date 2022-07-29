package com.example.servicesinandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.servicesinandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btstart.setOnClickListener {
                startService(Intent(this@MainActivity,MyService::class.java))
            }

            btstop.setOnClickListener {
                stopService(Intent(this@MainActivity,MyService::class.java))
            }
        }

    }
}