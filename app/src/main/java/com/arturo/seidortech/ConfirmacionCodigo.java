package com.arturo.seidortech;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class ConfirmacionCodigo extends AppCompatActivity {

    ImageButton volverToolbar;
    ImageButton usuarioToolbar;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_codigo);


        volverToolbar = (ImageButton) findViewById(R.id.atrasToolbar);
        usuarioToolbar = (ImageButton) findViewById(R.id.usuarioToolbar);

        volverToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        usuarioToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfirmacionCodigo.this, Usuario.class);
                startActivity(intent);
            }
        });

    }

    public void PasarActivity(View view) {

        Intent intent = new Intent(this, MenuPrincipal.class);

        startActivity(intent);
    }

    public void PasarActivity2(View view) {

        Intent intent = new Intent(this, Usuario.class);

        startActivity(intent);
    }
}
