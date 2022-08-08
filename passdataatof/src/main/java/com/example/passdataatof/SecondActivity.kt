package com.example.passdataatof

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passdataatof.databinding.ActivityMainBinding
import com.example.passdataatof.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val person=intent.getSerializableExtra("person") as Person

        person.apply {
            binding.textView.text=person.toString()}


    }
}