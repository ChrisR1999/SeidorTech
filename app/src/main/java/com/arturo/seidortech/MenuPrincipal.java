package com.arturo.seidortech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuPrincipal extends AppCompatActivity {

    ListView ListaMenu;
    ImageButton ImageButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

       /* ListaMenu = (ListView)findViewById(R.id.Listas);

        ArrayList<ImageButton> ListaImagenes = new ArrayList<>();
        ListaImagenes.add();

        ArrayAdapter Adaptador = new ArrayAdapter(this,R.layout.activity_menu_principal,ListaImagenes);
        ListaMenu.setAdapter(Adaptador);*/
    }


    public void PasarActivity(View view) {

        Intent intent = new Intent(this, HojaTerminos.class);
        startActivity(intent);

    }

    public void PagoInicial(View view) {

        Intent intent = new Intent(this, PagoInicial.class);
        startActivity(intent);
    }

    public void PasarHojaTermino(View view) {

        Intent intent = new Intent(this, HojaTerminos.class);
        startActivity(intent);

    }

    public void ContratoReservas(View view) {

        Intent intent = new Intent(this, ContratoReserva.class);
        startActivity(intent);

    }

    public void PagoIniciald(View view) {

        Intent intent = new Intent(this, PagoInicial.class);
        startActivity(intent);

    }
    public void ContratoCierred(View view) {

        Intent intent = new Intent(this, ContratoCierre.class);
        startActivity(intent);

    }
    public void PagoFinald(View view) {

        Intent intent = new Intent(this, PagoFinal.class);
        startActivity(intent);

    }
    public void Membresiad(View view) {

        Intent intent = new Intent(this, Membresia.class);
        startActivity(intent);

    }
}
