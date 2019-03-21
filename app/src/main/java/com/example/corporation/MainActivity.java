package com.example.corporation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void btnAcessar(View v){ // enquanto oeventobotaoprincipal estiver cinza nao esta sendo usado
        // quando o java compila vira .class chamou a tela compilada o velotrol.class.
        Intent CARDAPIO = new Intent(getApplicationContext(),cardapio.class);
        startActivity(CARDAPIO); //passa o nome da intent

    }


}

