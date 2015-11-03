package com.video2brain.holamundo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class EntradaTexto extends AppCompatActivity implements OnSeekBarChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada_texto);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SeekBar cafes = (SeekBar) findViewById(R.id.seekBar);

        cafes.setOnSeekBarChangeListener(this);
    }

    public void hacerPedido(View view){

        EditText nombre = (EditText) findViewById(R.id.nombre);

        SeekBar cafes   = (SeekBar) findViewById(R.id.seekBar);

        TextView resultado = (TextView) findViewById(R.id.resultado);

        Integer cantidadCafes = cafes.getProgress();

        resultado.setText(nombre.getText() + " quiere " + cantidadCafes.toString() + " cafés :)");
    }

    @Override
    public void onProgressChanged(SeekBar v, int progress, boolean isUser){
        TextView cuantosCafes = (TextView) findViewById(R.id.cantidadBarra);

        cuantosCafes.setText(Integer.toString(progress) + " cafés seleccionados :)");
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}
