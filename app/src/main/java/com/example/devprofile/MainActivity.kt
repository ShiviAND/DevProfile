package com.example.devprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
//import com.example.devprofile.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_main);

        mainViewModel = ViewModelProvider(this, MainViewModelFactory(5))
            .get(MainViewModel::class.java)

        setText()

        button.setOnClickListener {
            incrementc()

        }




    }

    private fun incrementc() {
        mainViewModel.incrementcount()
        setText()
    }

    private fun setText() {
      tvtest.text=mainViewModel.count.toString()
    }




}