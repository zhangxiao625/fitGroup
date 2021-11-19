package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class FeedMessage {
    public String name;

    public String exerciseName;

    // contains name + exerciseName
    public String message;

    public List<String> exerciseDetailsList;

    public FeedMessage(String name, String exerciseName, List<String> exerciseDetailsList) {
        this.name = name;
        this.exerciseName = exerciseName;
        this.exerciseDetailsList = exerciseDetailsList;
        this.message = String.format("%s has completed %s!", name, exerciseName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public List<String> getExerciseDetailsList() {
        return exerciseDetailsList;
    }

    public void setExerciseDetailsList(List<String> exerciseDetailsList) {
        this.exerciseDetailsList = exerciseDetailsList;
    }
}