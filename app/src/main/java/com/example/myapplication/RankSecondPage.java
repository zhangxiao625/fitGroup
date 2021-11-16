package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RankSecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank_second_page);

        Intent intent = getIntent();
        String name = intent.getStringExtra("EXTRA_name");
        int streakPoints = intent.getIntExtra("EXTRA_streakPoints", 0);
        int workoutPoints = intent.getIntExtra("EXTRA_workoutPoints", 0);

        TextView textView1 = (TextView) findViewById(R.id.textview1);
        TextView textView2 = (TextView) findViewById(R.id.textview2);

        textView1.setText(name);
        textView2.setText("" + streakPoints);

    }
}