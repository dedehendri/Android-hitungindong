package com.example.mrdicky.hd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        //menginisiasi dan memanggil widget button pada file layout
        Button btn1 =(Button)findViewById(R.id.btn_pesan);

        Button btn2 =(Button)findViewById(R.id.btn_exit);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent pindah = new Intent(MenuUtama.this,IsiData.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                moveTaskToBack(true);

                //membuat method tombol keluar dari aplikasi

            }
        });


    }


}


