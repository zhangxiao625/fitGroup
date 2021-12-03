package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;
    private OnNoteListener onNoteListener;

    public Adapter(List<ModelClass>userList, OnNoteListener onNoteListener) {
        this.userList=userList;
        this.onNoteListener = onNoteListener;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.feed_item,parent,false);
        return new ViewHolder(view, onNoteListener);


    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int resource = userList.get(position).getImageview();
        String name=userList.get(position).getTextview1();
        String msg=userList.get(position).getTextview2();
        String time=userList.get(position).getTextview3();
        String line=userList.get(position).getDivider();

        holder.setData(resource,name,msg,time,line);



    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    //view holder class



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView imageView;
        private TextView textView;
        private TextView textView2;
        private TextView textview3;
        private TextView divider;

        OnNoteListener onNoteListener;


        public ViewHolder(@NonNull View itemView, OnNoteListener onNoteListener) {
            super(itemView);
            //here use xml ids
            //give different name not like constructor
            imageView=itemView.findViewById(R.id.imageview);
            textView=itemView.findViewById(R.id.textview);
            textView2=itemView.findViewById(R.id.textview2);
            textview3=itemView.findViewById(R.id.textview3);
            divider=itemView.findViewById(R.id.Divider);
            this.onNoteListener = onNoteListener;

            itemView.setOnClickListener(this);

        }

        public void setData(int resource, String name, String msg, String time,String line) {

            imageView.setImageResource(resource);
            textView.setText(name);
            textView2.setText(msg);
            textview3.setText(time);
            divider.setText(line);



        }

        @Override
        public void onClick(View v) {
            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }

    public interface OnNoteListener{
        void onNoteClick(int position);
    }
}