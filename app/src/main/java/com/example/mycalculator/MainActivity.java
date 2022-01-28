package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView number, result;
    double number1 = 0, number2 = 0, value = 0;
    boolean sum, sub, mul, div;
    Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, multiply, divide, dot, equal, clean;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.input_field);
        result = findViewById(R.id.result_field);
        zero = findViewById(R.id.number_zero);
        one = findViewById(R.id.number_one);
        two = findViewById(R.id.number_two);
        three = findViewById(R.id.number_three);
        four = findViewById(R.id.number_four);
        five = findViewById(R.id.number_five);
        six = findViewById(R.id.number_six);
        seven = findViewById(R.id.number_seven);
        eight = findViewById(R.id.number_eight);
        nine = findViewById(R.id.number_nine);
        plus = findViewById(R.id.button_plus);
        minus = findViewById(R.id.button_minus);
        multiply = findViewById(R.id.button_multiply);
        divide = findViewById(R.id.button_divide);
        dot = findViewById(R.id.button_dot);
        equal = findViewById(R.id.button_equals);
        clean = findViewById(R.id.button_clean);


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + "9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText() + ".");
            }
        });
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("");
                result.setText("");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number.getText() != null) {
                    number1 = Float.parseFloat(number.getText() + "");
                    sum = true;
                }
                result.setText(number.getText() + " +");
                number.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number.getText() != null) {
                    number1 = Float.parseFloat(number.getText() + "");
                    sub = true;
                }
                result.setText(number.getText() + " -");
                number.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number.getText() != null) {
                    number1 = Float.parseFloat(number.getText() + "");
                    mul = true;
                }
                result.setText(number.getText() + " *");
                number.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number.getText() != null) {
                    number1 = Float.parseFloat(number.getText() + "");
                    div = true;
                }
                result.setText(number.getText() + " /");
                number.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sum == true || sub == true || mul == true || div == true) {
                    if (number.getText() != null) {
                        number2 = Float.parseFloat(number.getText() + "");
                        result.setText(result.getText() + " " + number.getText());

                        if (sum == true)
                            value = number1 + number2;
                        sum = false;
                        if (sub == true)
                            value = number1 - number2;
                        sub = false;
                        if (mul == true)
                            value = number1 * number2;
                        mul = false;
                        if (div == true)
                            value = number1 / number2;
                        div = false;

                        number.setText(value + "");
                        number2 = value;
                        number1 = 0;
                    }
                }
            }
        });

    }

}



