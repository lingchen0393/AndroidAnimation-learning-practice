package com.example.object_translationeffect_alphaeffect;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView)findViewById(R.id.img);
        button = (Button)findViewById(R.id.btn);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        /**
                         * Translate Effect
                         */
//                        ObjectAnimator animator = ObjectAnimator.ofFloat(image, View.TRANSLATION_Y, 0, 300); //坐标轴为（0。300），
//                                                                                                                     // 延x轴右平移，也可y轴移动
//                        animator.setRepeatCount(1); //动画重复1次，共两次
//                        animator.setRepeatMode(ValueAnimator.REVERSE); //两次动画，第一个重复为反向，为一个来回
//                        animator.setDuration(4000);
//                        animator.start(); //动画启动

                        /**
                         * Alpha Effect
                         */
                        ObjectAnimator animator = ObjectAnimator.ofFloat(image, View.ALPHA, 1, 0);
                        animator.setDuration(4000);
                        animator.setRepeatMode(ValueAnimator.REVERSE);
                        animator.setRepeatCount(1);
                        animator.start();
                    }
                }
        );
    }
}
