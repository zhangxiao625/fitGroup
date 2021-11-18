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
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Button btn_play;
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

        ArrayList<FriendEntry> arrayOfFriends = new ArrayList<FriendEntry>();
        MainActivity.FriendListAdapter adapter = new MainActivity.FriendListAdapter(this, arrayOfFriends);
        ListView listView = (ListView) findViewById(R.id.friend_list);
        listView.setAdapter(adapter);

        FriendEntry friend1 = new FriendEntry(R.drawable.easy_pose, "Daddy", 50);
        FriendEntry friend2 = new FriendEntry(R.drawable.easy_pose, "Daddy", 50);
        FriendEntry friend3 = new FriendEntry(R.drawable.easy_pose, "Daddy", 50);
        FriendEntry friend4 = new FriendEntry(R.drawable.easy_pose, "Daddy", 50);
        FriendEntry friend5 = new FriendEntry(R.drawable.easy_pose, "Daddy", 50);
        FriendEntry friend6 = new FriendEntry(R.drawable.easy_pose, "Daddy", 50);
        FriendEntry friend7 = new FriendEntry(R.drawable.easy_pose, "Daddy", 50);


        adapter.add(friend1);
        adapter.add(friend2);
        adapter.add(friend3);
        adapter.add(friend4);
        adapter.add(friend5);
        adapter.add(friend6);
        adapter.add(friend7);


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

    public class FriendListAdapter extends ArrayAdapter<FriendEntry> {

        public FriendListAdapter(Context context, ArrayList<FriendEntry> FriendEntries) {

            super(context, 0, FriendEntries);

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            // Get the data item for this position
            FriendEntry friend = getItem(position);

            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_friend_entry, parent, false);
            }

            // Lookup view for data population
            CircleImageView profileImage = (CircleImageView) convertView.findViewById(R.id.prof);
            TextView friendName = (TextView) convertView.findViewById(R.id.tvFriendName);
            TextView streak = (TextView) convertView.findViewById(R.id.tvStreak);
            Button btn_remind = convertView.findViewById(R.id.btn_remind);

            // Populate the data into the template view using the data object
            profileImage.setImageResource(friend.image_id);
            friendName.setText(friend.name);
            streak.setText(Integer.toString(friend.streak) + " day streak");

            btn_remind.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Toast.makeText(getApplicationContext(), "You have reminded " + friend.name + " to workout"  , Toast.LENGTH_SHORT).show();
                }
            });

            // Return the completed view to render on screen
            return convertView;
        }

    }
}