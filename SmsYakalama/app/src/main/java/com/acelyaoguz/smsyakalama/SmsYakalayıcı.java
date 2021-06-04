package com.acelyaoguz.smsyakalama;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class SmsYakalayıcı extends BroadcastReceiver {

    SmsManager sms=SmsManager.getDefault();

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bundle=intent.getExtras();

        Object[] pdusObj=(Object[])bundle.get("pdus");

        for(int i=0 ; i<pdusObj.length ; i++){

            SmsMessage guncelSms = SmsMessage.createFromPdu((byte[])pdusObj[i]);

            String telNo=guncelSms.getDisplayOriginatingAddress();
            String mesaj=guncelSms.getDisplayMessageBody();

            Toast.makeText(context,"Tel No:" + telNo + "Sms:" + mesaj, Toast.LENGTH_LONG).show();


        }

    }
}