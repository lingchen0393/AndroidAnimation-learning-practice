package com.example.resources;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.img);
        button1 = (Button)findViewById(R.id.alpha_btn);
        button2 = (Button)findViewById(R.id.trans_btn);
        button3 = (Button)findViewById(R.id.rotate_btn);
        button4 = (Button)findViewById(R.id.scale_btn);
        button5 = (Button)findViewById(R.id.combo_btn);

        myAnimation(button1, R.animator.fade);
        myAnimation(button2, R.animator.translation);
        myAnimation(button3, R.animator.rotation);
        myAnimation(button4, R.animator.scale);
        myAnimation(button5, R.animator.combo);

    }

    public void myAnimation(View view, final int r){
        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Animator animator = AnimatorInflater.loadAnimator(MainActivity.this, r);
                        animator.setTarget(imageView);
                        animator.start();
                        return;
                    }
                }
        );
    }
}
