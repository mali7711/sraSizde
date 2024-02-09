package com.example.srasizde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextYas,editTextMaas;
    Button buttonKaydet;
    TextView textViewSonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextYas = findViewById(R.id.editTextYas);
        buttonKaydet = findViewById(R.id.buttonKaydet);
        textViewSonuc = findViewById(R.id.textViewSonuc);
        editTextMaas = findViewById(R.id.editTextMaas);
       buttonKaydet.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int yas = Integer.parseInt(editTextYas.getText().toString());
               int maas = Integer.parseInt(editTextMaas.getText().toString());
               Personel personel = new Personel();
               personel.setMaas(maas);
               personel.setYas(yas);
               textViewSonuc.setText("yas:"+personel.getYas()+" maas:"+personel.getMaas());
           }
       });
         }
    }


