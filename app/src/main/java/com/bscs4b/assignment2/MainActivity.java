package com.bscs4b.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Name;
    Animation animation;
    Button B1,B2,B3,B4,B5,B6,B7,B8,STOP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=findViewById(R.id.textView2);
        B1=findViewById(R.id.button);
        B2=findViewById(R.id.button2);
        B3=findViewById(R.id.button3);
        B4=findViewById(R.id.button4);
        B5=findViewById(R.id.button5);
        B6=findViewById(R.id.button6);
        B7=findViewById(R.id.button11);
        B8=findViewById(R.id.button12);
        STOP=findViewById(R.id.button10);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation;
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                Name.startAnimation(animation);
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation;
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                Name.startAnimation(animation);
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation;
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);
                Name.startAnimation(animation);
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation;
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                Name.startAnimation(animation);
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation;
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slideup);
                Name.startAnimation(animation);
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation;
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomin);
                Name.startAnimation(animation);
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation;
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
                Name.startAnimation(animation);
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation;
                animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.together);
                Name.startAnimation(animation);
            }
        });

        STOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Name.clearAnimation();
            }
        });
    }


}