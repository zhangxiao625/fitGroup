package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ViewExerciseActivity extends AppCompatActivity {

    int image_id;
    String name;

    TextView timer, title;
    ImageView detail_img;
    Button btn_start;

    boolean isRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_exercise);

        timer = findViewById(R.id.timer);
        title = findViewById(R.id.title);
        detail_img = findViewById(R.id.detail_img);
        btn_start = findViewById(R.id.btn_start);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isRunning) {
                    btn_start.setText("DONE");
                    new CountDownTimer(10000, 1000) {

                        @Override
                        public void onTick(long millisUntilFinished) {
                            timer.setText("" + millisUntilFinished/1000);
                        }

                        @Override
                        public void onFinish() {
                            if (isRunning) {
                                Toast.makeText(ViewExerciseActivity.this, "Finish!!! +5 points", Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        }
                    }.start();
                }
                else {
                    finish();
                }
                isRunning = !isRunning;
            }
        });

        timer.setText("");

        if(getIntent() != null) {
            image_id = getIntent().getIntExtra("image_id", -1);
            name = getIntent().getStringExtra("name");

            detail_img.setImageResource(image_id);
            title.setText(name);
        }
    }
}