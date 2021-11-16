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
import com.example.myapplication.User;

public class RankActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);

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

        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        UsersAdapter adapter = new UsersAdapter(this, arrayOfUsers);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);


        for(int i = 0; i < 10; i++){

            User testUser = new User("John",40,30);
            adapter.add(testUser);
        }

    }

    public class UsersAdapter extends ArrayAdapter<User> {

        public UsersAdapter(Context context, ArrayList<User> users) {

            super(context, 0, users);

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            // Get the data item for this position
            User user = getItem(position);

            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_rank_entry, parent, false);
            }

            // Lookup view for data population
            TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
            TextView tvStreak = (TextView) convertView.findViewById(R.id.tvStreakPoints);
            TextView tvWorkout = (TextView) convertView.findViewById(R.id.tvWorkoutPoints);
            Button tvViewUser = (Button) convertView.findViewById(R.id.tvViewUser);

            // Populate the data into the template view using the data object
            tvName.setText(user.name);
            tvStreak.setText(Integer.toString(user.streak_points));
            tvWorkout.setText(Integer.toString(user.workout_points));

            tvViewUser.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "Button was clicked for list item " + user.name, Toast.LENGTH_SHORT).show();
                    String name = user.name;
                    int streakPoints = user.streak_points;
                    int workoutPoints = user.workout_points;
                    openUserEntry(name, streakPoints, workoutPoints );
                }
            });

            // Return the completed view to render on screen
            return convertView;
        }

        public void openUserEntry(String name, int streakPoints, int workoutPoints){
            Intent intent = new Intent(getApplicationContext(), RankSecondPage.class);
            intent.putExtra("EXTRA_name", name);
            intent.putExtra("EXTRA_streakPoints", streakPoints);
            intent.putExtra("EXTRA_workoutPoints", workoutPoints);

            startActivity(intent);
        }
    }


}

