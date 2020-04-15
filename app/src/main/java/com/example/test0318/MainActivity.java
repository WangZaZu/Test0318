package com.example.test0318;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Object DecimalFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        EditText name = (EditText) findViewById(R.id.ed_name);
        EditText height = (EditText) findViewById(R.id.ed_height);
        EditText weight = (EditText) findViewById(R.id.ed_weight);
        TextView b = (TextView) findViewById(R.id.tv_showbmi);
        String h = height.getText().toString();
        String w = weight.getText().toString();
        double bmi = Double.parseDouble(w) / (Double.parseDouble(h) / 100.0 * Double.parseDouble(h) / 100.0);
        DecimalFormat = new DecimalFormat("#.#");

        String msg = "";
        if (bmi < 18.5) {
            msg = "過輕";
        } else if (bmi > 25) {
            msg = "過重";
        } else {
            msg = "標準";
        }
        Toast.makeText( this, msg, Toast.LENGTH_LONG).show();
b.setText(String.format(name.getText().toString() + "您的BMI是" +.fromt(bmi) );
     };