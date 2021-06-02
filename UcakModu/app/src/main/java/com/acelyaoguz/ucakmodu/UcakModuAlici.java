package com.acelyaoguz.ucakmodu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class UcakModuAlici extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Uçak modu çalıştı",Toast.LENGTH_LONG).show();
    }
}