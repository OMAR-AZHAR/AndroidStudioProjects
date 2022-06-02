package com.example.bubble_smashing043;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class bubblesgame extends AppCompatActivity {

int[] b = new int[]{R.drawable.b2,R.drawable.bubble1,R.drawable.blue,R.drawable.yellow,R.drawable.green,R.drawable.dgreen,R.drawable.red,R.drawable.purple,R.drawable.b2,R.drawable.bubble1,R.drawable.blue,R.drawable.yellow,R.drawable.green,R.drawable.dgreen,R.drawable.red,R.drawable.purple,R.drawable.yellow,R.drawable.green,R.drawable.dgreen,R.drawable.red,R.drawable.purple,R.drawable.yellow,R.drawable.green,R.drawable.dgreen,R.drawable.red,R.drawable.purple,R.drawable.yellow,R.drawable.green,R.drawable.dgreen,R.drawable.red,R.drawable.purple,R.drawable.yellow,R.drawable.green,R.drawable.dgreen,R.drawable.red,R.drawable.purple,R.drawable.yellow};
Random rand;
ImageView img,img1,img2,img3,img4;
SharedPreferences sp;
int s,l=3,w;
Button sav;
    TextView tv1,tv2;
ConstraintLayout cl2;
    CountDownTimer cd1;
    float x=0,y=0;
            int ind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubblesgame);
       bubbles();


    }


    private void bubbles() {
        tv1=(TextView) findViewById(R.id.textView4);
        tv2=(TextView) findViewById(R.id.textView3);
sav=(Button)findViewById(R.id.sav);

        sp=this.getSharedPreferences("Stats", Context.MODE_PRIVATE);
       s = sp.getInt("tv1",0);
        l = sp.getInt("tv2",3);
        tv1.setText("Scores:");
tv2.setText("Lives:");
        cl2 = (ConstraintLayout) findViewById(R.id.cl2);
        rand = new Random();
        cd1 = new CountDownTimer(20000, 2700) {
            @Override
            public void onTick(long millisUntilFinished) {
                for (int i = rand.nextInt(b.length); i < b.length; ++i) {

                    img = new ImageView(getApplicationContext());
                    img.setImageResource(b[i]);
                    cl2.addView(img);

                    img.getLayoutParams().height = 150;
                    img.getLayoutParams().width = 150;
                 //   img.setScaleType(ImageView.ScaleType.FIT_XY);

                    if (i % 3 == 0){
                        x = 200;
                        y += 590;
                }

                    img.setX(x);
                    img.setY(y);
                    x += 170;


                    img.animate().translationY(-600).setDuration(22000);


                    img.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {


                            Toast.makeText(bubblesgame.this, "Splashed!", Toast.LENGTH_SHORT).show();
                             img.setVisibility(View.INVISIBLE);

                             s++;

                            tv1.setText("Score:" + String.valueOf(s));
         //


                                return false;
                        }
                    });
                 /*   cl2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            l--;
                            tv2.setText("Lives:" + String.valueOf(l));
                            if(l==0){
                            this.finish();
                            }
                        }
                    });*/

                }

            }

            @Override
            public void onFinish() {
            start();
            }


        }.start();
sav.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        SharedPreferences.Editor ed=sp.edit();
        ed.putInt("Score",s);
        ed.putInt("Lives",l);
        ed.commit();
    }
});



    }



    public void exit(View v){
        this.finish();
    }

    public void quit(View v){
        l--;
        tv2.setText("Lives:" + String.valueOf(l));
        if(l==0){
            Toast.makeText(this, "Out of Lives", Toast.LENGTH_SHORT).show();
            this.finish();
        }

    }
}
