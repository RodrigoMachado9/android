package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //  this variables scope //
    EditText editPeso, editAltura;
    TextView tvResultado, tvClassicacao;
    Button btCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //objects layout
        setContentView(R.layout.activity_main);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        tvResultado = findViewById(R.id.tvResultado);
        tvClassicacao = findViewById(R.id.tvClassific);
        btCalcular = findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get input values
                float peso, altura, imc;
                String message;


                peso = Float.parseFloat(editPeso.getText().toString());
                altura = Float.parseFloat(editAltura.getText().toString());
                imc = peso/ (altura * altura);
                tvResultado.setText(String.valueOf(imc));
                if (imc <= 16 ){
                    message = "Muito severamente abaixo do peso";
                    tvClassicacao.setText(message);
                }
                if (imc > 16 && imc <= 18.5){
                    message = "Abaixo do peso";
                    tvClassicacao.setText(message);
                }
                if (imc > 18.5 && imc <= 25){
                    message= "Peso saudável";
                    tvClassicacao.setText(message);
                }
                if (imc > 25 && imc <= 30){
                    message = "Acima do peso";
                    tvClassicacao.setText(message);
                }
                if (imc > 30 && imc <= 35){
                    message =  "Obesidade moderada";
                    tvClassicacao.setText(message);
                }

                if(imc > 35 && imc <= 40){
                    message= "Obesidade servera";
                    tvClassicacao.setText(message);
                }
                if (imc > 40){
                    message=  "Obesidade mórbida";
                    tvClassicacao.setText(message);
                }

            }


        });
    }



}
