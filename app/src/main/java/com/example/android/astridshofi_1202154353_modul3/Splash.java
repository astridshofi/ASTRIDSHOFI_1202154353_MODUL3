package com.example.android.astridshofi_1202154353_modul3;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Handler handler = new Handler(); //handler untuk mengirim dan memproses objek message
        handler.postDelayed(new Runnable() {
            @Override
            public void run() { //delayed untuk memperlama objek
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik lama waktu splash ditampilkan
    }
}
