package com.geecktech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
        textNumber(tvResult.getText().toString());

    }

    private TextView tvResult;
    private Integer firstValue, secondValue;
    private String operation;
    private Boolean isResultSuccess = false;


    public void onNumberClick(View view) {
        switch (view.getId()) {

            case R.id.btn_one:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else if (isResultSuccess){
                    tvResult.setText("1");
                }else {
                    tvResult.append("1");
                }
                break;
            case R.id.btn_two:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else if(isResultSuccess){
                    tvResult.setText("2");
                }else {
                    tvResult.append("2");
                }

                break;
            case R.id.btn_three:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                } else if (isResultSuccess){
                    tvResult.setText("3");
                }else {
                    tvResult.append("3");
                }

                break;
            case R.id.btn_four:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("4");
                } else if (isResultSuccess){
                    tvResult.setText("4");
                }else{
                    tvResult.append("4");
                }

                break;
            case R.id.btn_five:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else if(isResultSuccess){
                    tvResult.setText("5");
                }else {
                    tvResult.append("5");
            }

                break;
            case R.id.btn_six:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                } else if (isResultSuccess){
                    tvResult.setText("6");
                }else {
                    tvResult.append("6");
                }

                break;
            case R.id.btn_seven:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("7");
                } else if (isResultSuccess){
                    tvResult.setText("7");
                }else {
                    tvResult.append("7");
                }


                break;
            case R.id.btn_eight:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("8");
                } else if (isResultSuccess){
                    tvResult.setText("8");
                }else {
                    tvResult.append("8");
                }


                break;
            case R.id.btn_nine:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                } else if (isResultSuccess){
                    tvResult.setText("9");
                }else {
                    tvResult.append("9");
                }



                break;

            case R.id.btn_clear:
                tvResult.setText("0");

                break;

        }


    }

    public void textNumber(String number) {
        if (isResultSuccess) {
            tvResult.setText("0");
            isResultSuccess = false;

        }
        if (tvResult.getText().toString().equals("0")) {
            tvResult.setText(number);
        } else {
            tvResult.append(number);
        }
    }


    @SuppressLint("NonConstantResourceId")
    public void onOperationClick(View view) {

        switch (view.getId()) {
            case R.id.btn_plus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "+";
                tvResult.setText(firstValue + "+");
                break;
            case R.id.btn_minus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "-";
                tvResult.setText(firstValue + "-");
                break;
            case R.id.btn_x:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "*";
                tvResult.setText((firstValue + "*"));
                break;
            case R.id.btn_del:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "/";
                tvResult.setText((firstValue + "/"));
                break;
                


            case R.id.btn_equal:
                isResultSuccess = true;
                secondValue = Integer.parseInt(tvResult.getText().toString().
                        replace(firstValue + operation, ""));
                switch (operation) {
                    case "+":
                        tvResult.setText(firstValue + operation + secondValue + "\n=" + (firstValue + secondValue));

                        break;
                    case "-":
                        tvResult.setText(firstValue + operation + secondValue + "\n=" + (firstValue - secondValue));

                        break;
                    case "*":
                        tvResult.setText(firstValue + operation + secondValue + "\n=" + (firstValue * secondValue));

                        break;
                    case "/":
                        tvResult.setText(firstValue + operation + secondValue + "\n=" + (firstValue / secondValue));

                        break;

                }
                break;


        }

    }


}

