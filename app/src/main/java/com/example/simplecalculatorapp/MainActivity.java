package com.example.simplecalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button One;
    private Button Two;
    private Button Three;
    private Button Four;
    private Button Five;
    private Button Six;
    private Button Seven;
    private Button Eight;
    private Button Nine;
    private Button Zero;
    private Button Add;
    private Button Sub;
    private Button Mul;
    private Button Div;
    private Button Equals;
    private Button Clear;
    private TextView User_Input;
    private TextView Result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUALS = '0';
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIView();

        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Input.setText(User_Input.getText().toString() + "1");
            }
        });

        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Input.setText(User_Input.getText().toString() + "2");
            }
        });

        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Input.setText(User_Input.getText().toString() + "3");
            }
        });

        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Input.setText(User_Input.getText().toString() + "4");
            }
        });

        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Input.setText(User_Input.getText().toString() + "5");
            }
        });

        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Input.setText(User_Input.getText().toString() + "6");
            }
        });

        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Input.setText(User_Input.getText().toString() + "7");
            }
        });

        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Input.setText(User_Input.getText().toString() + "8");
            }
        });

        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Input.setText(User_Input.getText().toString() + "9");
            }
        });

        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User_Input.setText(User_Input.getText().toString() + "0");
            }
        });
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION = ADDITION;
                Result.setText(String.valueOf(val1) + "+");
                User_Input.setText(null);

            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION = SUBTRACTION;
                Result.setText(String.valueOf(val1) + "-");
                User_Input.setText(null);

            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION = MULTIPLICATION;
                Result.setText(String.valueOf(val1) + "*");
                User_Input.setText(null);

            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION = DIVISION;
                Result.setText(String.valueOf(val1) + "/");
                User_Input.setText(null);

            }
        });
        Equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQUALS;
                Result.setText(Result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));

                User_Input.setText(null);
            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (User_Input.getText().length() > 0) {
                    CharSequence name = User_Input.getText().toString();
                    //User_Input.setText(name.subSequence());
                }
            }
        });
    }

    public void setupUIView(){
        One = (Button)findViewById(R.id.btnOne);
        Two = (Button)findViewById(R.id.btnTwo);
        Three = (Button)findViewById(R.id.btnThree);
        Four = (Button)findViewById(R.id.btnFive);
        Five = (Button)findViewById(R.id.btnFive);
        Six = (Button)findViewById(R.id.btnSix);
        Seven = (Button)findViewById(R.id.btnSeven);
        Eight =(Button)findViewById(R.id.btnEight);
        Nine = (Button)findViewById(R.id.btnNine);
        Zero =(Button)findViewById(R.id.btnZero);
        Add = (Button)findViewById(R.id.btnAdd);
        Sub = (Button)findViewById(R.id.btnSub);
        Mul = (Button)findViewById(R.id.btnMul);
        Div = (Button)findViewById(R.id.btnDiv);
        Equals = (Button)findViewById(R.id.btnEquals);
        Clear = (Button)findViewById(R.id.btnClear);
        User_Input = (TextView) findViewById(R.id.tvControl);
        Result = (TextView)findViewById(R.id.tvResult);
    }

    private void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(User_Input.getText().toString());

            switch (ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 + val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EQUALS:
                    break;
            }
        }
        else {
            val1 = Double.parseDouble(User_Input.getText().toString());
        }
    }
}
