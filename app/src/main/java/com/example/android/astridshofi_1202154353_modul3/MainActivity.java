package com.example.android.astridshofi_1202154353_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password; //atribut

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view) { //untuk aktivitas login dan implementasi username dan password
        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pass);

        if (username.getText().toString().equals("EAD") && password.getText().toString().equals("MOBILE")){ //kondisi berhasil
            startActivity(new Intent(getApplicationContext(), Main2Activity.class));
        Toast.makeText(getApplicationContext(), "Selamat datang", Toast.LENGTH_SHORT).show(); //memunculkan toast
        }
        else { //kondisi gagal
            Toast.makeText(getApplicationContext(),"Username atau Password Salah!",Toast.LENGTH_SHORT).show(); //memunculkan toast
        }
    }
}
