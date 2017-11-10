package com.example.tiagoog.upmarine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cadastro extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Button botaoMensagem = (Button) findViewById(R.id.button2);
        botaoMensagem.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent it = new Intent(Cadastro.this,TelaMensagem.class);
                startActivity(it);

            }
        });
    }
}
