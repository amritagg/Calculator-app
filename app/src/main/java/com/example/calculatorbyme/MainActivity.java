package com.example.calculatorbyme;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    Global variables used in calculator
    String digit1 = "";
    String digit2 = "";
    String answer = "";
    char symbol;
    char temp;
    double result = 0;
    boolean hasSymbol = false;
    boolean lastEqual = false;

//    main function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Giving a name to all the buttons
        Button oneBtn = findViewById(R.id.one);
        Button twoBtn = findViewById(R.id.two);
        Button threeBtn = findViewById(R.id.three);
        Button fourBtn = findViewById(R.id.four);
        Button fiveBtn = findViewById(R.id.five);
        Button sixBtn = findViewById(R.id.six);
        Button sevenBtn = findViewById(R.id.seven);
        Button eightBtn = findViewById(R.id.eight);
        Button nineBtn= findViewById(R.id.nine);
        Button zeroBtn= findViewById(R.id.zero);
        Button pointBtn = findViewById(R.id.point);
        Button plusBtn = findViewById(R.id.plus);
        Button minusBtn = findViewById(R.id.minus);
        Button multiplyBtn = findViewById(R.id.multiply);
        Button divideBtn = findViewById(R.id.divide);
        Button percentageBtn = findViewById(R.id.percentage);
        Button equalBtn = findViewById(R.id.equal);
        Button deleteBtn = findViewById(R.id.delete);
        Button clearBtn = findViewById(R.id.cancel);

        final TextView screen1 = findViewById(R.id.Digit1);
        final TextView screen2 = findViewById(R.id.Digit2);

//        1 will be shown using this
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkEqual();
                temp = 1;
                digit1 = digit1  + 1;
                screen1.setText(digit1);
            }
        });

//        2 will be shown using this
        twoBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkEqual();
                temp = 2;
                digit1 += 2;
                screen1.setText(digit1);
            }
        });

//        3 will be shown using this
        threeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkEqual();
                temp = 3;
                digit1 += 3;
                screen1.setText(digit1);
            }
        });

//        4 will be shown using this
        fourBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkEqual();
                temp = 4;
                digit1 += 4;
                screen1.setText(digit1);
            }
        });

//        5 will be shown using this
        fiveBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkEqual();
                temp = 5;
                digit1 += 5;
                screen1.setText(digit1);
            }
        });

//        6 will be shown using this
        sixBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkEqual();
                temp = 6;
                digit1 += 6;
                screen1.setText(digit1);
            }
        });

//        7 will be shown using this
        sevenBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkEqual();
                temp = 7;
                digit1 += 7;
                screen1.setText(digit1);
            }
        });

//        8 will be shown using this
        eightBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkEqual();
                temp = 8;
                digit1 += 8;
                screen1.setText(digit1);
            }
        });

//        9 will be shown using this
        nineBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkEqual();
                temp = 9;
                digit1 += 9;
                screen1.setText(digit1);
            }
        });

//        0 will be shown using this
        zeroBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkEqual();
                temp = 0;
                digit1 += 0;
                screen1.setText(digit1);
            }
        });

//        point will be shown using this
        pointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(digit1.equals("")){
                    digit1 +="0.";
                }else{
                    if(digit1.contains(".")){
                        digit1 += "";
                    }else{
                        digit1 += ".";
                    }
                }
                temp = '.';
                screen1.setText(digit1);
            }
        });

//        function call for the + symbol
        plusBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(hasSymbol){
                    if(digit1.equals("")){
                        symbol = '+';
                        answer = digit2 + "+";
                    }else{
                        result = calculateResult(digit2, digit1, symbol);
                        int resultInt = (int)result;
                        if(result == resultInt){
                            answer = resultInt + "+";
                        }else{
                            answer = result + "+";
                        }
                        digit2 = result + "";
                    }

                }else{
                    checkDigit();
                    hasSymbol = true;
                    answer = digit1 + "+";
                    digit2 = digit1;
                }
                screen2.setText(answer);
                digit1 = "";
                screen1.setText(digit1);
                symbol = '+';
                temp = '+';
            }
        });

//        function call for the - symbol
        minusBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(hasSymbol){

                    if(digit1.equals("")){
                        symbol = '-';
                        answer = digit2 + "-";
                    }else{
                        result = calculateResult(digit2, digit1, symbol);
                        int resultInt = (int)result;
                        if(result == resultInt){
                            answer = resultInt + "-";
                        }else{
                            answer = result + "-";
                        }
                        digit2 = result + "";
                    }

                }else{
                    checkDigit();
                    hasSymbol = true;
                    answer = digit1 + "-";
                    digit2 = digit1;
                }
                screen2.setText(answer);
                digit1 = "";
                screen1.setText(digit1);
                symbol = '-';
            }
        });
//        function call for the * symbol
        multiplyBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(hasSymbol){

                    if(digit1.equals("")){
                        symbol = 'X';
                        answer = digit2 + "X";
                    }else{
                        result = calculateResult(digit2, digit1, symbol);
                        int resultInt = (int)result;
                        if(result == resultInt){
                            answer = resultInt + "X";
                        }else{
                            answer = result + "X";
                        }
                        digit2 = result + "";
                    }

                }else{
                    checkDigit();
                    hasSymbol = true;
                    answer = digit1 + "X";
                    digit2 = digit1;
                }
                screen2.setText(answer);
                digit1 = "";
                screen1.setText(digit1);
                symbol = 'X';
            }
        });

//        function call for the / symbol
        divideBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(hasSymbol){

                    if(digit1.equals("")){
                        symbol = '/';
                        answer = digit2 + "/";
                    }else{
                        result = calculateResult(digit2, digit1, symbol);
                        int resultInt = (int)result;
                        if(result == resultInt){
                            answer = resultInt + "/";
                        }else{
                            answer = result + "/";
                        }
                        digit2 = result + "";
                    }

                }else{
                    checkDigit();
                    hasSymbol = true;
                    answer = digit1 + "/";
                    digit2 = digit1;
                }
                screen2.setText(answer);
                digit1 = "";
                screen1.setText(digit1);
                symbol = '/';
            }
        });

//        function call for the % symbol
        percentageBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(hasSymbol){

                    if(digit1.equals("")){
                        symbol = '%';
                        answer = digit2 + "%";
                    }else{
                        result = calculateResult(digit2, digit1, symbol);
                        int resultInt = (int)result;
                        if(result == resultInt){
                            answer = resultInt + "%";
                        }else{
                            answer = result + "%";
                        }
                        digit2 = result + "";
                    }

                }else{
                    checkDigit();
                    hasSymbol = true;
                    answer = digit1 + "%";
                    digit2 = digit1;
                }
                screen2.setText(answer);
                digit1 = "";
                screen1.setText(digit1);
                symbol = '%';
            }
        });

//        function call for the final answer
        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hasSymbol){

                    if(digit1.equals("")){
                        answer = digit2;
                    }else{
                        double result = calculateResult(digit2, digit1, symbol);
                        int resultInt = (int)result;
                        if(result == resultInt){
                            answer = resultInt + "";
                        }else{
                            answer = result + "";
                        }
                    }
                    screen1.setText(answer);
                    screen2.setText("");
                    digit1 = answer;
                    digit2 = "";
                    hasSymbol = false;
                    answer = "";
                    lastEqual = true;
                }else{
                    screen1.setText(digit1);
                }
            }
        });

//        To delete all the entries
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                digit1 = "";
                digit2 = "";
                screen1.setText("0");
                screen2.setText("");
                hasSymbol = false;
                answer = "";
                result = 0;
                lastEqual = false;
            }
        });

//        to delete the last entry
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lastEqual){
                    digit1 = "";
                    digit2 = "";
                    screen1.setText("0");
                    screen2.setText("");
                    hasSymbol = false;
                    answer = "";
                    result = 0;
                    lastEqual = false;
                }else{
                    if(digit1.equals("")){
                        digit1 = "";
                        screen1.setText("0");
                    }else{
                        digit1 = digit1.substring(0, digit1.length() - 1);
                        screen1.setText(digit1);
                    }
                }
            }
        });
    }

//    function for the calculations of the calculator
    private double calculateResult(String first, String second, char sign){

        double num1 = Double.parseDouble(first);
        double num2 = Double.parseDouble(second);
        double result = 0;

        switch(sign){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'X':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = (num1 * num2) / 100;
        }
        return result;
    }

//    Check if the last action was of equal or not
    private void checkEqual(){
        if(lastEqual){
            digit1 = "";
            lastEqual = false;
        }
    }

    private void checkDigit(){
        if(digit1.equals("")){
            digit1 = "0";
        }
    }
}
