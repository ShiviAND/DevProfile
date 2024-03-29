package com.example.broadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var receiver: AirplaneModeChangedReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //register our receiver, so that system knows we want to receive broadcast events

        receiver= AirplaneModeChangedReceiver()
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also{
            registerReceiver(receiver,it)
        }

    }

    override fun onStart() {
        super.onStart()
        unregisterReceiver(receiver)
    }
}