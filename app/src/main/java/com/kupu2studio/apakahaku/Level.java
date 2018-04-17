package com.kupu2studio.apakahaku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
    }

    public void a(View view) {
        String a = view.getTag().toString();
        Intent intent = new Intent(Level.this, subLevel.class);

        startActivity(intent);
        System.out.println(a);
        finish();
    }
    @Override
    public  void onBackPressed(){
        Intent i=new Intent(Level.this,home.class);
        startActivity(i);
        finish();
    }
}
