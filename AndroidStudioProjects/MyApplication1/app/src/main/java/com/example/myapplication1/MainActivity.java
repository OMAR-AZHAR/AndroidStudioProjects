package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    float n1;
    float n2;
    float res=0;
    String oper;
    TextView tv=(TextView) findViewById(R.id.tv);
    public void one(View v){
    TextView tvone= (TextView) findViewById(R.id.tv);
    tvone.setText(tvone.getText().toString()+"1");
    }
    public void two(View v){
        TextView t2= (TextView) findViewById(R.id.tv);
        t2.setText(t2.getText().toString()+"2");
    }
    public void three(View v){
        TextView t3= (TextView) findViewById(R.id.tv);
        t3.setText(t3.getText().toString()+"3");
    }
    public void four(View v){
        TextView t4= (TextView) findViewById(R.id.tv);
        t4.setText(t4.getText().toString()+"4");
    }
    public void five(View v){
        TextView t5= (TextView) findViewById(R.id.tv);
        t5.setText(t5.getText().toString()+"5");
    }
    public void six(View v){
        TextView t6= (TextView) findViewById(R.id.tv);
        t6.setText(t6.getText().toString()+"6");
    }
    public void seven(View v){
        TextView t7= (TextView) findViewById(R.id.tv);
        t7.setText(t7.getText().toString()+"7");
    }
    public void eight(View v){
        TextView t8= (TextView) findViewById(R.id.tv);
        t8.setText(t8.getText().toString()+"8");
    }
    public void nine(View v){
        TextView t9= (TextView) findViewById(R.id.tv);
        t9.setText(t9.getText().toString()+"9");
    }
    public void zero(View v){
        TextView t0= (TextView) findViewById(R.id.tv);
        t0.setText(t0.getText().toString()+"0");
    }
    public void decimal(View v) {
        TextView tvdec=(TextView) findViewById(R.id.dec);
        tvdec.setText(tvdec.getText()+".");
    }
   public void add(View v){
       String s = tv.getText().toString();
       tv.setText("");
       oper="+";

        n1=Float.parseFloat(s);
      //  tv.setText(String.valueOf(n1));


    }
    public void mns(View v){
        String s = tv.getText().toString();
        tv.setText("");
          oper="-";

        n1=Float.parseFloat(s);
        //  tv.setText(String.valueOf(n1));


    }
    public void mult(View v){
        String s = tv.getText().toString();
        tv.setText("");
        oper="*";

        n1=Float.parseFloat(s);
    }
    public void div(View v){      //division
        String s = tv.getText().toString();
        tv.setText("");
         oper="/";
        n1=Float.parseFloat(s);
    }
    public void clr(View v){        //clear screen
        tv.setText("");
    }


    public void res (View v){
        String s2=tv.getText().toString();
        n2=Float.parseFloat(s2);
        if(oper=="+"){
            res=n1+n2;
            tv.setText(String.valueOf(res));
        }
        if(oper=="-")
        {res=n1-n2;
            tv.setText(String.valueOf(res));
    }
        if(oper=="*"){
            res=n1*n2;
            tv.setText(String.valueOf(res));
        }
        if(oper=="/")
        {res=n1/n2;
            tv.setText(String.valueOf(res));
        }
      /*  if(oper=="%")
        {res=n1%n2;
            tv.setText(String.valueOf(res));
        }*/

    }}
