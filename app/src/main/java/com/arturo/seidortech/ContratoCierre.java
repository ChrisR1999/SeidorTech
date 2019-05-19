package com.arturo.seidortech;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;

import com.arturo.seidortech.Utilidades.DisplayUtilidades;

import java.util.Calendar;

public class ContratoCierre extends AppCompatActivity implements View.OnClickListener {
    ImageButton bfecha, bhora;
    EditText efecha, ehora;
    private int dia, mes, ano, hora, minutos;
    Context context = this;
    ImageButton volverToolbar;
    ImageButton usuarioToolbar;
    Toolbar toolbar;
    private static final String TAG = "activity_contrato_cierre";

    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrato_cierre);

        bfecha = (ImageButton) findViewById(R.id.bfecha);
        bhora = (ImageButton) findViewById(R.id.bhora);
        efecha = (EditText) findViewById(R.id.efecha);
        ehora = (EditText) findViewById(R.id.ehora);
        bfecha.setOnClickListener(this);
        bhora.setOnClickListener(this);



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
                Intent intent = new Intent(ContratoCierre.this, Usuario.class);
                startActivity(intent);
            }
        });


    }


    @Override
    public void onClick(View v) {

        if (v == bfecha) {
            final Calendar c = Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH);
            mes = c.get(Calendar.MONTH);
            ano = c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    efecha.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                }
            }
                    , ano, mes, dia);
            datePickerDialog.show();
        }
        if (v == bhora) {
            final Calendar c = Calendar.getInstance();
            hora = c.get(Calendar.HOUR_OF_DAY);
            minutos = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    ehora.setText(hourOfDay + ":" + minute);
                }
            }, hora, minutos, false);
            timePickerDialog.show();
        }

    }

    public void PasarActivity(View view) {


        DisplayUtilidades display = new DisplayUtilidades(this);

        SharedPreferences shard = getSharedPreferences("Preferencias", context.MODE_PRIVATE);
        SharedPreferences.Editor editor1;
        //editor.remove("MiDia");
        editor1 = shard.edit();
        editor1.putString("cuatro", "3");
        editor1.putString("cinco", "0");
        editor1.apply();
        Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
    }
}
