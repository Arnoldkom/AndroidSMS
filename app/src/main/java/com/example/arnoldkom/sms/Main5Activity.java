package com.example.arnoldkom.sms;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        final Handler handler =new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent =new Intent(Main5Activity.this, Main4Activity.class);
                startActivity(intent);
                finish();
            }
        },3000L);
    }

}
