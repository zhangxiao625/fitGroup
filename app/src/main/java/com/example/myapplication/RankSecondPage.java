package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.widget.TextView;
import android.widget.CalendarView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;


public class RankSecondPage extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    Button thirdPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank_second_page);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.rank);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.feed:
                        startActivity(new Intent(getApplicationContext(), FeedActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.rank:
                        return true;
                    case R.id.setting:
                        startActivity(new Intent(getApplicationContext(), SettingActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });
        CalendarView calendarView=(CalendarView) findViewById(R.id.calendarView1);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(getApplicationContext(), "" + dayOfMonth, Toast.LENGTH_SHORT).show();// TODO Auto-generated method stub
            }
        });

        Intent intent = getIntent();
        String name = intent.getStringExtra("EXTRA_name");
        int streakPoints = intent.getIntExtra("EXTRA_streakPoints", 0);
        int workoutPoints = intent.getIntExtra("EXTRA_workoutPoints", 0);


        //pie chart
        PieChart pieChart;
        pieChart = findViewById(R.id.piechart);

        pieChart.addPieSlice(
                new PieModel(
                        "Streak",
                        streakPoints,
                        Color.parseColor("#FFEB3B")));
        pieChart.addPieSlice(
                new PieModel(
                        "Workout",
                        workoutPoints,
                        Color.parseColor("#6200EE")));
    };
}