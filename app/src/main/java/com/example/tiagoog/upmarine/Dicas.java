package com.example.tiagoog.upmarine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.tiagoog.upmarine.R.layout.activity_dicas;


public class Dicas extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("criou a tela");
        super.onCreate(savedInstanceState);
        setContentView(activity_dicas);

        Button button_retorno_dicas = (Button) findViewById(R.id.button_returno_dicas);
        System.out.println("criou o botão");

       button_retorno_dicas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                System.out.println("criou o Listener");
                Intent i = new Intent(Dicas.this, TelaMensagem.class);
                startActivity(i);
            }
        });
       /* Thread ThreadDicas = new Thread(){
            public void run(){
                try {
                    sleep(8000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(i);
                    finish();
                }
            }
        };ThreadDicas.start();*/

    }
}
