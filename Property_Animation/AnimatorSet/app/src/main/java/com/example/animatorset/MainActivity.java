package com.example.animatorset;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
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

                        ObjectAnimator objectAnimator_alpha = ObjectAnimator.ofFloat(imageView, View.ALPHA, 0, 1);
                        objectAnimator_alpha.setDuration(4000);

                        ObjectAnimator objectAnimator_trans = ObjectAnimator.ofFloat(imageView, View.TRANSLATION_X, -500, 1);
                        objectAnimator_trans.setDuration(4000);

                        ObjectAnimator objectAnimator_rotate = ObjectAnimator.ofFloat(imageView, View.ROTATION, 0, 360);
                        objectAnimator_rotate.setDuration(4000);

                        PropertyValuesHolder propertyValuesHolder_x = PropertyValuesHolder.ofFloat(View.SCALE_X, 0, 1);
                        PropertyValuesHolder propertyValuesHolder_y = PropertyValuesHolder.ofFloat(View.SCALE_Y, 0, 1);

                        ObjectAnimator objectAnimator_scale = ObjectAnimator.ofPropertyValuesHolder(imageView, propertyValuesHolder_x, propertyValuesHolder_y);

                        AnimatorSet animatorSet = new AnimatorSet();
                        //animatorSet.play(objectAnimator_alpha).before(objectAnimator_trans).after(objectAnimator_rotate).with(objectAnimator_scale);
                        //animatorSet.playSequentially(objectAnimator_alpha, objectAnimator_trans, objectAnimator_rotate, objectAnimator_scale);
                        animatorSet.playTogether(objectAnimator_alpha, objectAnimator_trans, objectAnimator_rotate, objectAnimator_scale);
                        animatorSet.start();

                    }
                }
        );
    }
}
