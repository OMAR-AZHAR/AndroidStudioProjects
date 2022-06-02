package com.example.bubble_smashing043;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.projection.MediaProjection;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
Button b;
VideoView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= (Button)findViewById(R.id.btn);
        v=(VideoView)findViewById(R.id.videoView);
        v.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.bb);

        v.start();
       v.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
           @Override
           public void onCompletion(MediaPlayer mp) {
               v.start();
           }
       });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bubbles = new Intent(getApplicationContext(),bubblesgame.class);
                startActivity(bubbles);
            }
        });

    }
    public void kill(View v){
        finish();
    }

}
