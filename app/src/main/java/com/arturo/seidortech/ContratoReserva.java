package com.arturo.seidortech;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.arturo.seidortech.Dialogos.BaseDialogo;

public class ContratoReserva extends AppCompatActivity {

    ImageView imageView;
    Context context = this;
    ImageButton volverToolbar;
    ImageButton usuarioToolbar;
    TextView encabezadoToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrato_reserva);

        ImageButton btnCamera = (ImageButton) findViewById(R.id.btnCamera);
        imageView = (ImageView) findViewById(R.id.imageView);


        volverToolbar = (ImageButton) findViewById(R.id.atrasToolbar);
        usuarioToolbar = (ImageButton) findViewById(R.id.usuarioToolbar);

        encabezadoToolbar = (TextView) findViewById(R.id.encabezadoToolbar);

        encabezadoToolbar.setText("Contrato Reserva");




        volverToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        usuarioToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ContratoReserva.this, Usuario.class);
                startActivity(intent);
            }
        });


        //Onclick para tomar la foto
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);

            }
        });
    }

    //Instrucciones que convierten la imagen tomada a un Bitmap
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap) data.getExtras().get("data");
        //No se convierte a Bitmap que ya aqui seria mejor mandarla al servidor para revision
        // imageView.setImageBitmap(bitmap);
        PasarActivity();
    }

    public void PasarActivity() {


        SharedPreferences shard = getSharedPreferences("Preferencias", context.MODE_PRIVATE);
        SharedPreferences.Editor editor1;
        //editor.remove("MiDia");
        editor1 = shard.edit();
        editor1.putString("dos", "3");
        editor1.putString("tres", "0");
        editor1.apply();
        BaseDialogo prueba = new BaseDialogo(this, this, "Firma enviada\ncon exito.");
        prueba.mostrarDialogo();
    }

    public void PasarActivity2(View view) {


        SharedPreferences shard = getSharedPreferences("Preferencias", context.MODE_PRIVATE);
        SharedPreferences.Editor editor1;
        //editor.remove("MiDia");
        editor1 = shard.edit();
        editor1.putString("dos", "3");
        editor1.putString("tres", "0");
        editor1.apply();
        BaseDialogo prueba = new BaseDialogo(this, this, "\nEXITO.");
        prueba.mostrarDialogo();
    }


}
