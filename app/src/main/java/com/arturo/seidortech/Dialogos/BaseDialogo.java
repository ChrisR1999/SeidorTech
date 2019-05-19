package com.arturo.seidortech.Dialogos;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.arturo.seidortech.MenuPrincipal;
import com.arturo.seidortech.R;
import com.arturo.seidortech.Utilidades.DisplayUtilidades;

public class BaseDialogo {
    private AlertDialog.Builder builder;
    private AlertDialog dialogo;
    private Activity activity;
    private Context contexto;
    private String texto;

    public BaseDialogo(Activity activity, Context contexto, String texto) {
        this.activity = activity;
        this.contexto = contexto;
        this.texto = texto;
        inicializarDialogo();
    }

    private void inicializarDialogo() {
        /*final LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View v = inf.inflate(R.layout.dialog_ok, null);
        final TextView textoDialogo = v.findViewById(R.id.textoDialogo);
        final ImageView imagenDialogo = v.findViewById(R.id.imagenDialogo);
        final LinearLayout linearDialogo = v.findViewById(R.id.linearDialogo);

        builder = new AlertDialog.Builder(activity);
        LinearLayout.LayoutParams params;

        alto = ((int) (DisplayUtilidades.getY()));
        ancho = ((int) (DisplayUtilidades.getX()));

        params = new LinearLayout.LayoutParams(alto, ancho);
        linearDialogo.setLayoutParams(params);

        textoDialogo.setText(texto);
        builder.setView(linearDialogo);
        builder.create();*/

        builder = new AlertDialog.Builder(contexto);
        final TextView textoDialogo = new TextView(contexto);
        final ImageButton imagenDialogo = new ImageButton(contexto);
        final LinearLayout linearDialogo = new LinearLayout(contexto);

        LinearLayout.LayoutParams params;
        ViewGroup.LayoutParams paramsImagen;
        LinearLayout.LayoutParams paramsTexto;

        params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        linearDialogo.setLayoutParams(params);

        linearDialogo.setGravity(Gravity.CENTER);
        linearDialogo.setOrientation(LinearLayout.VERTICAL);
        linearDialogo.setPadding(0,
                ((int) (DisplayUtilidades.getY() * 0.1f)),
                0,
                ((int) (DisplayUtilidades.getY() * 0.1))
        );

        paramsImagen = new ViewGroup.LayoutParams(
                ((int) (DisplayUtilidades.getX() * 0.3f)),
                ((int) (DisplayUtilidades.getX() * 0.3f))
        );

        imagenDialogo.setLayoutParams(paramsImagen);
        imagenDialogo.setScaleType(ImageView.ScaleType.FIT_XY);
        imagenDialogo.setImageResource(R.drawable.icono_ok);
        imagenDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, MenuPrincipal.class);
                activity.startActivity(intent);
            }
        });

        paramsTexto = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        textoDialogo.setTextColor(contexto.getResources().getColor(R.color.textoprincipal));
        textoDialogo.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textoDialogo.setTypeface(Typeface.DEFAULT_BOLD);
        textoDialogo.setPadding(0, 40, 0, 0);
        textoDialogo.setLayoutParams(paramsTexto);
        textoDialogo.setTextSize(24);
        textoDialogo.setText(texto);

        linearDialogo.addView(imagenDialogo);
        linearDialogo.addView(textoDialogo);

        builder.setView(linearDialogo);
        dialogo = builder.create();
    }

    public void mostrarDialogo() {
        builder.show();
    }
}
