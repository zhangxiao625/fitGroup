package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CalendarSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_second);




        ArrayList<RankExerciseEntry> arrayOfUsers = new ArrayList<RankExerciseEntry>();
        CalendarSecondAdapter adapter = new CalendarSecondAdapter(this, arrayOfUsers);
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


        // get calendar
        Intent intent = getIntent();
        int year = intent.getIntExtra("EXTRA_year",0);
        int month = intent.getIntExtra("EXTRA_month", 0);
        int day = intent.getIntExtra("EXTRA_day", 0);

        TextView tvDate = (TextView)findViewById(R.id.date_value);
        tvDate.setText(Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year));
    }

    public class CalendarSecondAdapter extends ArrayAdapter<RankExerciseEntry> {

        public CalendarSecondAdapter(Context context, ArrayList<RankExerciseEntry> rankExerciseEntries) {

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