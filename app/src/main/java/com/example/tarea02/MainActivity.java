package com.example.tarea02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText horas;
    private EditText valor;
    private EditText resultado;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        horas = (EditText) findViewById(R.id.edthoras);
        valor = (EditText) findViewById(R.id.edtvalor);
        resultado = (EditText) findViewById(R.id.edtresultado);
        calcular = (Button) findViewById(R.id.btncalcular);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int h,v, salario;
                h=Integer.parseInt(horas.getText().toString());
                v=Integer.parseInt(valor.getText().toString());
                salario=(h*v);
                resultado.setText("SU SALARIO ES DE "+salario);



            }
        });
    }
}
