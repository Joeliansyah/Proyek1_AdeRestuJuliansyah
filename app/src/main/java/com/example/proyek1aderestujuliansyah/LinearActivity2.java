package com.example.proyek1aderestujuliansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinearActivity2 extends AppCompatActivity {
    String user,kepada,subyek,pesan; // untuk menampung data user dari Frame2Activity
    EditText eKepada,eSubyek,ePesan; //untuk menghubungkan dengan EditText kepada
    Button bKirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear2);

        //ambil data dari Intent Frame2Activity
        //pastikan key yang digunakan sama, apabila tidak maka tidak dapat mengmbil data
        user = getIntent().getExtras().getString("user");

        //hubungkan dengan EdtiText dengan id kepada
        eKepada = findViewById(R.id.kepada);
        eSubyek = findViewById(R.id.subyek);
        ePesan = findViewById(R.id.pesan);
        bKirim = findViewById(R.id.btn_kirim);


        //tuliskan user pada EditText kepada
        eKepada.setText(user);

        bKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { kirim();}
            });
    }
    public void kirim(){
        kepada = eKepada.getText().toString();
        subyek = eSubyek.getText().toString();
        pesan = ePesan.getText().toString();

        Intent intentt = new Intent(LinearActivity2.this, LinearActivity3.class);
        intentt.putExtra("kepada",kepada);
        intentt.putExtra("subyek",subyek);
        intentt.putExtra("pesan",pesan);
        startActivity(intentt);
    }
}