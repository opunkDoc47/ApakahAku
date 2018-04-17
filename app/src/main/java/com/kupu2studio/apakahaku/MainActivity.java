package com.kupu2studio.apakahaku;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1,l2;
    Animation animation,animation2;

private static int waktusplas=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=findViewById(R.id.l1);
        l2=findViewById(R.id.l2);
        animation= AnimationUtils.loadAnimation(this,R.anim.up);
        animation2= AnimationUtils.loadAnimation(this,R.anim.right);
        l1.setAnimation(animation);
        l2.setAnimation(animation2);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent= new Intent(MainActivity.this,home.class);
                startActivity(homeIntent);
                finish();
            }
        },waktusplas);


    }
    public void coba(View view){

    }
}
