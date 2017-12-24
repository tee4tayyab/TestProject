package com.example.tee.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    Button b1;
    String Username;
    String Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.EditText1);
        e2 = (EditText) findViewById(R.id.EditText2);
        b1 = (Button) findViewById(R.id.Button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Username = e1.getText().toString();
                Password = e2.getText().toString();

                if (Username.equals("")|| Password.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter Username And Password", Toast.LENGTH_SHORT).show();
                }

                else if(Username.equals(Password))
                {
                    Toast.makeText(MainActivity.this, "Successfully Signed In", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Username And Password Donot match", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}
