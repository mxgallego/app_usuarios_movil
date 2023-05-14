package com.mxgs.appusuarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class actInicioSesion1 extends AppCompatActivity {

    private EditText editTextcorreo;
    private EditText editTextcontrasenna;
    private Button  botonIniciosesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_inicio_sesion1);

        editTextcorreo = (EditText)findViewById(R.id.editTextTextEmailAddress);
        editTextcontrasenna = (EditText)findViewById(R.id.editTextTextPassword);
        botonIniciosesion = (Button)findViewById(R.id.btniniciosesion);



    }
    @Override
    public void onBackPressed() {
        Intent ir_a_acty = new Intent(this, MainActivity.class);
        startActivity(ir_a_acty);
        finish();
    }
    public void inicioSesion(View prmView){


        String varEmail = editTextcorreo.getText().toString().trim();
        String varContrasenna = editTextcontrasenna.getText().toString().trim();
        //validación
        if (TextUtils.isEmpty(varEmail)) {//(precio.equals(""))
            Toast.makeText(this, "Se debe ingresar un email", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(varContrasenna)){
            Toast.makeText(this, "Se debe ingresar una contraseña", Toast.LENGTH_LONG).show();
            return;
        }

    }
}