package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class solution extends AppCompatActivity {

    public EditText a,b;
    public Button mbutton;
    public TextView solution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);

        a=findViewById(R.id.num1);
        b=findViewById(R.id.num2);
        mbutton=findViewById(R.id.button);
        solution=findViewById(R.id.solution);

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
    }
}