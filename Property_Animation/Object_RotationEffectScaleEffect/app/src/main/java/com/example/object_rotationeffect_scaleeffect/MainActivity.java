package com.example.object_rotationeffect_scaleeffect;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.img);
        button = (Button)findViewById(R.id.btn);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        /**
                         * Rotation Effect 自旋转（x/y轴）
                         */

//                        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, View.ROTATION_Y, 0, 360);//从0度转到360度
//                        animator.setDuration(4000);
//                        animator.setRepeatMode(ValueAnimator.REVERSE);
//                        animator.setRepeatCount(5);
//                        animator.start();

                        /**
                         * Scale Effect 翻转
                         */

                        PropertyValuesHolder propertyValuesHolder_x = PropertyValuesHolder.ofFloat(View.SCALE_X, 1, 0);
                        PropertyValuesHolder propertyValuesHolder_y = PropertyValuesHolder.ofFloat(View.SCALE_Y, 0, 1);

                        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(imageView, propertyValuesHolder_x, propertyValuesHolder_y);
                        animator.setDuration(4000);
                        animator.setRepeatCount(1);
                        animator.setRepeatMode(ObjectAnimator.REVERSE);
                        animator.start();
                    }
                }
        );

    }
}
