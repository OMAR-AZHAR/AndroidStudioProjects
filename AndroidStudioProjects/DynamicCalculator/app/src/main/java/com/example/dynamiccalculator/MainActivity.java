package com.example.dynamiccalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ed;
ConstraintLayout cl;
Button[] b,b2;
    public    double res=0;
    public   double f1=0,f2=0;
  public  String opr,add,add2;
  boolean p1,p2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       cButtons();
       operations();
    }



    public void cButtons() {

        b=new Button[11];
        cl=(ConstraintLayout)findViewById(R.id.cl);
       ed = (EditText)findViewById(R.id.ed);
       //cl.addView(ed,650,150);
        float x=0;
        float y=0;
        for(int i = 0; i<10; ++i)
        {
            b[i]=new Button(getApplicationContext());
            cl.addView(b[i]);
          //  b[i].setBackgroundColor(Color.MAGENTA);
            b[i].setText(String.valueOf(i));
            b[i].setTextSize(25);
            if(i%3==0){
                x=25;
                y+= 150;
            }
            b[i].setX(x);
            b[i].setY(y);
            x+=170;
            final int finaltemp = i;
            b[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed.setText(ed.getText().toString()+b[finaltemp].getText().toString());
                }
            });
        }                 // END FOR LOOP

       b[9].setX(200);    //For 9

        b2=new Button[8];        //for operations and decimal
      float a=290;
      float b=50; // for top to down
        for(int j=0;j<8;++j){
            b2[j]=new Button(getApplicationContext());
            cl.addView(b2[j]);
            b2[j].setTextSize(18);

            a=550; //moves 1 col buttons on x
                b+=100; // for btw buttons (top to down)
            b2[j].setX(a);
            b2[j].setY(b);
            a+=320;

        }
        b2[0].setText("+");
        b2[1].setText("-");
        b2[2].setText("x");
        b2[3].setText("/");
        b2[4].setText("=");
        b2[5].setText(".");
        b2[6].setText("CE");
        b2[7].setText("RST");

    }
   public void operations() {



    b2[0].setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            add=ed.getText().toString();
             f1=Double.parseDouble(add);
            opr="+";
            ed.setText("");
        }});
       b2[1].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               add=ed.getText().toString();
               f1=Double.parseDouble(add);
              opr="-";
               ed.setText("");
           }});
       b2[2].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               add=ed.getText().toString();
               f1=Double.parseDouble(add);
                  opr="x";
               ed.setText("");
           }});
       b2[3].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

              add=ed.getText().toString();
               f1=Double.parseDouble(add);
              opr="/";
               ed.setText("");
           }});

       b2[5].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

            add=ed.getText().toString();
               f1=Double.parseDouble(add);
                   opr=".";
                   ed.setText(ed.getText().toString()+".");
           }});
       b2[6].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

                add=ed.getText().toString();
               f1=Double.parseDouble(add);
                 opr="CE";
               ed.setText(ed.getText().toString().substring(0, ed.getText().length() - 1));

           }});
       b2[7].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               opr="RST";
               f1=0;
               f2=0;
               ed.setText(" ");
           }});


       // NOW FOR RESULT FETCHING


       b2[4].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               if(opr=="+" ){
                   add2=ed.getText().toString();
                   f2=Double.parseDouble(add2);
                   res=f1+f2;

               }
              else if(opr=="-"){
                   String add2=ed.getText().toString();
                   f2=Double.parseDouble(add2);
                   res=f1-f2;

               }
              else if(opr=="x"){
                   String  add2=ed.getText().toString();
                   f2=Double.parseDouble(add2);
                   res=f1*f2;

               }
               else if (opr=="/"){
                   String  add2=ed.getText().toString();
                   f2=Double.parseDouble(add2);
                   res=f1/f2;

               }


 ed.setText(String.valueOf(res));
           }});




    }

    }

