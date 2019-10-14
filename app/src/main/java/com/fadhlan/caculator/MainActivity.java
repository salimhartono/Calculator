package com.fadhlan.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


   //using specefic declaration for easy mainten
    EditText etNilai1 , etNilai2;
    TextView tvHasil;
    Button btTambah , btKurang , btBagi , btKali , btClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO 2 inisialisasi view yang di buat



        etNilai1  = findViewById(R.id.nilai1);
        etNilai2  = findViewById(R.id.nilai2);
        tvHasil   = findViewById(R.id.hasil);
        btTambah  = findViewById(R.id.tambah);
        btKali    = findViewById(R.id.kali);
        btKurang   = findViewById(R.id.kurang);
        btBagi  = findViewById(R.id.bagi);
        btClear = findViewById(R.id.clear);


        // TODO 8 atur button untuk masing - masing operator
        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etNilai1.getText().toString().isEmpty() || etNilai2.getText().toString().isEmpty()){
                    //
                    Toast.makeText(MainActivity.this, "field can't be empty", Toast.LENGTH_SHORT).show();
                }else {
                    tambah();
                }

            }
        });

        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etNilai1.getText().toString().isEmpty() || etNilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "field can't be empty", Toast.LENGTH_SHORT).show();
                }else {
                    kali();
                }

            }
        });

        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etNilai1.getText().toString().isEmpty() || etNilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "field can't be empty", Toast.LENGTH_SHORT).show();
                }else {
                    Bagi();
                }

            }
        });

        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etNilai1.getText().toString().isEmpty() || etNilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "field can't be empty", Toast.LENGTH_SHORT).show();
                }else {
                    kurang();
                }


            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etNilai1.getText().toString().isEmpty() || etNilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "field can't be empty", Toast.LENGTH_SHORT).show();
                }else {
                    clear();
                }


            }
        });


    }
    
    //gunakan jenis private apabila method hanya digunakan didalam kelas.

     private void tambah(){
        // simpan inputan user kedalam variabel
        int angka1 = Integer.parseInt(etNilai1.getText().toString());
        int angka2 = Integer.parseInt(etNIlai2.getText().toString());

        // Cara Penjumlahan
        int total  = angka1 + angka2;

        tvHasil.setText(String.valueOf(total));

    }

    // TODO 4 Method kali
     private void kali(){
         int angka1 = Integer.parseInt(etNilai1.getText().toString());
         int angka2 = Integer.parseInt(etNilai2.getText().toString());

         int total  = angka1 * angka2;

         tvHasil.setText(String.valueOf(total));

    }

    // TODO 5 Method kurang
     private void kurang(){
         int angka1 = Integer.parseInt(etNilai1.getText().toString());
         int angka2 = Integer.parseInt(etNilai2.getText().toString());

         int total  = angka1 - angka2;

         tvHasil.setText(String.valueOf(total));


     }

    // TODO 6 Method bagi


     private void Bagi(){
         double angka1 = Double.parseDouble(etNilai1.getText().toString());
         double angka2 = Double.parseDouble(etNilai2.getText().toString());

         double total  = angka1 / angka2;

         tvHasil.setText(String.valueOf(total));


     }

    // TODO 7 Method clear
     private void clear(){

        tvHasil.setText("");
        etNilai1.setText("");
        etNilai2.setText("");

    }
}

