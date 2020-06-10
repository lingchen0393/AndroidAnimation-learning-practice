package com.example.layout_transition;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button_add;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.input_txt);
        button_add = (Button)findViewById(R.id.add_btn);
        linearLayout = (LinearLayout)findViewById(R.id.layout);

        button_add.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        final View addView = layoutInflater.inflate(R.layout.add_row, null);

                        TextView out_txt = (TextView)addView.findViewById(R.id.output_txt);
                        out_txt.setText(editText.getText().toString());

                        Button remove = (Button)addView.findViewById(R.id.remove_btn);

                        remove.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        ((LinearLayout)addView.getParent()).removeView(addView);
                                    }
                                }
                        );
                        linearLayout.addView(addView,0);
                    }
                }
        );
        LayoutTransition layoutTransition = new LayoutTransition();
        linearLayout.setLayoutTransition(layoutTransition);
    }
}
