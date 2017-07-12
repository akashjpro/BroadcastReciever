package com.adida.aka.broadcastreciever;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CalculatorReceiver mCalculatorReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        mCalculatorReceiver = new CalculatorReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(CalculatorReceiver.ACTION_ADD);
        registerReceiver(mCalculatorReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mCalculatorReceiver);
    }
}
