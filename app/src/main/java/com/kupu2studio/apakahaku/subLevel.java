package com.kupu2studio.apakahaku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class subLevel extends AppCompatActivity {
    LinearLayout linearLayout,main;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_level);
        Display display=getWindowManager().getDefaultDisplay();
        int widht=display.getWidth();
        main=findViewById(R.id.ly);
        for (int i=0;i<10;i++){
            linearLayout=new LinearLayout(subLevel.this);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            main.addView(linearLayout);
            for (int j=0;j<=3;j++){
                button=new Button(subLevel.this);
                button.setText(String.valueOf(i));
                button.setTag(i);
                linearLayout.addView(button);
            }
        }
    }
    @Override
    public  void onBackPressed(){
        Intent i=new Intent(subLevel.this,Level.class);
        startActivity(i);
        finish();
    }
}
