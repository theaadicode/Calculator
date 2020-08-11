package com.aditya.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.udojava.evalex.Expression;

public class MainActivity extends AppCompatActivity {
    TextView displayText;
    Button b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_0,b_plus,b_minus,b_into,b_divide,b_assign,b_clear;
    String text;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText = findViewById(R.id.textView2);
        b_0 = findViewById(R.id.zero);        b_1 = findViewById(R.id.one);        b_2 = findViewById(R.id.two);
        b_3 = findViewById(R.id.three);        b_4 = findViewById(R.id.four);        b_5 = findViewById(R.id.five);
        b_6 = findViewById(R.id.six);        b_7 = findViewById(R.id.seven);        b_8 = findViewById(R.id.eight);
        b_9 = findViewById(R.id.nine);             b_plus = findViewById(R.id.plus);    b_clear = findViewById(R.id.clear);
        b_minus = findViewById(R.id.minus);        b_into = findViewById(R.id.into);        b_divide = findViewById(R.id.divide);
        b_assign = findViewById(R.id.assign);

        b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                if (text.equals("")){
                    displayText.setText(String.valueOf(1));
                }
                else{
                    text += 1;
                    displayText.setText(text);
                }
            }
        });

        b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                if (text.equals("")){
                    displayText.setText(String.valueOf(2));
                }
                else{
                    text += 2;
                    displayText.setText(text);
                }
            }
        });

        b_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                if (text.equals("")){
                    displayText.setText(String.valueOf(3));
                }
                else{
                    text += 3;
                    displayText.setText(text);
                }
            }
        });

        b_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                if (text.equals("")){
                    displayText.setText(String.valueOf(4));
                }
                else{
                    text += 4;
                    displayText.setText(text);
                }
            }
        });

        b_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                if (text.equals("")){
                    displayText.setText(String.valueOf(5));
                }
                else{
                    text += 5;
                    displayText.setText(text);
                }
            }
        });

        b_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                if (text.equals("")){
                    displayText.setText(String.valueOf(6));
                }
                else{
                    text += 6;
                    displayText.setText(text);
                }
            }
        });

        b_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                if (text.equals("")){
                    displayText.setText(String.valueOf(7));
                }
                else{
                    text += 7;
                    displayText.setText(text);
                }
            }
        });

        b_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                if (text.equals("")){
                    displayText.setText(String.valueOf(8));
                }
                else{
                    text += 8;
                    displayText.setText(text);
                }
            }
        });

        b_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                if (text.equals("")){
                    displayText.setText(String.valueOf(9));
                }
                else{
                    text += 9;
                    displayText.setText(text);
                }
            }
        });

        b_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                if (text.equals("")){                }
                else{
                    text += 0;
                    displayText.setText(text);
                }
            }
        });

        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                int len = text.length();
                if (text.equals("")){                }
                else if(text.charAt(len-1) == '+' || text.charAt(len-1) == '-' || text.charAt(len-1) == 'X' || text.charAt(len-1) == '/'){

                }
                else{
                    text += '+';
                    displayText.setText(text);
                }
            }
        });

        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                int len = text.length();
                if (text.equals("")){                }
                else if(text.charAt(len-1) == '+' || text.charAt(len-1) == '-' || text.charAt(len-1) == 'X' || text.charAt(len-1) == '/'){

                }
                else{
                    text += '-';
                    displayText.setText(text);
                }
            }
        });

        b_into.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                int len = text.length();
                if (text.equals("")){                }
                else if(text.charAt(len-1) == '+' || text.charAt(len-1) == '-' || text.charAt(len-1) == '*' || text.charAt(len-1) == '/'){

                }
                else{
                    text += '*';
                    displayText.setText(text);
                }
            }
        });

        b_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = displayText.getText().toString();
                int len = text.length();
                if (text.equals("")){                }
                else if(text.charAt(len-1) == '+' || text.charAt(len-1) == '-' || text.charAt(len-1) == '*' || text.charAt(len-1) == '/'){

                }
                else{
                    text += '/';
                    displayText.setText(text);
                }
            }
        });

        b_assign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.endsWith("/") || text.endsWith("*") || text.endsWith("-") || text.endsWith("+")){
                    Toast.makeText(getApplicationContext(),"Invalid Format Input",Toast.LENGTH_SHORT).show();
                }
                 else {
                     Expression expression = new Expression(text);
                    expression.setPrecision(15);
                    result = Double.parseDouble(String.valueOf(expression.eval()));
                    displayText.setText("" + result);

                 }
            }
        });

        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "";
                displayText.setText(text);
            }
        });
    }
}
