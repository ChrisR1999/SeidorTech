package com.arturo.seidortech;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuPrincipal extends AppCompatActivity {

    Context context = this;
    ImageButton Hojas,Contrato,PagoI,ContratoC,PagoF,Membresia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        SharedPreferences shard = getSharedPreferences("Preferencias", context.MODE_PRIVATE);
        SharedPreferences.Editor editor = shard.edit();
        Hojas = (ImageButton)findViewById(R.id.HojaTermino);
        Contrato =(ImageButton)findViewById(R.id.ContratoReservas);
        PagoI =(ImageButton)findViewById(R.id.PagoInicial);
        ContratoC =(ImageButton)findViewById(R.id.ContratoCiere);
        PagoF =(ImageButton)findViewById(R.id.PagoFinal);
        Membresia =(ImageButton)findViewById(R.id.Membresia);

        String uno = shard.getString("uno", "Master");
        String dos = shard.getString("dos", "Master");
        String tres = shard.getString("tres", "Master");
        String cuatro = shard.getString("cuatro", "Master");
        String cinco = shard.getString("cinco", "Master");
        String seis = shard.getString("seis", "Master");

        if(uno.equals("1")) {
            Hojas.setImageResource(R.drawable.hojaterminocolor);
            Hojas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, HojaTerminos.class);
                    startActivity(intent);
                }}); }
                else{
            Hojas.setImageResource(R.drawable.hojaterminocolor);
            Hojas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) { }}); }
        if(dos.equals("0")) {
            Contrato.setImageResource(R.drawable.contratosreservacolor);
            Contrato.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, ContratoReserva.class);
                    startActivity(intent);
                }}); }
        else{
            if(dos.equals("3")) {
            Contrato.setImageResource(R.drawable.contratosreservacolor);
            Contrato.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) { }});} }
        if(tres.equals("0")) {
            PagoI.setImageResource(R.drawable.pagoinicialcolor);
            PagoI.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, PagoInicial.class);
                    startActivity(intent);
                }}); }
        else{
            if(tres.equals("3")) {
                PagoI.setImageResource(R.drawable.pagoinicialcolor);
                PagoI.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) { }});} }
        if(cuatro.equals("0")) {
            ContratoC.setImageResource(R.drawable.contratocierrecolor);
            ContratoC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, ContratoCierre.class);
                    startActivity(intent);
                }}); }
        else{
            if(cuatro.equals("3")) {
                ContratoC.setImageResource(R.drawable.contratocierrecolor);
                ContratoC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) { }});} }
        if(cinco.equals("0")) {
            PagoF.setImageResource(R.drawable.pagofinalcolor);
            PagoF.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, PagoFinal.class);
                    startActivity(intent);
                }}); }
        else{
            if(cinco.equals("3")) {
                PagoF.setImageResource(R.drawable.pagofinalcolor);
                PagoF.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) { }});} }
        if(seis.equals("0")) {
            Membresia.setImageResource(R.drawable.membresiacolor);
            Membresia.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Membresia.class);
                    startActivity(intent);
                }}); }
        else{
            if(seis.equals("3")) {
                Membresia.setImageResource(R.drawable.membresiacolor);
                Membresia.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context, MembresiaPagada.class);
                        startActivity(intent);
                    }});} }





    }


    public void PasarActivity(View view) {

        Intent intent = new Intent(this, HojaTerminos.class);
        startActivity(intent);

    }

    public void PagoInicial(View view) {


    }

    public void PasarHojaTermino(View view) {



    }

    public void ContratoReservas(View view) {



    }

    public void PagoIniciald(View view) {


    }
    public void ContratoCierred(View view) {



    }
    public void PagoFinald(View view) {



    }
    public void Membresiad(View view) {


    }

    public void Mensaje(){

    }
}
