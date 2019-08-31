package com.example.student.bai1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextA, editTextB;
    TextView textViewResult;
    Button buttonTong, buttonHieu, buttonTich,
            buttonThuong, buttonUocChung, buttonThoat;
    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
        calculator = new Calculator();
    }
    private void addEvents() {
        buttonThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        buttonTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setA(Integer.parseInt(editTextA.getText().toString()));
                calculator.setB(Integer.parseInt(editTextB.getText().toString()));
                textViewResult.setText(String.valueOf(calculator.tinhTong()));
            }
        });
        buttonHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setA(Integer.parseInt(editTextA.getText().toString()));
                calculator.setB(Integer.parseInt(editTextB.getText().toString()));
                textViewResult.setText(String.valueOf(calculator.tinhHieu()));
            }
        });
        buttonTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setA(Integer.parseInt(editTextA.getText().toString()));
                calculator.setB(Integer.parseInt(editTextB.getText().toString()));
                textViewResult.setText(String.valueOf(calculator.tinhTich()));
            }
        });
        buttonThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setA(Integer.parseInt(editTextA.getText().toString()));
                calculator.setB(Integer.parseInt(editTextB.getText().toString()));
                textViewResult.setText(String.valueOf(calculator.tinhThuong()));
            }
        });
        buttonUocChung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setA(Integer.parseInt(editTextA.getText().toString()));
                calculator.setB(Integer.parseInt(editTextB.getText().toString()));
                textViewResult.setText(String.valueOf(calculator.uocChung()));
            }
        });
    }

    private void addControls() {
        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        textViewResult = findViewById(R.id.textViewResult);
        buttonTong = findViewById(R.id.buttonTong);
        buttonHieu = findViewById(R.id.buttonHieu);
        buttonTich = findViewById(R.id.buttonTich);
        buttonThuong = findViewById(R.id.buttonThuong);
        buttonUocChung = findViewById(R.id.buttonUocChung);
        buttonThoat = findViewById(R.id.buttonExit);
    }
}
