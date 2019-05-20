package com.arturo.seidortech;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AvisoPrivasidad extends AppCompatActivity {

    ImageButton volverToolbar;
    ImageButton usuarioToolbar;
    TextView encabezadoToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviso_privasidad);

        volverToolbar = (ImageButton) findViewById(R.id.atrasToolbar);
        usuarioToolbar = (ImageButton) findViewById(R.id.usuarioToolbar);

        encabezadoToolbar = (TextView) findViewById(R.id.encabezadoToolbar);

        encabezadoToolbar.setText("Aqui cambiale");


        volverToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        usuarioToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AvisoPrivasidad.this, Usuario.class);
                startActivity(intent);
            }
        });
    }
}
