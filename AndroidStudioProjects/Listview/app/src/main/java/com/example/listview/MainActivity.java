package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lv;
ArrayList<String> vals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll();
    }

    private void ll() {
        lv=(ListView)findViewById(R.id.lv1);
        vals=new ArrayList<String>();
// PENDING AFTAAR BREAK*********************************************************************************************
        int[]imgs=new int[]{R.drawable.d,R.drawable.pp,R.drawable.s,R.drawable.d,R.drawable.serpent};
        String[] vals= new String[]{"Baba","Mama","Taba","Paba","Kaba","Raba","Qaba","Vaba"};
        myadapter ada = new myadapter(this,vals,imgs);

       /* vals.add("Ali");
        vals.add("Raze");
        vals.add("Ramsha");
        vals.add("Omar");
        vals.add("Baba");
        vals.add("Mama");
        vals.add("ufo");
        ArrayAdapter ada =new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,vals);
        lv.setAdapter(ada);*/

    }
}
