package com.example.sp18_bse_043_recview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {
RecyclerView rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc=(RecyclerView)findViewById(R.id.rc1);
       recvw rv=new recvw();
       rc.setAdapter(rv);
       rc.setLayoutManager(new LinearLayoutManager(this));
    }
}
