package com.example.mrdicky.hd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class IsiData extends AppCompatActivity {



    @BindView(R.id.input_nama)
    EditText inputNama;
    @BindView(R.id.input_nama_kota)
    EditText inputNamaKota;
    @BindView(R.id.input_kota_tujuan)
    EditText inputKotaTujuan;
    @BindView(R.id.input_kurir)
    EditText inputKurir;
    @BindView(R.id.input_berat_barang)
    EditText inputBeratBarang;

    @BindView(R.id.simpan_button)
    Button simpan_button;

    @BindView(R.id.hasil_nama)
    TextView hasilNama;
    @BindView(R.id.hasil_nama_kota)
    TextView hasilNamaKota;
    @BindView(R.id.hasil_kota_tujuan)
    TextView hasilKotaTujuan;
    @BindView(R.id.hasil_kurir)
    TextView hasilKurir;
    @BindView(R.id.hasil_berat_barang)
    TextView hasilBeratBarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_data);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.simpan_button)
    public void btnClicked() {
        String nama = inputNama.getText().toString();
        hasilNama.setText(nama);
        String namakota = inputNamaKota.getText().toString();
        hasilNamaKota.setText(namakota);
        String kotatujuan = inputKotaTujuan.getText().toString();
        hasilKotaTujuan.setText(kotatujuan);
        String kurir = inputKurir.getText().toString();
        hasilKurir.setText(kurir);
        String beratbarang = inputBeratBarang.getText().toString();
        hasilBeratBarang.setText(beratbarang);

    }
}


