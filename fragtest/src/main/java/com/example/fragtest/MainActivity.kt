package com.example.fragtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class  MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count=1

        supportFragmentManager.addOnBackStackChangedListener {

            for(i in 0 until supportFragmentManager.backStackEntryCount){
                Log.d("MainActivity", supportFragmentManager.getBackStackEntryAt(i).name.toString())
            }

            Log.d("MainActivity", "---------------------------")
        }

        Pop.setOnClickListener {

            supportFragmentManager.popBackStack(etpop.text.toString(),0)
        }

        button.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.framelayout,Red()).addToBackStack("Red - ${count++}").commit()
        }

        button3.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.framelayout,Blue()).addToBackStack("Blue - ${count++}").commit()
        }

        button2.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.framelayout,Green()).addToBackStack("Green - ${count++}").commit()
        }

        button4.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.framelayout,Black()).addToBackStack("Black - ${count++}").commit()
        }

    }
}