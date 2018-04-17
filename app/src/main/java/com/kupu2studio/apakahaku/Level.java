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
        //intent.putExtra("id",a);
        startActivity(intent);
        finish();
    }
}
