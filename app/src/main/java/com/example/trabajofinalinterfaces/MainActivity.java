package com.example.trabajofinalinterfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button login;
    Button  deMomento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");
        login=(Button)findViewById(R.id.btn_login);

        deMomento=(Button)findViewById(R.id.btn_register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sgtpestaña = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(sgtpestaña);
            }
        });

        deMomento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sgtpestañacuenta = new Intent(MainActivity.this,CuentaPersonal.class);
                startActivity(sgtpestañacuenta);
            }
        });
    }
}
