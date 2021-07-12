package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Calculator_main);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnMinos = findViewById(R.id.btnMinos);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivide = findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edit1.getText().toString());
                int b = Integer.parseInt(edit2.getText().toString());
                tvResult.setText("계산결과 : " +(a+b));
              //setText attr => String
            }
        });

        btnMinos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edit1.getText().toString());
                int b = Integer.parseInt(edit2.getText().toString());
                tvResult.setText("계산결과 : " +(a-b));
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edit1.getText().toString());
                int b = Integer.parseInt(edit2.getText().toString());
                tvResult.setText("계산결과 : " +(a*b));
              
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edit1.getText().toString());
                int b = Integer.parseInt(edit2.getText().toString());
                tvResult.setText("계산결과 : " +(a/b));
            }
        });

    }
}
