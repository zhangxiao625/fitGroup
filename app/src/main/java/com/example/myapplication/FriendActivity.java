package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FriendActivity extends AppCompatActivity{

    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    FriendAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);

        initData();

        mrecyclerView=findViewById(R.id.RecyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mrecyclerView.setLayoutManager(layoutManager);
        adapter=new FriendAdapter(userList);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.profile1,"Kine","From your contacts","11:55 am","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile2,"Adjk","From your contacts","12:05 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile3,"Ethen","From your contacts","12:38 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile4,"Zen","From your contacts","1:55 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile5,"Ketty","From your contacts","2:22 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile6,"Ike","From your contacts","2:46 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile7,"Elsa","From your contacts","2:55 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile8,"Zal","From your contacts","3:55 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile9,"Ekl","From your contacts","11:55 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile10,"Kine","From your contacts","11:55 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile1,"Kine","From your contacts","11:55 pm","_______________________________________"));
        userList.add(new ModelClass(R.drawable.profile2,"Kine","From your contacts","11:55 pm","_______________________________________"));
    }

}