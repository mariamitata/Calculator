package com.solutionsglobalweb.mycalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btndevision;
    private Button btnMultiplication;
    private TextView txtResult;
    private Button btnClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAddition = (Button)findViewById(R.id.btnAddition);
        btnSubtraction = (Button)findViewById(R.id.btnSubtraction);
        btndevision = (Button)findViewById(R.id.btndevision);
        btnMultiplication = (Button)findViewById(R.id.btnMultiplication);
        txtResult  = (TextView) findViewById(R.id.txtResult);
        btnClear = (Button) findViewById(R.id.btnClear);

        //add click listener Addition
        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length()>0)&& (operand2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 + oper2;
                    txtResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this,"Please Enter some number  in both fields !",Toast.LENGTH_LONG).show();
            }

            }
        });
        //add click listener Subtraction
        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length()>0)&& (operand2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 - oper2;
                    txtResult.setText(Double.toString(theResult));
                }
                else{
                    Toast.makeText(MainActivity.this,"Please Enter some number  in both fields !",Toast.LENGTH_LONG).show();
                }
            }
        });
        //add click listener Devision
        btndevision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 / oper2;
                    txtResult.setText(Double.toString(theResult));
                }
                else{
                    Toast.makeText(MainActivity.this,"Please Enter some number in both fields !",Toast.LENGTH_LONG).show();
                }
            }
        });
        //add click listener Multiplication
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length()>0)&& (operand2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 * oper2;
                    txtResult.setText(Double.toString(theResult));
                }
                else{

                }
            }
        });
        //add click listener Clear
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                txtResult.setText("0.00");
                operand1.requestFocus();
            }
        });
    }
}
