package com.example.backcolorchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }ConstraintLayout c =(ConstraintLayout) findViewById(R.id.cl);
    public void change(View v){

        Button b = (Button)v;
        ColorDrawable d =(ColorDrawable) b.getBackground();
        c.setBackgroundColor(d.getColor());

    }
}

