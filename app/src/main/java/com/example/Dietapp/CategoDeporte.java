package com.example.Dietapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.myapplicationfinal.R;

public class CategoDeporte extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categodeporte);
    }

    public void irDeporte(View view) {
        Intent i = new Intent(this, Deporte.class );
        startActivity(i);
    }

    public void irCardio(View view) {
        Intent i = new Intent(this, Cardio.class );
        startActivity(i);
    }

    public void iraabdo(View view) {
        Intent i = new Intent(this, Abdominales.class );
        startActivity(i);
    }

    public void volverMenu(View view) {
        Intent i = new Intent(this, Categorias.class );
        startActivity(i);
    }

    public void irBiceps(View view) {
        Intent i = new Intent(this, BIceps.class );
        startActivity(i);
    }

    public void irTriceps(View view) {
        Intent i = new Intent(this, Triceps.class );
        startActivity(i);
    }

    public void irHombro(View view) {
        Intent i = new Intent(this, Hombro.class );
        startActivity(i);
    }

    public void irPecho(View view) {
        Intent i = new Intent(this, Pecho.class );
        startActivity(i);
    }

    public void irEspalda(View view) {
        Intent i = new Intent(this, Espalda.class );
        startActivity(i);
    }

    public void irPierna(View view) {
        Intent i = new Intent(this, Pierna.class );
        startActivity(i);
    }

    public void irGluteos(View view) {
        Intent i = new Intent(this, Gluteos.class );
        startActivity(i);
    }

    public void lanzarActiDepor(View view) {
        Intent i = new Intent(this, Deporte.class );
        startActivity(i);
    }
}
