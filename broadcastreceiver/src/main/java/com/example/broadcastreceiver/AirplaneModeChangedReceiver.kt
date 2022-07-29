package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReceiver:BroadcastReceiver() {

    //runs when user changes airplane mode
    //when broadcast is sent by system, it is sent with intent
    //system will check which apps want to be notified about this change, then
    //system will send intent to those apps
    // here this intent contains information about airplane mode is enabled/disabled
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeEnabled= intent?.getBooleanExtra("state", false) ?:return
        if (isAirplaneModeEnabled){
            Toast.makeText(context, "Airplane mode enabled", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(context, "Airplane mode disabled", Toast.LENGTH_LONG).show()
        }
    }
}