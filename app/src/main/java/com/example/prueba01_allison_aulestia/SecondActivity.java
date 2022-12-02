package com.example.prueba01_allison_aulestia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button button_Siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button_Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(siguiente);
            }
        });
    }
    public static String contenidoEditTextNombre="";
    public static String contenidoEditTextApellido="";

}