package com.example.dibujo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cajaNombre,cajaHoras;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cajaNombre= findViewById(R.id.caja3);
        cajaHoras= findViewById(R.id.caja2);
        calcular= findViewById(R.id.caja4);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int horas=Integer.parseInt(cajaHoras.getText().toString());
                String nombre= cajaNombre.getText().toString();

                if (horas<=40){
                    int salario=horas*20000;
                    String mensaje="señ@r"+nombre+"su salario fue de"+salario;
                    Toast.makeText( MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();

                }

                else{
                    int horasextras=horas-40;
                    int salario=(horasextras*25000)+800000;
                    String mensaje="señ@r"+nombre+"su salario fue de"+salario;
                    Toast.makeText( MainActivity.this, salario, Toast.LENGTH_SHORT).show();


                }


            }



        });

    }
}