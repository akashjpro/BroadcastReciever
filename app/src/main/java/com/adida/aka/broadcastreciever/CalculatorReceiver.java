package com.adida.aka.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Aka on 7/12/2017.
 */

public class CalculatorReceiver extends BroadcastReceiver {
    public static final String ACTION_ADD = "com.adida.aka.broadcastsend.addSum";
    private static final String KEY_A = "keyA";
    private static final String KEY_B = "keyB";
    @Override
    public void onReceive(Context context, Intent intent) {
        switch (intent.getAction()){
            case ACTION_ADD:
                Bundle data = intent.getExtras();
                int numA = data.getInt(KEY_A);
                int numB = data.getInt(KEY_B);
                Toast.makeText(context, "sum: "+ (numA + numB), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
