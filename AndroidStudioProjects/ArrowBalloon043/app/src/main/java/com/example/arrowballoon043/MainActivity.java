package com.example.arrowballoon043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intentcreate();
    }

    public void intentcreate(){
        b=(Button)findViewById(R.id.btn1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent my =new Intent(getApplicationContext(),BowsArrows.class);
              startActivity(my);
            }
        });
    }

    public void quit(View view){
        this.finish();
    }
}
