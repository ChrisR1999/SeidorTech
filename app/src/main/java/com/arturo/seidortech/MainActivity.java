package com.arturo.seidortech;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.arturo.seidortech.Utilidades.DisplayUtilidades;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PasarActivity(View view) {
        DisplayUtilidades display = new DisplayUtilidades(this);
        Intent intent = new Intent(this, ConfirmacionCodigo.class);
        startActivity(intent);
    }

}
