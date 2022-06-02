package com.example.arrowballoon043;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Random;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class BowsArrows extends AppCompatActivity {
public ImageView bow,img,burst;

int balloons [];
int ind,score=0,arrows=10;
Random rand ;
CountDownTimer cd,cd1;
ConstraintLayout cl;
public TextView tv1,tv2;
    float x = 0;
    float y = 800;
    float x1,y1;

public boolean t=true,t2=true,bb=true;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bows_arrows);
    balloon();
    tvs();

    }
public void tvs(){

}
    private void balloon() {
        Toast.makeText(getApplicationContext(), "WELCOME", Toast.LENGTH_SHORT).show();
        balloons = new int[]{R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5, R.drawable.b6, R.drawable.b7, R.drawable.b8, R.drawable.b9, R.drawable.b10, R.drawable.b11};
        cl = (ConstraintLayout) findViewById(R.id.c2);
        tv1 = (TextView) findViewById(R.id.tvscore);
        tv2 = (TextView) findViewById(R.id.tvarrows);
        bow = (ImageView) findViewById(R.id.bow);


rand=new Random();
       // ind=rand.nextInt(balloons.length);
        cd1= new CountDownTimer(20000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                for (ind=rand.nextInt(balloons.length); ind < balloons.length; ind++) {
                    img = new ImageView(getApplicationContext());
                    img.setImageResource(balloons[ind]);
                    cl.addView(img);

                    img.setScaleY(0.5f);
                    img.setScaleX(0.4f);

                        x = 300;
                        y += 590;


                    img.setX(x);
                    img.setY(y);

                    x += 170;

                    img.animate().translationY(-600).setDuration(24000);
                    if( img.getY()<=0 || img.getTranslationY()<=-100) {

                        cl.removeView(img);
                        ind=0;
                        Toast.makeText(getApplicationContext(), "Reached", Toast.LENGTH_SHORT).show();

                    }


}}

            @Override
            public void onFinish() {
start();
            }
        }.start();


        // FOR ARROW FIRED

        bow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView arrow = new ImageView(getApplicationContext());
                cl.addView(arrow);
                arrow.setImageResource(R.drawable.arrow2);
              //  arrow.setX(0);
                arrow.setY(300);
                arrow.setScaleX(0.2f);
                arrow.setScaleY(0.25f);


                    if (t2) {
                        //     arrow.animate().translationX(400).setDuration(100);
                        arrow.setX(400);

                        if(arrow.getX()==img.getX()){
                            burst=new ImageView(getApplicationContext());
                            img.setImageResource(R.drawable.bb);

                            score++;
                            arrows--;}


                            if(arrow.getX()!=img.getX()){
                                score--;
                                arrows--;
                            }
                            if(arrows==0){
                                Toast.makeText(BowsArrows.this, "No Arrows Left", Toast.LENGTH_SHORT).show();
                            }
                        t2 = false;
                    }


                    if (t2 = false) {
                        cl.removeView(arrow);
                        arrow.setX(0);

                        t2 = true;
                    }

                }
        });
        tv1.setText("Score:"+ score);
        tv2.setText("Arrows:"+arrows);
}

public void close(View view)
        {
        this.finish();
        }
}
