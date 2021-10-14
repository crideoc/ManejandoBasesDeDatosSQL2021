package com.example.manejandobasesdedatossql2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnGuardar,btnMostrar,btnBorrar,btnActualizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnActualizar=findViewById(R.id.btnActualizar);
        btnGuardar=findViewById(R.id.btnGuardar);
        btnBorrar=findViewById(R.id.btnBorrar);
        btnMostrar=findViewById(R.id.btnMostrar);


    }
}