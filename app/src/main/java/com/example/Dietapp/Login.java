package com.example.Dietapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.myapplicationfinal.R;

public class Login extends AppCompatActivity {
    private Toast toast1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void lanzarinicio(View view) {
        Intent iD = new Intent(this, PaginaInicio.class );
        startActivity(iD);
    }
}