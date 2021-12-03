package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends AppCompatActivity implements Adapter.OnNoteListener {

    BottomNavigationView bottomNavigationView;

    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.feed);

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
        
        initData();

        mrecyclerView=findViewById(R.id.RecyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mrecyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList, this);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.profile1,"Kine","Completed today's exercise","11:55 am","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile2,"Adjk","Completed today's exercise","12:05 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile3,"Ethen","Completed today's exercise","12:38 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile4,"Zen","Completed today's exercise","1:55 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile5,"Ketty","Completed today's exercise","2:22 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile6,"Ike","Completed today's exercise","2:46 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile7,"Elsa","Completed today's exercise","2:55 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile8,"Zal","Completed today's exercise","3:55 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile9,"Ekl","Completed today's exercise","11:55 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile10,"Kine","Completed today's exercise","11:55 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile1,"Kine","Completed today's exercise","11:55 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile2,"Kine","Completed today's exercise","11:55 pm","_______________________________________"));

    }

    @Override
    public void onNoteClick(int position) {
        Intent intent = new Intent(this, FeedDetailActivity.class);
        intent.putExtra("image", userList.get(position).getImageview());
        intent.putExtra("name", userList.get(position).getTextview1());
        startActivity(intent);
    }
}