package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button_1,button_2,button_3,button_4;
    Button button_5,button_6,button_7,button_8;
    Button button_0,button_LBracket,button_RBracket,button_9;
    Button button_Minus,button_Plus,button_Multiply,button_Divide;
    Button button_C,button_AC,button_dot,button_Equal;

    TextView solution,result;
    boolean plus,minus,multi,plenty;
    float v1,v2;
    String sol="",res="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.result);
        solution=findViewById(R.id.solution);
        button_1=findViewById(R.id.button_1);
        button_2=findViewById(R.id.button_2);
        button_3=findViewById(R.id.button_3);
        button_4=findViewById(R.id.button_4);
        button_5=findViewById(R.id.button_5);
        button_6=findViewById(R.id.button_6);
        button_7=findViewById(R.id.button_7);
        button_8=findViewById(R.id.button_8);
        button_9=findViewById(R.id.button_9);
        button_0=findViewById(R.id.button_0);
        button_Equal=findViewById(R.id.button_Equal);
        button_Plus=findViewById(R.id.button_Plus);
        button_LBracket=findViewById(R.id.button_LBracket);
        button_Minus=findViewById(R.id.button_Minus);
        button_Multiply=findViewById(R.id.button_Multiply);
        button_C=findViewById(R.id.button_C);
        button_dot=findViewById(R.id.button_dot);
        button_AC=findViewById(R.id.button_AC);
        button_Divide=findViewById(R.id.button_Divide);
        button_RBracket=findViewById(R.id.button_RBracket);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"1";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);



            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"2";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);


            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"3";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);



            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"4";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);


            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"5";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);

            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"6";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);



            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"7";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);


            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"8";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);

            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"9";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);

            }
        });
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"0";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);


            }
        });
        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+".";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);

            }
        });
        button_RBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"(";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);


            }
        });
        button_LBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+")";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);


            }
        });
        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
                sol="";
                res="0";
                solution.setText("");

            }
        });
        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=solution.getText().toString();
                s=s.substring(0,s.length()-1);
                sol=sol.substring(0,sol.length()-1);
                res="0";
                result.setText(res);
                sol=sol.replace("*","X");
                solution.setText(sol);
            }
        });
        button_Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"+";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);
                }
        });
        button_Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sol=sol+"-";
                result.setText("");
                result.setText(res);
                solution.setText(sol);

            }
        });
        button_Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"X";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);


            }
        });
        button_Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sol=sol+"/";
                    result.setText("");
                    result.setText(res);
                    solution.setText(sol);

            }
        });
        button_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 sol= solution.getText().toString();

                 sol=sol.replaceAll("X","*");

                 Expression exp=new Expression(sol);

                sol=sol.replace("*","X");


                res=String.valueOf(exp.calculate());
                result.setText(res);


            }
        });
    }
}