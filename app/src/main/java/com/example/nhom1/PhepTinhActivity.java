package com.example.nhom1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PhepTinhActivity extends AppCompatActivity {

    EditText et1, et2, et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phep_tinh);

        et1 = (EditText) findViewById(R.id.editTextNumber);
        et2 = (EditText) findViewById(R.id.editTextNumber1);
        et3 = (EditText) findViewById(R.id.editTextNumber2);
    }

    public void Cong(View v)
    {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1+n2;

        et3.setText("Kết quả: " + result);
    }

    public void Tru(View v)
    {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1-n2;

        et3.setText("Kết quả: " + result);
    }

    public void Nhan(View v)
    {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 * n2;

        et3.setText("Kết quả: " + result);
    }

    public void Chia(View v)
    {
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 / n2;

        et3.setText("Kết quả: " + result);
    }


}