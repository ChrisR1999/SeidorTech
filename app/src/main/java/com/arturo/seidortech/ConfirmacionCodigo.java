package com.arturo.seidortech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConfirmacionCodigo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_codigo);
    }

    public void PasarActivity(View view){

        Intent intent = new Intent(this, ConfirmacionCodigo.class);

        startActivity(intent);
    }
}
