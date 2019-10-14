package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd, btnSub, btnMultiply, btnDivide, btnEqual;
    String displayNum ="";
    int num1,num2;
    int res;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnEqual.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
            displayNum +=1;
            editText.setText(displayNum);
            break;

            case R.id.btn2:
                displayNum +=2;
                        editText.setText(displayNum);

    }
    case.R.id.btnAdd:
        num1 = Integer.parseInt(displayNum);
        displayNum ="";
        op ="+";
        break;

    case.R.id.btnequal:
        num2 =Integer.parseInt()
                res= getResult(op,num1,num2);
        editText=.setText(string.val)
}

