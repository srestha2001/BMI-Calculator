package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MainActivity extends AppCompatActivity {
     Button calculate;
     EditText weight;
     EditText height;
     TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate=findViewById(R.id.btn);
        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);
        answer=findViewById(R.id.result);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String getW = weight.getText().toString();
                String getH = height.getText().toString();

                float W = Float.parseFloat(getW);
                float H = Float.parseFloat(getH);

                String bmistatement;

                float newH = H / 100;
                float bmi = W / (newH * newH);
                String bmiresult=String.format("%.2f",bmi);
                String finalbmi="Your BMI is: "+bmiresult+"\n";
                if (bmi < 18.5) {
                    bmistatement="You are Underweight";
                }
                else if (bmi >= 18.5 & bmi < 25) {
                    bmistatement="You are Normal";
                }
            else{
                    bmistatement="You are Obese";
                }
            finalbmi+=bmistatement;
            answer.setText(finalbmi);
            }

        });
    }
}