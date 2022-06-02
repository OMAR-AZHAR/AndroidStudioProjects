package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
EditText ed=(EditText)findViewById(R.id.ed1);
    TextView tv=(TextView)findViewById(R.id.tv1);
    String s =ed.getText().toString();
    public void find(View v){

     //   int count = 0;

        int upper = 0, lower = 0, number = 0, special = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }
        tv.setText("UpperCase Words"+String.valueOf(upper));
        tv.setText("Lower Case"+String.valueOf(lower));
        tv.setText("Numbers"+String.valueOf(number));
        tv.setText("Special"+String.valueOf(special));
}}
