package com.example.metricconversion043;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   EditText ed1,ed2;
   Spinner sp1,sp2,sp3;
    List <String> converter,currency,length,weight;
    ArrayAdapter <String> a1,a2;
 public    String s1;
 public   double Value,input1;
    double [][] cc=new double[][] {{1,0.0062,0.023,0.0057,0.0050},{161,1,3.76,0.92,0.81},{42.82,0.27,1,0.25,0.22},{174.23,1.08,4.07,1,0.88},{200,1.24,4.65,1.14,1}};
    double [][] lc=new double[][] {{1,10,0.39,0.033,0.01,0.00001,0.0000062137},{0.1,1,0.039,0.0033,0.001,0.000001,0.00000062137}
            ,{2.54,25.4,1,0.083,0.0254,0.0000254,0.00001578},
            {30.48,304.8,12,1,0.3048,0.0003048,0.0001894},
            {100,1000,39.37,3.28,1,0.001,0.00062137},
            {100000,1000000,39370,3280.84,1000,1,0.62137},{160934,1609344,63360,52800,1609.34,1.61,1}};
    double [][] wc=new  double[][] {{1,1000,2.204,35.27},{1000,1,0.0022,0.0353},{0.453,453.6,1,16},{0.028,28.35,0.0625,1}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1=(Spinner)findViewById(R.id.sp1);
        sp2=(Spinner)findViewById(R.id.sp2);
        sp3=(Spinner)findViewById(R.id.sp3);
        ed1=(EditText) findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);

       Adapters();
       Operations();

    }
    // ADAPTERS ONLY ************
    public void Adapters() {
        currency=new ArrayList<>();
        length=new ArrayList<>();
        weight=new ArrayList<>();
        converter=new ArrayList<>();
        converter.add(0, "Currency");
        converter.add(1, "Lengths");
        converter.add(2,"Weights");
        a1=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,converter);
        sp1.setAdapter(a1);
        currency.add("PKR");
        currency.add("USD");
        currency.add("Saudi Riyal");
        currency.add("Euro");
        currency.add("Pound Sterling");
        length.add("cm");
        length.add("mm");
        length.add("inch");
        length.add("foot");
        length.add("m");
        length.add("km");
        length.add("Mile");
        weight.add("Kg");
        weight.add("g");
        weight.add("Pound");
        weight.add("Ounce");
//  SPINNER 1
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position==0){
            a2=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,currency);
        }
        if(position==1){
             a2=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,length);
        }
        if(position==2){
             a2=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,weight);
        }
        sp2.setAdapter(a2);
        sp3.setAdapter(a2);
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
});
    }
                        // OPERATIONS STARTS FROM HERE **********
public void Operations(){

     sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {                    //  SPINNER 2
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position2, long id) {         // ERROR1 EXPECTATION HERE ON

            s1=ed1.getText().toString();
             int p1=sp2.getSelectedItemPosition();
             int p2=sp3.getSelectedItemPosition();

                 if(sp1.getSelectedItemPosition()==0){
                     if(s1.length()>0){
                         input1=Double.parseDouble(s1);
                    Value=input1*cc[p1][p2];
                     ed2.setText(String.valueOf(Value));} }

                 if(sp1.getSelectedItemPosition()==1){
                     if(s1.length()>0){
                         input1=Double.parseDouble(s1);
                   Value=input1*lc[p1][p2];
                     ed2.setText(String.valueOf(Value));} }

                 if(sp1.getSelectedItemPosition()==2) {
                     if (s1.length() > 0) {
                         input1=Double.parseDouble(s1);
                         Value = input1 * wc[p1][p2];
                         ed2.setText(String.valueOf(Value));
                     }
                 } }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
     });
    sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {              //  SPINNER 3
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position2, long id) {         // ERROR2 EXPECTATION REMOVED

            s1=ed1.getText().toString();
        int p1=sp2.getSelectedItemPosition();
        int p2=sp3.getSelectedItemPosition();
            if (s1.length() > 0) {

            if(sp1.getSelectedItemPosition()==0){
                input1=Double.parseDouble(s1);
                Value=input1*cc[p1][p2];
                ed2.setText(String.valueOf(Value)); }

            if(sp1.getSelectedItemPosition()==1){
                input1=Double.parseDouble(s1);
                Value=input1*lc[p1][p2];
                ed2.setText(String.valueOf(Value)); }

            if(sp1.getSelectedItemPosition()==2) {
                input1=Double.parseDouble(s1);
                Value = input1 * wc[p1][p2];
                ed2.setText(String.valueOf(Value));

        } }}

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });
ed1.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        s1 = ed1.getText().toString();
        int p1 = sp2.getSelectedItemPosition();
        int p2 = sp3.getSelectedItemPosition();
if(ed1.isFocused()){

        if (sp1.getSelectedItemPosition() == 0) {
            if (s1.length() > 0) {
            input1 = Double.parseDouble(s1);
                Value = input1 * cc[p1][p2];
                ed2.setText(String.valueOf(Value));}
        }
        if (sp1.getSelectedItemPosition() == 1) {
            if (s1.length() > 0) {
                input1 = Double.parseDouble(s1);
                Value = input1 * lc[p1][p2];
                ed2.setText(String.valueOf(Value));}
        }
        if (sp1.getSelectedItemPosition() == 2) {
            if (s1.length() > 0) {
            input1 = Double.parseDouble(s1);
            Value = input1 * wc[p1][p2];
            ed2.setText(String.valueOf(Value));}
        }
        }
    }


    @Override
    public void afterTextChanged(Editable s) {

    }
});

    ed2.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            s1 = ed2.getText().toString();
            int p1 = sp2.getSelectedItemPosition();
            int p2 = sp3.getSelectedItemPosition();
            if(ed2.isFocused()){

                    if (sp1.getSelectedItemPosition() == 0) {
                        if (s1.length() > 0) {
                        input1 = Double.parseDouble(s1);
                        Value = input1 * cc[p2][p1];
                        ed1.setText(String.valueOf(Value));}
                    }
                    if (sp1.getSelectedItemPosition() == 1) {
                        if (s1.length() > 0) {
                        input1 = Double.parseDouble(s1);
                        Value = input1 * lc[p2][p1];
                        ed1.setText(String.valueOf(Value));}
                    }
                    if (sp1.getSelectedItemPosition() == 2) {
                        if (s1.length() > 0) {
                        input1 = Double.parseDouble(s1);
                        Value = input1 * wc[p2][p1];
                        ed1.setText(String.valueOf(Value));}
                    }
                }
            }


        @Override
        public void afterTextChanged(Editable s) {
        }
    }); //****** END OF OPERATIONS **

    // RESETTING COUNTER *********************
Button b =new Button(getApplicationContext());
ConstraintLayout cl=(ConstraintLayout)findViewById(R.id.c);
cl.addView(b);
    b.setX(400);
    b.setY(600);
    b.setBackgroundColor(Color.CYAN);
    b.setText("RESET");
    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ed1.setText("");
            ed2.setText("");
            Value=0;
            input1=0;
        }
    });

    }
}

