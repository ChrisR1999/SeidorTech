package com.arturo.seidortech;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.arturo.seidortech.Dialogos.BaseDialogo;

public class HojaTerminos extends AppCompatActivity {


    ImageView imageView;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoja_terminos);


        ImageButton btnCamera = (ImageButton) findViewById(R.id.btnCamera);
        imageView = (ImageView)findViewById(R.id.imageView);


        //Onclick para tomar la foto
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);

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
        editor1.putString("dos", "0");
        editor1.putString("uno", "0");
        editor1.apply();
            BaseDialogo prueba = new BaseDialogo(this, this, "Firma enviada\ncon exito.");
            prueba.mostrarDialogo();


        Intent intent = new Intent(this, MenuPrincipal.class);


        startActivity(intent);
    }
    public void PasarActivity2(View view){

        Intent intent = new Intent(this, Usuario.class);

        startActivity(intent);
    }


}