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

public class Main4Activity extends AppCompatActivity {

    TextView txtphoneNo ;
    TextView txtMessage ;
    String phoneNo;
    String message;
    private static final  int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    private static final String numero = "+237655369603";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        Button lumiere1on = (Button) findViewById(R.id.lumiere1on);
        Button lumiere1of = (Button) findViewById(R.id.lumiere1of);
        Button chambreon = (Button) findViewById(R.id.chambreon);
        Button chambreof = (Button) findViewById(R.id.chambreof);
        Button autreon = (Button) findViewById(R.id.autreon);
        Button autreof = (Button) findViewById(R.id.autreof);
        Button alarmeon = (Button) findViewById(R.id.alarmeon);
        Button alarmeof = (Button) findViewById(R.id.alarmeof);

        final String numero12 = "+237697603365";


        alarmeon.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main4Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(numero, null,"*ALARME ON#", null, null);

                Toast temp = Toast.makeText(Main4Activity.this, "Activation de Alarme", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        alarmeof.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main4Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(numero, null,"*ALARME OFF#", null, null);

                Toast temp = Toast.makeText(Main4Activity.this, "Arrêt de Alarme", Toast.LENGTH_LONG);
                temp.show();
            }

        });

        lumiere1on.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main4Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(numero, null,"*ROOM ON#", null, null);

                Toast temp = Toast.makeText(Main4Activity.this, "Allumage au Salon", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        lumiere1of.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main4Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(numero, null,"*ROOM OFF#", null, null);

                Toast temp = Toast.makeText(Main4Activity.this, "Extinction au Salon", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        chambreon.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main4Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(numero, null,"*BED ON#", null, null);

                Toast temp = Toast.makeText(Main4Activity.this, "Allumage dans la chambre", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        chambreof.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main4Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(numero, null,"*BED OFF#", null, null);

                Toast temp = Toast.makeText(Main4Activity.this, "Extinction dans la Chambre", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        autreof.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main4Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(numero, null,"*PORTAIL OFF#", null, null);

                Toast temp = Toast.makeText(Main4Activity.this, "Fermeture du Portail", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        autreon.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main4Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(numero, null,"*PORTAIL ON#", null, null);

                Toast temp = Toast.makeText(Main4Activity.this, "Ouverture du Portail", Toast.LENGTH_LONG);
                temp.show();
            }

        });





        Button precedent = (Button) findViewById(R.id.precedent);

        precedent.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(Main4Activity.this, Main3Activity.class);
                startActivity(intent);
            }

        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {
        Toast.makeText(Main4Activity.this, "init send",
                Toast.LENGTH_LONG).show();
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(Main4Activity.this, "init send",
                            Toast.LENGTH_LONG).show();
                    SmsManager smsManager = SmsManager.getDefault();
                    Toast.makeText(Main4Activity.this, "begin send",
                            Toast.LENGTH_LONG).show();
                    smsManager.sendTextMessage(phoneNo, null, message, null, null);
                    Toast.makeText(Main4Activity.this, phoneNo,
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Main4Activity.this,
                            "SMS faild, please try again.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        }

    }
}
