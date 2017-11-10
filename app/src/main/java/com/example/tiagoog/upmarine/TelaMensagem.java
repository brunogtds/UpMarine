package com.example.tiagoog.upmarine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaMensagem extends AppCompatActivity {

    private Button botaoDicas = (Button) findViewById(R.id.button_dicas);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_mensagem);
        botaoDicas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent it = new Intent(TelaMensagem.this,Dicas.class);
                startActivity(it);
            }
        });
    }
}
