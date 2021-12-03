package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PopUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        Button pop = findViewById(R.id.popup);

        Dialog testDia = new Dialog(this);

        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //testDia.setContentView(R.layout.layout_exercise_popup);
                //testDia.show();
                ExercisePopUp exercisePopUp = new ExercisePopUp();
                exercisePopUp.show(getSupportFragmentManager(), "example dialog");
            }
        });


    }
}