package com.video2brain.holamundo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class HolaMundo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        findViewById(R.id.button10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HolaMundo.this, ManejoEstilos.class));
            }
        });
    }

    public void _e_ActAddTexto(View view){
        Intent i = new Intent(this, AddTexto.class);
        startActivity(i);
    }

    public void _e_TextoDinamico(View view){
        Intent i = new Intent(this, TextoDinamico.class);
        startActivity(i);
    }

    public void _e_AlinearElementos(View view){
        Intent i = new Intent(this, AlinearElementos.class);
        startActivity(i);
    }

    public void _e_IncluirImagenes(View view){
        Intent i = new Intent(this, IncluirImagenes.class);
        startActivity(i);
    }

    public void _e_Interacciones(View view){
        Intent i = new Intent(this, Interacciones.class);
        startActivity(i);
    }

    public void _e_entradaTexto(View view){
        Intent i = new Intent(this, EntradaTexto.class);
        startActivity(i);
    }

    public void _e_ManejoEstilos(View view){
        Intent i = new Intent(this, ManejoEstilos.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hola_mundo, menu);
        return true;
    }
}
