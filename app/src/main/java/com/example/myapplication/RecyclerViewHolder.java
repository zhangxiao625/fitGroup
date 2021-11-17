package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    ImageView image;
    TextView text;
    ItemClickListener itemClickListener;

    public RecyclerViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        image = itemView.findViewById(R.id.exercise_img);
        text = itemView.findViewById(R.id.exercise_name);
        this.itemClickListener = itemClickListener;

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(getAdapterPosition());
    }

    public interface ItemClickListener {
        void onClick(int position);
    }

}
