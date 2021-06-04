package com.acelyaoguz.smsyakalamabroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.SmsMessage

class SmsReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        if(intent.extras!=null)
        {
            (intent.extras!!["pdus"]as Array<Any>?)?.let{
                var smsMetni=""
                var sms:SmsMessage?=null

                for(pdu in it)
                {
                    sms= SmsMessage.createFromPdu(pdu as ByteArray)
                    smsMetni+=sms.messageBody
                }

                var gonderen:String?=sms!!.originatingAddress //gonderici yakalama

            }
        }

    }
}