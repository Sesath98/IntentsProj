package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);




        Button okbtn = (Button) findViewById(R.id.okbtn);
        okbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent okintent = new Intent(getApplicationContext(),SecondActivity.class);

                EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
                EditText editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);

                int num1 = Integer.parseInt(editTextNumber.getText().toString());
                int num2 = Integer.parseInt(editTextNumber2.getText().toString());

                okintent.putExtra("com.SecondActivity.num1",num1);
                okintent.putExtra("com.SecondActivity.num2",num2);
                startActivity(okintent);
            }
        });

        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
        Toast toast = Toast.makeText(context, message, duration); toast.show();

        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);


    }
}