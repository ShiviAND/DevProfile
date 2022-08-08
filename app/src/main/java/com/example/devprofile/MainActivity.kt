package com.example.devprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.devprofile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.uio.text="You are Binded!!"
        binding.btnfragbinding.setOnClickListener {
            val myFragment=FragmentTest()
            val fragment:Fragment?=
            supportFragmentManager.findFragmentByTag(FragmentTest::class.java.simpleName)

            myFragment.arguments

            if(fragment !is FragmentTest){
               supportFragmentManager.beginTransaction().add(R.id.fragment_main,myFragment,FragmentTest::class.java.simpleName)
                   .commit()
            }

        }


    }


}