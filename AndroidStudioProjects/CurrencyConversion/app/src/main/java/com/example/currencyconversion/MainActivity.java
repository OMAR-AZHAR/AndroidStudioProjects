package com.example.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Spinner sp ,sp2;
    String s;
    double [] value = new double[]{1,167.7,182,209,44.45};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1= findViewById(R.id.ed1);
        ed2= findViewById(R.id.ed22);
        sp= findViewById(R.id.spinner1);
        sp= findViewById(R.id.spinner2);
s=ed1.getText().toString();
ed1.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
ed1.setText("bef:"+ s.toString());

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
});
    }
   /* public void convert(){
        double val=0;

        String s= ed1.getText().toString();
        double f1=Double.parseDouble(s);
        if (s.length()>0){
            String v1 = String.valueOf(sp.getSelectedItem());
            if(v1.equals("USD")){
                val=f1*167;
            }
            if(v1.equals("Euro")){
                val=f1*182.35;
            }
            if(v1.equals("Pound Sterling")){
                val=f1*209.21;
            }
            if(v1.equals("Saudi Riyal")){
                val=f1*44.49;
            }

            tv.setText(val + "PKR");
        }}*/
}
