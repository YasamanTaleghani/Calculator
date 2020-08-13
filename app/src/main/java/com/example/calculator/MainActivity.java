package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private Button mButton0, mButton1, mButton2, mButton3, mButton4, mButton5, mButton6,
            mButton7, mButton8, mButton9, mButtonDot, mButtonPlus, mButtonMinus,
            mButtonMultiple, mButtonDevide, mButtonEquals, mButtonReset;

    private TextView mTextView;
    private String mString="";
    float mValue=0;
    float mValueResult = 0;
    boolean firstCalc = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        setListeners();

    }

    private void findView() {
        mTextView = findViewById(R.id.textView);
        mButton0 = findViewById(R.id.btn_0);
        mButton1 = findViewById(R.id.btn_1);
        mButton2 = findViewById(R.id.btn_2);
        mButton3 = findViewById(R.id.btn_3);
        mButton4 = findViewById(R.id.btn_4);
        mButton5 = findViewById(R.id.btn_5);
        mButton6 = findViewById(R.id.btn_6);
        mButton7 = findViewById(R.id.btn_7);
        mButton8 = findViewById(R.id.btn_8);
        mButton9 = findViewById(R.id.btn_9);
        mButtonDot = findViewById(R.id.btn_dot);
        mButtonPlus = findViewById(R.id.btn_plus);
        mButtonMinus = findViewById(R.id.btn_minus);
        mButtonMultiple = findViewById(R.id.btn_multiple);
        mButtonDevide = findViewById(R.id.btn_devide);
        mButtonEquals = findViewById(R.id.btn_equals);
        mButtonReset = findViewById(R.id.btn_reset);

    }

    private void setListeners() {

        mButton0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mTextView.setText(mTextView.getText() + "0");
                mString += "0";
            }
        });

        mButton1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mTextView.setText(mTextView.getText() + "1");
                mString += "1";
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mTextView.setText(mTextView.getText() + "2");
                mString += "2";
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mTextView.setText(mTextView.getText() + "3");
                mString += "3";
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mTextView.setText(mTextView.getText() + "4");
                mString += "4";
            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mTextView.setText(mTextView.getText() + "5");
                mString += "5";
            }
        });

        mButton6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mTextView.setText(mTextView.getText() + "6");
                mString += "6";
            }
        });

        mButton7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mTextView.setText(mTextView.getText() + "7");
                mString += "7";
            }
        });

        mButton8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mTextView.setText(mTextView.getText() + "8");
                mString += "8";
            }
        });

        mButton9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                mTextView.setText(mTextView.getText() + "9");
                mString += "9";
            }
        });

        mButtonDot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                mString += ".";
                mTextView.setText(mTextView.getText() + ".");

            }
        });

        mButtonPlus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                isItFisrtNumber("+");
                if (mTextView == null) return;
                else {
                    mTextView.setText(mTextView.getText() + "+");
                    String temp = findFloat("+", mString);
                    mValue = Float.parseFloat(temp);
                    mString += "+";
                    calcResult("+", mValue);
                }
            }
        });

        mButtonMinus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                isItFisrtNumber("-");
                if (mTextView == null) return;
                else {
                    String temp = findFloat("-", mString);
                    mValue = Float.parseFloat(temp);
                    mString += "-";
                    mTextView.setText(mTextView.getText() + "-");
                    calcResult("-", mValue);
                }
            }
        });

        mButtonDevide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                isItFisrtNumber("/");
                if (mTextView == null) return;
                else {
                    String temp = findFloat("/", mString);
                    mValue = Float.parseFloat(temp);
                    mString += "/";
                    mTextView.setText(mTextView.getText() + "/");
                    calcResult("/", mValue);
                }
            }
        });

        mButtonMultiple.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                isItFisrtNumber("*");
                if (mTextView == null) return;
                else {
                    String temp = findFloat("*", mString);
                    mValue = Float.parseFloat(temp);
                    mString += "*";
                    mTextView.setText(mTextView.getText() + "*");
                    calcResult("*", mValue);
                }
            }
        });

        mButtonEquals.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                mTextView.setText(mTextView.getText() + " = " + mValueResult);
            }
        });

    }

    private void calcResult(String s , float f) {

        switch (s) {
            case "+":
                mValueResult += f;
                break;
            case "-":
                mValueResult -= f;
                break;
            case "/":
                mValueResult = mValueResult / f;
                break;
            default:
                mValueResult *= f;
                break;
        }

    }

    private String findFloat(String simbol, String string) {
        String result = "";

        int index = string.lastIndexOf(simbol.charAt(0));
        result = string.substring(index + 1);

        return result;
    }

    private void isItFisrtNumber(String simbol){

        if (firstCalc) {
            Toast.makeText(this,"first",Toast.LENGTH_LONG).show();
            int index = mString.indexOf(simbol.charAt(0));
            mValueResult += Float.parseFloat(mString.substring(0 , index ));
            firstCalc = false;
        }
    }

}