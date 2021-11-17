package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class RankThirdPage extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank_third_page);

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

        ArrayList<RankExerciseEntry> arrayOfUsers = new ArrayList<RankExerciseEntry>();
        RankThirdPage.RankExerciseAdapter adapter = new RankThirdPage.RankExerciseAdapter(this, arrayOfUsers);
        ListView listView = (ListView) findViewById(R.id.rank_exercise_list);
        listView.setAdapter(adapter);

        RankExerciseEntry ex1 = new RankExerciseEntry("Back Extension",5,10,160);
        RankExerciseEntry ex2 = new RankExerciseEntry("Cable Pulldowns",3,8,100);
        RankExerciseEntry ex3 = new RankExerciseEntry("Bicep Curls",5,15,35);
        RankExerciseEntry ex4 = new RankExerciseEntry("Hammer Curls",5,15,20);

        adapter.add(ex1);
        adapter.add(ex2);
        adapter.add(ex3);
        adapter.add(ex4);
    }

    public class RankExerciseAdapter extends ArrayAdapter<RankExerciseEntry> {

        public RankExerciseAdapter(Context context, ArrayList<RankExerciseEntry> rankExerciseEntries) {

            super(context, 0, rankExerciseEntries);

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            // Get the data item for this position
            RankExerciseEntry rankExercise = getItem(position);

            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_rank_exercise_entry, parent, false);
            }

            // Lookup view for data population
            TextView exerciseName = (TextView) convertView.findViewById(R.id.exercise_name);
            TextView sets = (TextView) convertView.findViewById(R.id.sets);
            TextView reps = (TextView) convertView.findViewById(R.id.reps);
            TextView weight = (TextView) convertView.findViewById(R.id.weight);

            // Populate the data into the template view using the data object
            exerciseName.setText(rankExercise.exercise);
            sets.setText("Sets " + Integer.toString(rankExercise.sets));
            reps.setText("Reps " + Integer.toString(rankExercise.reps));
            weight.setText("Weight " + Integer.toString(rankExercise.weight));

            // Return the completed view to render on screen
            return convertView;
        }

    }


}