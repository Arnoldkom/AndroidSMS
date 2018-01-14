package com.example.arnoldkom.sms;

import android.Manifest;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.ActivityCompat;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.telephony.SmsManager;
import android.content.pm.PackageManager;

public class Main3Activity extends AppCompatActivity {

    TextView txtphoneNo ;
    TextView txtMessage ;
    String phoneNo;
    String message;
    private static final  int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    private static final String nb = "+237655369603";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button suivant = (Button) findViewById(R.id.suivant);
        Button rappelon = (Button) findViewById(R.id.rappelON);
        Button rappelof = (Button) findViewById(R.id.rappelOF);
        Button ventilateuron = (Button) findViewById(R.id.ventilateurON);
        Button ventilateurof = (Button) findViewById(R.id.ventilateurOF);
        Button cuisineon = (Button) findViewById(R.id.cuisineON);
        Button cuisineof = (Button) findViewById(R.id.cuisineOF);

        Button disjon = (Button) findViewById(R.id.disjoncteuron);
        Button disjof = (Button) findViewById(R.id.disjoncteurof);
        Button lumiereon = (Button) findViewById(R.id.lumiereon);
        Button lumiereof = (Button) findViewById(R.id.lumiereof);
        Button securiteon = (Button) findViewById(R.id.securiteon);
        Button securiteof = (Button) findViewById(R.id.securiteof);

       final String numero = "+237697603365";


        disjon.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(nb, null,"*DISJ ON#", null, null);

                Toast temp = Toast.makeText(Main3Activity.this, "Mise sous Tension du Domicile", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        disjof.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(nb, null,"*DISJ OFF#", null, null);

                Toast temp = Toast.makeText(Main3Activity.this, "Mise hors Tension du Domicile", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        lumiereon.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(nb, null,"*OUTSIDE ON#", null, null);

                Toast temp = Toast.makeText(Main3Activity.this, "Allumage de la lumiere exterieur", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        lumiereof.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(nb, null,"*OUTSIDE OFF#", null, null);

                Toast temp = Toast.makeText(Main3Activity.this, "Extinction de la lumiere exterieur", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        securiteof.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(nb, null,"*SECURITY ON#", null, null);

                Toast temp = Toast.makeText(Main3Activity.this, "Activation de la securité", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        securiteon.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(nb, null,"*SECURITY OFF#", null, null);

                Toast temp = Toast.makeText(Main3Activity.this, "Désactivation de la securité", Toast.LENGTH_LONG);
                temp.show();
            }

        });


        rappelon.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
              ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.SEND_SMS},1);
   SmsManager smsManager = SmsManager.getDefault();
    smsManager.sendTextMessage(nb, null, "*RADIO ON#", null, null);
    Toast temp = Toast.makeText(Main3Activity.this, "Allumage de la radio", Toast.LENGTH_LONG);
    temp.show();

            }

        });
        rappelof.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(nb, null,"*RADIO OFF#", null, null);
                Toast temp = Toast.makeText(Main3Activity.this, "Arrêt de la radio", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        ventilateurof.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(nb, null,"*FAN OFF#", null, null);

                Toast temp = Toast.makeText(Main3Activity.this, "Arrêt du ventilateur", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        ventilateuron.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(nb, null,"*FAN ON#", null, null);

                Toast temp = Toast.makeText(Main3Activity.this, "Mise en Marche du ventilateur", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        cuisineon.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(nb, null,"*KITCHEN ON#", null, null);

                Toast temp = Toast.makeText(Main3Activity.this, "Allumage dans la cuisine", Toast.LENGTH_LONG);
                temp.show();
            }

        });
        cuisineof.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                ActivityCompat.requestPermissions(Main3Activity.this,new String[]{Manifest.permission.SEND_SMS},1);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(nb, null,"*KITCHEN OFF#", null, null);
                Toast temp = Toast.makeText(Main3Activity.this, "Extinction dans la cuisine", Toast.LENGTH_LONG);
                temp.show();
            }

        });

        suivant.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(Main3Activity.this, Main5Activity.class);
                startActivity(intent);
            }

        });
            }


    @Override
    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {
        Toast.makeText(Main3Activity.this, "init send",
                Toast.LENGTH_LONG).show();
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(Main3Activity.this, "init send",
                            Toast.LENGTH_LONG).show();
                    SmsManager smsManager = SmsManager.getDefault();
                    Toast.makeText(Main3Activity.this, "begin send",
                            Toast.LENGTH_LONG).show();
                    smsManager.sendTextMessage(phoneNo, null, message, null, null);
                    Toast.makeText(Main3Activity.this, phoneNo,
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Main3Activity.this,
                            "SMS faild, please try again.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        }

    }


}
