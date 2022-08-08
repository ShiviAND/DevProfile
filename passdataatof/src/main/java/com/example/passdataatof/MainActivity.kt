package com.example.passdataatof

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passdataatof.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)






        binding.btApply.setOnClickListener {

            val name=binding.etName.getText().toString()

            val age=if(binding.etAge.text.isNotEmpty())
            {
                binding.etAge.text.toString().toInt()
            }
            else{
                20
            }
            val coun=binding.etCountry.text.toString()
            val person=Person(name,age,coun)
            //Bundle().putSerializable("abc",person)
            Intent(this,SecondActivity::class.java).also {
                it.putExtra("person",person)

                startActivity(it)
            }
        }

    }
}