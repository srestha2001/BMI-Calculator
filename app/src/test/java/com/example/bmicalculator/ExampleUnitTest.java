package com.example.bmicalculator;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class Mainactivity extends AppCompatActivity {
    private button calculate;
    private edittext weight,height;
    private textview answer;

    @Override
    protected void onCreate(bundle savedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);
        calculate=findViewById(R.id.btcalculate);
        weight=findViewById(R.id.etWeight);
        height=findViewById(R.id.etHeight);
        answer=findViewById(R.id.tvAnswer);

        calculate.setOnClickListener(new View.OnClickListener()){
        @Override
                public void onClick(View v){
                string getW = Weight.get.Text().toString();
                string getH = Height.get.Text().toString();

                float W = Float.parseFloat(getW);
                float H = Float.parseFloat(getH);


                float newH = H / 100;
                float bmi = W / (newH * newH);

                if (bmi < 18.5) {
                    Answer.setText("You Are Underweight");
                }
                else if (bmi >= 18.5 & bmi < 25); {
                Answer.setText("You Are Normal");
            }
            else{
                Answer.setText("You Are Obese");
                }
            }
        }
    }
}