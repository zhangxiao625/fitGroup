package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.content.Context;

import androidx.appcompat.app.AppCompatDialogFragment;
//https://www.geeksforgeeks.org/shared-preferences-in-android-with-examples/ -> for sending data entered in popup to
public class ExercisePopUp extends AppCompatDialogFragment {

    private EditText editTextSets;
    private EditText editTextReps;
    private EditText editTextWeight;
    private ExampleDialogListener listener;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_exercise_popup, null);

        editTextSets = view.findViewById(R.id.edit_set);
        editTextReps = view.findViewById(R.id.edit_reps);
        editTextWeight = view.findViewById(R.id.edit_weight);


        builder.setView(view);
                /*.setTitle("Login")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String sets = editTextSets.getText().toString();
                        String reps = editTextReps.getText().toString();
                        String weight = editTextWeight.getText().toString();
                        listener.applyTexts(sets, reps,weight);
                    }
                });*/

        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            listener = (ExampleDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() +
                    "must implement ExampleDialogListener");
        }
    }

    public interface ExampleDialogListener {
        void applyTexts(String sets, String reps, String weight);
    }

}
