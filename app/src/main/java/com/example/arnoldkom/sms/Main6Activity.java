package com.example.arnoldkom.sms;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {


    TextView txtphoneNo ;
    TextView txtMessage ;
    String phoneNo;
    String message;
    private static final  int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button precedent2 = (Button) findViewById(R.id.precedent2);
        Button alarmeon = (Button) findViewById(R.id.alarmeon);
        Button alarmeof = (Button) findViewById(R.id.alarmeof);


        alarmeon.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main6Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage("+237655369603", null,"*ALARME ON#", null, null);

                Toast temp = Toast.makeText(Main6Activity.this, "Activation de Alarme", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        alarmeof.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main6Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage("+237655369603", null,"*ALARME OFF#", null, null);

                Toast temp = Toast.makeText(Main6Activity.this, "Desactivation de Alarme", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        precedent2.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent =new Intent(Main6Activity.this, Main5Activity.class);
                startActivity(intent);
            }

        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {
        Toast.makeText(Main6Activity.this, "init send",
                Toast.LENGTH_LONG).show();
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(Main6Activity.this, "init send",
                            Toast.LENGTH_LONG).show();
                    SmsManager smsManager = SmsManager.getDefault();
                    Toast.makeText(Main6Activity.this, "begin send",
                            Toast.LENGTH_LONG).show();
                    smsManager.sendTextMessage(phoneNo, null, message, null, null);
                    Toast.makeText(Main6Activity.this, phoneNo,
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Main6Activity.this,
                            "SMS faild, please try again.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        }

    }
}
