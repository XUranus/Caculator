package com.xuranus.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static String play = "";
    static double A=0,B=0,res=0;
    static String op="";
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display =(TextView)findViewById(R.id.display);
        display.setText("");
        Button button0 = (Button)findViewById(R.id.button_0);
        Button button1 = (Button)findViewById(R.id.button_1);
        Button button2 = (Button)findViewById(R.id.button_2);
        Button button3 = (Button)findViewById(R.id.button_3);
        Button button4 = (Button)findViewById(R.id.button_4);
        Button button5 = (Button)findViewById(R.id.button_5);
        Button button6 = (Button)findViewById(R.id.button_6);
        Button button7 = (Button)findViewById(R.id.button_7);
        Button button8 = (Button)findViewById(R.id.button_8);
        Button button9 = (Button)findViewById(R.id.button_9);

        Button button_add = (Button)findViewById(R.id.button_add);
        Button button_sub = (Button)findViewById(R.id.button_sub);
        Button button_muti = (Button)findViewById(R.id.button_muti);
        Button button_div = (Button)findViewById(R.id.button_div);
        Button button_clear = (Button)findViewById(R.id.button_C);
        Button button_equals = (Button)findViewById(R.id.button_equals);
        Button button_percent = (Button)findViewById(R.id.button_percent);
        Button button_fu = (Button)findViewById(R.id.button_fu);
        Button button_point = (Button)findViewById(R.id.button_point);

        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(play!="") {
                    play = play + "0";
                    display.setText(play);
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                play = play + "1";
                display.setText(play);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                play = play + "2";
                display.setText(play);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                play = play + "3";
                display.setText(play);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                play = play + "4";
                display.setText(play);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                play = play + "5";
                display.setText(play);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                play = play + "6";
                display.setText(play);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                play = play + "7";
                display.setText(play);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                play = play + "8";
                display.setText(play);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                play = play + "9";
                display.setText(play);
            }
        });
        button_point.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                play = play + ".";
                display.setText(play);
            }
        });
        button_fu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                play = play + "-";
                display.setText(play);
            }
        });




        button_add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                A = Double.valueOf(play);
                op = "+";
                play="";
                display.setText(play);
            }
        });
        button_sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                A = Double.valueOf(play);
                op = "-";
                play="";
                display.setText(play);
            }
        });
        button_muti.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                A = Double.valueOf(play);
                op = "×";
                play="";
                display.setText(play);
            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                A = Double.valueOf(play);
                op = "÷";
                play="";
                display.setText(play);
            }
        });

        button_equals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                B = Double.valueOf(play);
                if(op!="") {
                    switch (op) {
                        case "+":
                            res = A + B;
                            play = Double.toString(res);
                            display.setText(play);
                            break;
                        case "-":
                            res = A - B;
                            play = Double.toString(res);
                            display.setText(play);
                            break;
                        case "×":
                            res = A * B;
                            play = Double.toString(res);
                            display.setText(play);
                            break;
                        case "÷":
                            res = A / B;
                            play = Double.toString(res);
                            display.setText(play);
                            break;
                    }
                }
                double t = Double.valueOf(play);
                if ((int)t == t)
                    play = Integer.toString((int)t);
                display.setText(play);
            }
        });

        button_clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                op="";
                A=0;
                B=0;
                play="";
                display.setText(play);
            }
        });
    }


}
