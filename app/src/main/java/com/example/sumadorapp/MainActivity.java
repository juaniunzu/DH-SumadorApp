package com.example.sumadorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewContador;
    private Button buttonSumar;
    private Button buttonRestar;
    private Integer contador;

    public void sumar(){
        this.contador++;
    }

    public void restar(){
        this.contador--;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enlazar elementos
        textViewContador = findViewById(R.id.textView_contador);
        buttonSumar = findViewById(R.id.button_sumar);
        buttonRestar = findViewById(R.id.button_restar);
        contador = 0;


        buttonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumar();
                textViewContador.setText(contador.toString());

            }
        });

        buttonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restar();
                textViewContador.setText(contador.toString());
            }
        });


    }
}
