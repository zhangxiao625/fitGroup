package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ImageButton btn_play;
    Button btn_calendar, btn_choose_exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);

        btn_play = findViewById(R.id.btn_play);
        btn_calendar = findViewById(R.id.btn_calendar);
        btn_choose_exercise = findViewById(R.id.btn_choose_exercise);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home:
                        return true;
                    case R.id.feed:
                        startActivity(new Intent(getApplicationContext(), FeedActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.rank:
                        startActivity(new Intent(getApplicationContext(), RankActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.setting:
                        startActivity(new Intent(getApplicationContext(), SettingActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Check in! +5 points", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), ListExerciseActivity.class);
                startActivity(intent);
            }
        });

        btn_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CalendarActivity.class);
                startActivity(intent);
            }
        });

        btn_choose_exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListExerciseActivity.class);
                startActivity(intent);
            }
        });
    }
}