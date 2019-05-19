package com.arturo.seidortech;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.arturo.seidortech.Dialogos.BaseDialogo;
import com.arturo.seidortech.Utilidades.DisplayUtilidades;

public class MainActivity extends AppCompatActivity {

    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Iguala los valores para que las imagenes sean grises al inicio en el menu
        SharedPreferences shard = getSharedPreferences("Preferencias", context.MODE_PRIVATE);
        SharedPreferences.Editor editor = shard.edit();
        editor.putString("uno", "1");
        editor.putString("dos", "1");
        editor.putString("tres", "1");
        editor.putString("cuatro", "1");
        editor.putString("cinco", "1");
        editor.putString("seis", "1");


        editor.apply();

        DisplayUtilidades display = new DisplayUtilidades(this);
        BaseDialogo prueba = new BaseDialogo(this, this, "Puto el \n que lo lea");
        prueba.mostrarDialogo();

    }

    public void PasarActivity(View view) {
        DisplayUtilidades display = new DisplayUtilidades(this);
        Intent intent = new Intent(this, ConfirmacionCodigo.class);
        startActivity(intent);
    }
}
