package com.example.atividade1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        EditText n1 = (EditText) findViewById(R.id.number1);
        EditText n2 = (EditText) findViewById(R.id.number2);
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int soma = num1+num2;
        TextView text = findViewById(R.id.result);
        text.setText(""+soma);
    }
}
