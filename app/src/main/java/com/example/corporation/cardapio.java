package com.example.corporation;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cardapio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);
    }

    public void btnContato(View v){
        Intent numtel  = new Intent(Intent.ACTION_DIAL);
        // Uri é o endereco de um recurso exemplo www.google.com www.google.com.br/ioi.img o caminho completo
        Uri uri = Uri.parse("tel://031994771150");
        numtel.setData(uri);//passei o numero para a intent
        startActivity(numtel);
    }

    public void btnSite(View v){

        Intent site = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("https://www.instagram.com/divino_docinho/?hl=pt-br");
        site.setData(uri);
        startActivity(site);
    }

    public void btnCompartilha(View v){

        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT,"Divino Docinho");
        share.setType("text/plain");
        startActivity(share);
    }

    public void btnMenu(View v){ // enquanto oeventobotaoprincipal estiver cinza nao esta sendo usado
        // quando o java compila vira .class chamou a tela compilada o velotrol.class.
        Intent MENU = new Intent(getApplicationContext(),menu.class);
        startActivity(MENU); //passa o nome da intent

    }
}
