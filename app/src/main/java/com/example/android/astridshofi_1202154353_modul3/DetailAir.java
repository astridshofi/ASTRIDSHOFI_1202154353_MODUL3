package com.example.android.astridshofi_1202154353_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailAir extends AppCompatActivity {

    ImageView imgLogo, imgBattery;
    TextView textTitle, textLiter, deskripsi;
    ImageButton btnMinus, btnPlus;

    // ada 7 level liter 0 - 6 (full)
    int liter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_air);

        Intent intent = getIntent();

        //mengambil data
        imgLogo = findViewById(R.id.imageView);
        deskripsi = findViewById(R.id.desc);
        imgBattery = findViewById(R.id.imageBottle);
        textTitle = findViewById(R.id.textTitle);
        textLiter = findViewById(R.id.textLiter);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);

        //set keseluruhan
        int image = intent.getIntExtra("Gambar", 0);
        imgLogo.setImageResource(image);
        textTitle.setText(intent.getStringExtra("Judul"));
        deskripsi.setText(intent.getStringExtra("Deskripsi"));

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liter--; //air berkurang
                update_gambar(liter);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liter++; //air bertambah
                update_gambar(liter);
            }
        });
    }

    private void update_gambar(int liter) {
        switch (liter) { //memakai switch
            case 0:
                btnMinus.setEnabled(false); //karena sudah habis maka tidak bisa dikurang lagi
                btnPlus.setEnabled(true);

                imgBattery.setImageResource(R.drawable.ic_empty);
                textLiter.setText(String.valueOf(liter) + "L");

                Toast.makeText(getApplicationContext(),
                        "Empty Water", //ketika habis akan menampilkan toast habis
                        Toast.LENGTH_SHORT)
                        .show();
                break;
            case 1:
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(true);

                imgBattery.setImageResource(R.drawable.ic_empty1);
                textLiter.setText(String.valueOf(liter) + "L");
                break;
            case 2:
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(true);

                imgBattery.setImageResource(R.drawable.ic_empty2);
                textLiter.setText(String.valueOf(liter) + "L");
                break;
            case 3:
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(false); //di set false karena sudah full sehingga sudah tidak bisa ditambah lagi

                imgBattery.setImageResource(R.drawable.ic_full);
                textLiter.setText(String.valueOf(liter) + "L");
                Toast.makeText(getApplicationContext(),
                        "Full Water",
                        Toast.LENGTH_SHORT)
                        .show();
                break;
        }

    }


}
