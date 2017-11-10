package com.example.tiagoog.upmarine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipal extends AppCompatActivity {

    private Button botaoCadastro = (Button) findViewById(R.id.button_cadastrar);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        botaoCadastro.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent it = new Intent(TelaPrincipal.this,Cadastro.class);
                startActivity(it);
            }
        });
    }






}

