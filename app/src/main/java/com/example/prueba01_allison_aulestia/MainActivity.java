package com.example.prueba01_allison_aulestia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNombre;
    private EditText editTextApellido;
    private Button button_Siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        button_Siguiente = (Button) findViewById(R.id.button_Siguiente);

        button_Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent siguiente = new Intent(MainActivity.this, SecondActivity.class);
               startActivity(siguiente);
            }
        });
    }

}