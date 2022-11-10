package com.example.proyek1aderestujuliansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Frame2Layout extends AppCompatActivity {
    EditText eUserName;
    ImageButton bLogin;
    String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame2_layout);

        eUserName = findViewById(R.id.username); //hubungkan dengan EditText username
        bLogin = findViewById(R.id.login); //hubungkan dengan ImageButton login

        //fungsi setOnClickListener digunakan saat tombol login ditekan
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }
    public void login(){
        //fungsi login dibuat untuk menampilkan pesan dan berpindah ke activity lainnya
        //simpan input dari pengguna ke variabel user
        user = eUserName.getText().toString();

        Intent intent = new Intent(Frame2Layout.this,LinearActivity2.class);
        intent.putExtra("user",user);

        //Toast digunakan untuk menampilkan pesen
        Toast.makeText(this, "Selamat Datang "+user,Toast.LENGTH_LONG).show();

        //digunakan untuk menjalankan intent
        startActivity(intent);
    }
}