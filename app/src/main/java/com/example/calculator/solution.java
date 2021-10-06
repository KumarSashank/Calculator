package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class solution extends AppCompatActivity {

    public EditText a,b;
    public Button mbutton;
    public TextView solution,header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);

        a=findViewById(R.id.num1);
        b=findViewById(R.id.num2);
        mbutton=findViewById(R.id.button);
        solution=findViewById(R.id.solution);
        header=findViewById(R.id.header);
        Intent sol = getIntent();
        String heading = sol.getStringExtra("Heading");
        String button = sol.getStringExtra("Button");
        String answer = sol.getStringExtra("Answer");
        Integer i = sol.getIntExtra("switch",1);

        switch (i)
        {
            case 1 :header.setText("Addition");

                    mbutton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String s1= a.getText().toString();
                            String s2= b.getText().toString();

                            Integer x=Integer.parseInt(s1);
                            Integer y=Integer.parseInt(s2);
                            Integer sum=x+y;

                            solution.setText("Sum is "+sum);
                        }
                    });
                    break;

            case 2 : header.setText("Subtraction");

                        mbutton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String s1= a.getText().toString();
                                String s2= b.getText().toString();

                                Integer x=Integer.parseInt(s1);
                                Integer y=Integer.parseInt(s2);
                                Integer diff=x-y;

                                solution.setText("Difference is "+diff);
                            }
                        });
                        break;

            case 3 : header.setText("Multiplication");

                mbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1= a.getText().toString();
                        String s2= b.getText().toString();

                        Integer x=Integer.parseInt(s1);
                        Integer y=Integer.parseInt(s2);
                        Integer mult=x*y;

                        solution.setText("Product is "+mult);
                    }
                });
                break;

            case 4 : header.setText("Division");

                mbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s1= a.getText().toString();
                        String s2= b.getText().toString();

                        Integer x=Integer.parseInt(s1);
                        Integer y=Integer.parseInt(s2);
                        double div=(double)x/y;

                        solution.setText("Division is "+div);
                    }
                });
                break;

        }
    }
}