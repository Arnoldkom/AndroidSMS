package com.example.arnoldkom.sms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button valider = (Button) findViewById(R.id.valider);
        final TextView name=(TextView)findViewById(R.id.username);
        final TextView password=(TextView)findViewById(R.id.password);



        valider.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (name.getText().toString().trim().equals("bomen") && password.getText().toString().trim().equals("ulrich") ){


                        Intent intent =new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(intent);

                    Toast temp = Toast.makeText(MainActivity.this, "Bienvenue", Toast.LENGTH_LONG);
                    temp.show();

                }else if (name.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
                    Toast temp = Toast.makeText(MainActivity.this, "vérifier tous les champs svp", Toast.LENGTH_LONG);
                    temp.show();
                }else{
                    Toast temp = Toast.makeText(MainActivity.this, "vérifier les mots de passe", Toast.LENGTH_LONG);
                    temp.show();



                }
            }

        });


    }

}
