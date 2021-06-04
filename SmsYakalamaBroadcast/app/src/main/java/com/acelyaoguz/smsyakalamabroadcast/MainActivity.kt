package com.acelyaoguz.smsyakalamabroadcast

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filtre= IntentFilter("androidandroid.provider.Telephony.SMS_RECEIVED")
        val receiver=SmsReceiver()
        registerReceiver(receiver,filtre)

        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.RECEIVE_SMS,android.Manifest.permission.READ_SMS),1)
    }



    }