package com.example.value;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    Button button_1;
    Button button_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout)findViewById(R.id.ln);
        button_1 = (Button)findViewById(R.id.btn_1);
        button_2 = (Button)findViewById(R.id.btn_2);

        button_1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(Color.parseColor("#f44336"),
                                                   Color.parseColor("#9c27b0"));

                        valueAnimator.setEvaluator(new ArgbEvaluator());
                        valueAnimator.addUpdateListener(

                                new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public void onAnimationUpdate(ValueAnimator animation) {
                                        linearLayout.setBackgroundColor((Integer) animation.getAnimatedValue());

                                    }
                                }
                        );

                        valueAnimator.setDuration(4000);
                        valueAnimator.start();

                    }
                }
        );

        button_2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(Color.parseColor("#ffffff"),
                                                   Color.parseColor("#ff9900"));

                        valueAnimator.setEvaluator(new ArgbEvaluator());
                        valueAnimator.addUpdateListener(

                                new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public void onAnimationUpdate(ValueAnimator animation) {
                                        linearLayout.setBackgroundColor((Integer) animation.getAnimatedValue());

                                    }
                                }
                        );

                        valueAnimator.setDuration(4000);
                        valueAnimator.start();

                    }
                }
        );
    }
}
