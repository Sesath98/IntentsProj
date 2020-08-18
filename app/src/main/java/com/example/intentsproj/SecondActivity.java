package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("com.SecondActivity.num1")){
            EditText s_editTextNumber1 = (EditText) findViewById(R.id.s_editTextNumber1);
            int num1 = getIntent().getExtras().getInt("number1");
            s_editTextNumber1.setText(num1);


        }
        if(getIntent().hasExtra("com.SecondActivity.num2")) {
            EditText s_editTextNumber2 = (EditText) findViewById(R.id.s_editTextNumber2);
            int num2 = getIntent().getExtras().getInt("number2");
            s_editTextNumber2.setText(num2);
        }

        Button addbtn = (Button) findViewById(R.id.addbtn);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText s_editTextNumber1 = (EditText) findViewById(R.id.s_editTextNumber1);
                EditText s_editTextNumber2 = (EditText) findViewById(R.id.s_editTextNumber2);
                TextView resultView = (TextView) findViewById(R.id.resultView);

                int num1 = Integer.parseInt(s_editTextNumber1.getText().toString());
                int num2 = Integer.parseInt(s_editTextNumber2.getText().toString());

                int result = num1 + num2;
                resultView.setText(num1 + "+" + num2 + "=" + result+ "");

            }
        });

        Button minbtn = (Button) findViewById(R.id.minbtn);
        minbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText s_editTextNumber1 = (EditText) findViewById(R.id.s_editTextNumber1);
                EditText s_editTextNumber2 = (EditText) findViewById(R.id.s_editTextNumber2);
                TextView resultView = (TextView) findViewById(R.id.resultView);

                int num1 = Integer.parseInt(s_editTextNumber1.getText().toString());
                int num2 = Integer.parseInt(s_editTextNumber2.getText().toString());

                int result = num1 - num2;
                resultView.setText(num1 + "-" + num2 + "=" + result+ "");
            }
        });

        Button multibtn = (Button) findViewById(R.id.multibtn);
        multibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText s_editTextNumber1 = (EditText) findViewById(R.id.s_editTextNumber1);
                EditText s_editTextNumber2 = (EditText) findViewById(R.id.s_editTextNumber2);
                TextView resultView = (TextView) findViewById(R.id.resultView);

                int num1 = Integer.parseInt(s_editTextNumber1.getText().toString());
                int num2 = Integer.parseInt(s_editTextNumber2.getText().toString());

                int result = num1 * num2;
                resultView.setText(num1 + "*" + num2 + "=" + result + "");
            }
        });
        Button divbtn = (Button) findViewById(R.id.divbtn);
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText s_editTextNumber1 = (EditText) findViewById(R.id.s_editTextNumber1);
                EditText s_editTextNumber2 = (EditText) findViewById(R.id.s_editTextNumber2);
                TextView resultView = (TextView) findViewById(R.id.resultView);

                int num1 = Integer.parseInt(s_editTextNumber1.getText().toString());
                int num2 = Integer.parseInt(s_editTextNumber2.getText().toString());

                int result = num1 / num2;
                resultView.setText(num1 + "/" + num2 + "=" + result + "");
            }
        });

    }
}