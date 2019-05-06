package com.fadhlan.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    // TODO 1 Deklarasi View
    EditText nilai1 , nilai2;
    TextView hasil;
    Button tambah , kurang , Bagi , kali , clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO 2 inisialisasi view yang di buat



        nilai1  = findViewById(R.id.nilai1);
        nilai2  = findViewById(R.id.nilai2);
        hasil   = findViewById(R.id.hasil);
        tambah  = findViewById(R.id.tambah);
        kali    = findViewById(R.id.kali);
        kurang   = findViewById(R.id.kurang);
        Bagi  = findViewById(R.id.bagi);
        clear = findViewById(R.id.clear);


        // TODO 8 atur button untuk masing - masing operator
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "ISI BRO", Toast.LENGTH_SHORT).show();
                }else {
                    tambah();
                }

            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "ISI BRO", Toast.LENGTH_SHORT).show();
                }else {
                    kali();
                }

            }
        });

        Bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "ISI BRO", Toast.LENGTH_SHORT).show();
                }else {
                    Bagi();
                }

            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "ISI BRO", Toast.LENGTH_SHORT).show();
                }else {
                    kurang();
                }


            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "ISI BRO", Toast.LENGTH_SHORT).show();
                }else {
                    clear();
                }


            }
        });






    }











    // TODO 3 Method tambah

     void tambah(){
        // simpan inputan user kedalam variabel
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());


        // Cara Penjumlahan
        int total  = angka1 + angka2;

        hasil.setText(String.valueOf(total));



    }

    // TODO 4 Method kali


     void kali(){
         int angka1 = Integer.parseInt(nilai1.getText().toString());
         int angka2 = Integer.parseInt(nilai2.getText().toString());


         int total  = angka1 * angka2;

         hasil.setText(String.valueOf(total));

    }

    // TODO 5 Method kurang


     void kurang(){
         int angka1 = Integer.parseInt(nilai1.getText().toString());
         int angka2 = Integer.parseInt(nilai2.getText().toString());

         int total  = angka1 - angka2;

         hasil.setText(String.valueOf(total));


     }

    // TODO 6 Method bagi


     void Bagi(){
         double angka1 = Double.parseDouble(nilai1.getText().toString());
         double angka2 = Double.parseDouble(nilai2.getText().toString());

         double total  = angka1 / angka2;

         hasil.setText(String.valueOf(total));


     }

    // TODO 7 Method clear


     void clear(){

        hasil.setText("");
        nilai1.setText("");
        nilai2.setText("");

    }






}

