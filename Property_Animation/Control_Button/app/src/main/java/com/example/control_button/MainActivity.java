package com.example.control_button;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ObjectAnimator objectAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.img);

        objectAnimator = ObjectAnimator.ofFloat(imageView, View.ROTATION, 0, 360);
        objectAnimator.setDuration(2000);
        objectAnimator.setRepeatCount(5);
        objectAnimator.setRepeatMode(ObjectAnimator.RESTART);
    }

    public void start_btn(View v){
        objectAnimator.start();
    }

    public void end_btn(View v){
        objectAnimator.end();
    }

    public void cancel_btn(View v){
        objectAnimator.cancel();
    }

    public void pause_btn(View v){
        objectAnimator.pause();
    }

    public void resume_btn(View v){
        objectAnimator.resume();
    }
}
