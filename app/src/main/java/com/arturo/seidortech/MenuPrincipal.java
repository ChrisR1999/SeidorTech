package com.arturo.seidortech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.arturo.seidortech.Utilidades.DisplayUtilidades;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }


    public void PasarActivity(View view) {

        Intent intent = new Intent(this, HojaTerminos.class);
        startActivity(intent);
    }

    public void PagoInicial(View view) {

        Intent intent = new Intent(this, PagoInicial.class);
        startActivity(intent);
    }
}
