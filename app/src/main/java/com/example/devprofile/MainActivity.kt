package com.example.devprofile

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.devprofile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        val notesDao= NotesDatabase.getDatabase(applicationContext).notesDao()
        val notesRepository=NotesRepository(notesDao)
        val mainViewModel=ViewModelProvider(this,MainViewModelFactory(notesRepository)).get(MainViewModel::class.java)

        mainViewModel.getNotes().observe(this,{
            binding.tvTextView.text=it.toString()
        })

        binding.btButton.setOnClickListener{
            if(binding.tvTextEt.text!!.isEmpty()){
                binding.tvTextEt.error="Empty"
            }
            else{
                mainViewModel.insertNotes(Notes(0,binding.tvTextEt.text.toString()))
                Toast.makeText(this,"Done",Toast.LENGTH_SHORT).show()
                binding.tvTextEt.text=null
            }
        }




    }
}


