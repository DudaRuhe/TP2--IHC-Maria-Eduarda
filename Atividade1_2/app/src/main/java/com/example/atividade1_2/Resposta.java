package com.example.atividade1_2;

import android.os.Bundle;
import android.widget.TextView;

public class Resposta extends MainActivity{
 TextView tx;
 String st;

 protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.resposta);
     tx = findViewById(R.id.text);
     st = getIntent().getExtras().getString("Value");
     tx.setText(st);
 }
}
