package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    public static final String BUNLE_MVALUE_RESULT = "BunleMvalueResult";
    public static final String BUNDLE_MSTRING = "BundleMstring";
    private Button mButton0, mButton1, mButton2, mButton3, mButton4, mButton5, mButton6,
            mButton7, mButton8, mButton9, mButtonDot, mButtonPlus, mButtonMinus,
            mButtonMultiple, mButtonDevide, mButtonEquals,mButtonDel;

    private TextView mTextView;
    private String mString="";
    float mValueResult = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        setListeners();

        if (savedInstanceState!=null){
            mString = savedInstanceState.getString(BUNDLE_MSTRING);
            mTextView.setText(savedInstanceState.getString(BUNDLE_MSTRING));
            mValueResult = savedInstanceState.getFloat(BUNLE_MVALUE_RESULT);
        }
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
        mButtonDel = findViewById(R.id.btn_delete);

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


                if (mTextView == null) return;
                else {
                    mTextView.setText(mTextView.getText() + " + ");
                    mString += " + ";
                }
            }
        });

        mButtonMinus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                if (mTextView == null) return;
                else {

                    mTextView.setText(mTextView.getText() + " - ");
                    mString += " - ";
                }
            }
        });

        mButtonDevide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {


                if (mTextView == null) return;
                else {

                    mTextView.setText(mTextView.getText() + " / ");
                    mString += " / ";
                }
            }
        });

        mButtonMultiple.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {


                if (mTextView == null) return;
                else {

                    mTextView.setText(mTextView.getText() + " * ");
                    mString += " * ";
                }
            }
        });

        mButtonEquals.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                calcResult();
                mTextView.setText(mTextView.getText() + " = " + mValueResult);
                mString += " = " + mValueResult;
            }
        });

        mButtonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mString="";
                mTextView.setText("");
                mValueResult=0;
            }
        });

    }

    private void calcResult() {
        String[] splitedString = mString.split(" ");

        mValueResult += Float.parseFloat(splitedString[0]);

        for (int i = 1; i <splitedString.length ; i+=2) {
            switch (splitedString[i]) {
                case "+":
                    mValueResult += Float.parseFloat(splitedString[i + 1]);
                    break;
                case "-":
                    mValueResult -= Float.parseFloat(splitedString[i + 1]);
                    break;
                case "*":
                    mValueResult *= Float.parseFloat(splitedString[i + 1]);
                    break;
                case "/":
                    mValueResult /= Float.parseFloat(splitedString[i + 1]);
                    break;
            }
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putFloat(BUNLE_MVALUE_RESULT,mValueResult);
        outState.putString(BUNDLE_MSTRING,mString);
    }

}