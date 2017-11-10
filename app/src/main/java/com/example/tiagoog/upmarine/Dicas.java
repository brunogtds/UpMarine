package com.example.tiagoog.upmarine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by fabriciovizzotto on 10/11/2017.
 */

public class Dicas extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas);
        final Intent i = new Intent(this, TelaMensagem.class);

        Thread ThreadDicas = new Thread(){
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
        };ThreadDicas.start();
    }
}
