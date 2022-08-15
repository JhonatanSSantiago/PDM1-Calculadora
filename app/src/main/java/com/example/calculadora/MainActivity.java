package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2, op;
    private Button ad, sub, mul, div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        ad=findViewById(R.id.adicao);
        sub=findViewById(R.id.subtracão);
        mul=findViewById(R.id.multiplicao);
        div=findViewById(R.id.divisao);

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1 = num1.getText().toString();
                String numero2 = num2.getText().toString();
                int num_1 = Integer.parseInt(numero1);
                int num_2 = Integer.parseInt(numero2);
                double resultado = num_1 + num_2;
                Intent it = new Intent(MainActivity.this, Activity2.class);
                it.putExtra("dado", String.valueOf(resultado));
                startActivity(it);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1 = num1.getText().toString();
                String numero2 = num2.getText().toString();
                int num_1 = Integer.parseInt(numero1);
                int num_2 = Integer.parseInt(numero2);
                double resultado = num_1 - num_2;
                Intent it = new Intent(MainActivity.this, Activity2.class);
                it.putExtra("dado", String.valueOf(resultado));
                startActivity(it);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1 = num1.getText().toString();
                String numero2 = num2.getText().toString();
                int num_1 = Integer.parseInt(numero1);
                int num_2 = Integer.parseInt(numero2);
                double resultado = num_1 * num_2;
                Intent it = new Intent(MainActivity.this, Activity2.class);
                it.putExtra("dado", String.valueOf(resultado));
                startActivity(it);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1 = num1.getText().toString();
                String numero2 = num2.getText().toString();
                int num_1 = Integer.parseInt(numero1);
                int num_2 = Integer.parseInt(numero2);
                double resultado = num_1 / num_2;
                Intent it = new Intent(MainActivity.this, Activity2.class);
                it.putExtra("dado", String.valueOf(resultado));
                startActivity(it);

            }
        });

    }
}