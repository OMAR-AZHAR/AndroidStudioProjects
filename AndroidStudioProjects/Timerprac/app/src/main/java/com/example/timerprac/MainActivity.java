package com.example.timerprac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b;
ConstraintLayout cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
animate1();
    }

    private void animate1() {
        b=(Button)findViewById(R.id.b1);
        cl=(ConstraintLayout)findViewById(R.id.c);
        b.animate().translationY(900).setDuration(6000);
    }


}

