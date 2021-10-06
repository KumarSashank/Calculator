package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Menu_Page extends AppCompatActivity {
    ImageView add,sub,multiply,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        add = findViewById(R.id.add_button);
        sub = findViewById(R.id.subtract_button);
        multiply = findViewById(R.id.Multiply_button);
        div = findViewById(R.id.Division_button);

        add.setOnClickListener(new button());
        sub.setOnClickListener(new button());
        multiply.setOnClickListener(new button());
        div.setOnClickListener(new button());

    }
    public class button implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.add_button:
                    Toast.makeText(getApplicationContext(), "Addition", Toast.LENGTH_SHORT).show();
                    solution("Addition","Sum","The sum is ",1 );
                    break;

                case R.id.subtract_button:
                    Toast.makeText(getApplicationContext(), "Subtraction", Toast.LENGTH_SHORT).show();
                    solution("Subtract","Diff","The difference is ",2 );
                    break;

                case R.id.Multiply_button:
                    Toast.makeText(getApplicationContext(), "Multiplication", Toast.LENGTH_SHORT).show();
                    solution("Multiply","Multiplication","The product is ",3 );
                    break;

                case R.id.Division_button:
                    Toast.makeText(getApplicationContext(), "Division", Toast.LENGTH_SHORT).show();
                    solution("Division","Divide","The quotient is ",4 );
                    break;

            }
        }
    }

    public void solution(String heading,String button,String text,int i) {
        Intent sol = new Intent(this, solution.class);
        sol.putExtra("Heading",heading);
        sol.putExtra("Button",button);
        sol.putExtra("Answer",text);
        sol.putExtra("switch",i);
        startActivity(sol);
    }
}