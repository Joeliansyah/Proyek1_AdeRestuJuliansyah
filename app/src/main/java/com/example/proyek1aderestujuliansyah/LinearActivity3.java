package com.example.proyek1aderestujuliansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;

public class LinearActivity3 extends AppCompatActivity {
    String kepada,subyek,pesan;
    EditText eKepada,eSubyek,ePesan;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear3);

        kepada = getIntent().getExtras().getString("kepada");
        subyek = getIntent().getExtras().getString("subyek");
        pesan = getIntent().getExtras().getString("pesan");

        //hubungkan dengan EdtiText dengan id di activity_linear3
        eKepada = findViewById(R.id.kepadaa);
        eSubyek = findViewById(R.id.subyekk);
        ePesan = findViewById(R.id.pesann);

        //tuliskan user pada EditText
        eKepada.setText(kepada);
        eSubyek.setText(subyek);
        ePesan.setText(pesan);
    }
}