package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FeedDetailActivity extends AppCompatActivity {

    int image_id;
    String name;

    ImageView detail_img;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_detail);

        detail_img = findViewById(R.id.item_book_img);
        title = findViewById(R.id.item_book_title);

        if(getIntent() != null) {
            image_id = getIntent().getIntExtra("image", -1);
            name = getIntent().getStringExtra("name");

            detail_img.setImageResource(image_id);
            title.setText(name);
        }
    }
}