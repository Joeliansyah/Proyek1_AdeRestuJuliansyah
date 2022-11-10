package com.example.proyek1aderestujuliansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Frame1Layout extends AppCompatActivity {
    ImageView gambarLoading; //digunakan untuk menampung gambar loading dari activity_frame1
    Animation rotasiAnimasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame1_layout);
        //simpan gambar loading activit_frame1 ke variabel gambarLoading
        gambarLoading = findViewById(R.id.loading);

        //panggil fungsi rotasi
        rotasi();

        //membuat handler untuk berpindah secara otomatis dari activity saat ini ke activity tujuan
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Frame1Layout.this, Frame2Layout.class);
                //jalankan fungsi Intent
                startActivity(intent);

                //tutup activity ini --> masuk kedalam mode background
                finish();
            }
            //durasi menampilkan activity ini sebelum berpindah
            //dalam satuan milidetik, dalam hal ini diberikan waktu 3000ms atau 3 detik
        }, 3000);
    }
        private void rotasi(){
            //fungsi rotasi digunakan untuk merotasi gambar yang diinginkan dengan memanggil rotasi_search
            rotasiAnimasi = AnimationUtils.loadAnimation(this,R.anim.rotasi_search);
            gambarLoading.startAnimation(rotasiAnimasi);
        }
    }
