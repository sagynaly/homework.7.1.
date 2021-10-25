package com.example.homework71;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer firstValue, secondValue;
    private String operation;
    private Boolean isResultSuccess = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.btn_tv_result);

    }



    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                textClick("1");
                break;
            case R.id.two:
                textClick("2");
                break;
            case R.id.btn_three:
                textClick("3");
                break;
            case R.id.btn_four:
                textClick("4");
                break;
            case R.id.btn_five:
                textClick("5");
                break;
            case R.id.btn_six:
                textClick("6");
                break;
            case R.id.btn_seven:
                textClick("7");
                break;
            case R.id.btn_eight:
                textClick("8");
                break;
            case R.id.btn_nine:
                textClick("9");
                break;
            case R.id.btn_zero:
                textClick("0");
                break;
            case R.id.btn_clear:
                tvResult.setText("0");
                break;
        }

    }
    private void textClick(String number){
        if(isResultSuccess){
            tvResult.setText("");
            isResultSuccess = false;
        }
        if (tvResult.getText().toString().equals("0")){
            tvResult.setText(number);
        }else {
            tvResult.append(number);
        }
    }

    public void onClickOperation(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(firstValue + "+");
                operation = "+";
                break;
            case R.id.btn_equal:
                secondValue = Integer.parseInt(tvResult.getText().toString()
                        .replace(firstValue + operation, ""));
                isResultSuccess = true;
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
            case R.id.btn_minus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(firstValue + "-");
                operation = "-";
                break;
            case R.id.btn_multiplai:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(firstValue + "*");
                operation = "*";
                break;
            case R.id.btn_dissmiss:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(firstValue + "/");
                operation = "/";
                break;
        }
    }
}