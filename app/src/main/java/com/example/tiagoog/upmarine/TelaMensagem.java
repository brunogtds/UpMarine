package com.example.tiagoog.upmarine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaMensagem extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("criou o Tela mensagem");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_mensagem);

        Button botaoDicas = (Button) findViewById(R.id.button_dicas);
        System.out.println("criou botão");
        botaoDicas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                System.out.println("criou o listener mensagem");
                Intent it = new Intent(TelaMensagem.this,Dicas.class);
                System.out.println("vai chamar dicas");
                startActivity(it);
            }
        });
    }
}
