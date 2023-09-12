package com.danielvargasospina.app_votos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;/
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    string nombre;

    int cedula;

    Button votacion_A;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        votacion_A = findViewById(R.id.votacion_A);

        votacion_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                votacion = "A";
                Intent enviardatos = new Intent(MainActivity.this, Resultado.class);
                //datos a enviar
                enviardatos.putExtra("nombre",nombre);
                enviardatos.putExtra("votacion", votacion);
                enviardatos.putExtra("fecha", "11/02/2023");
                enviardatos.putExtra("cedula", cedula);
            }
                                      }




    }
}