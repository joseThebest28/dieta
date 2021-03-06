
package com.example.Dietapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.myapplicationfinal.R;

public class PaginaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    public void lanzarDeporte(View view) {
        Intent iD = new Intent(this, Deporte.class );
        startActivity(iD);
    }
    public void lanzarSeguimiento(View view) {
        Intent iS = new Intent(this, Seguimiento.class );
        startActivity(iS);
    }
    public void lanzarCategoria(View view) {
        Intent iC = new Intent(this, Categorias.class );
        startActivity(iC);
    }

    public void salir(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Salir ");
        builder.setMessage("Estas seguro de querer salir de Dietapp");
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });
        builder.setNegativeButton("Cancelar", null);

        AlertDialog dialog = builder.create();
        dialog.show();

    }

    public void lanzarReto(View view) {
        Intent ir= new Intent(this, Pagina_reto.class );
        startActivity(ir);
    }
}
