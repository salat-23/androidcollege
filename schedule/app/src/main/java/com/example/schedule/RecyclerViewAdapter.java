package com.example.schedule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Model> movies;

    public RecyclerViewAdapter (Context context, List<Model> movies){
        this.movies = movies;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        Model model = movies.get(position);
        holder.DayOfWeek.setText(model.getDayOfWeek());
        holder.Para1.setText(model.getPara1());
        holder.Para2.setText(model.getPara2());
        holder.Para3.setText(model.getPara3());
        holder.Para4.setText(model.getPara4());
        holder.Para5.setText(model.getPara5());
        holder.Para6.setText(model.getPara6());
        holder.Para7.setText(model.getPara7());
        holder.Para8.setText(model.getPara8());
        holder.Para9.setText(model.getPara9());
        holder.Para10.setText(model.getPara10());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView DayOfWeek;
        final TextView Para1;
        final TextView Para2;
        final TextView Para3;
        final TextView Para4;
        final TextView Para5;
        final TextView Para6;
        final TextView Para7;
        final TextView Para8;
        final TextView Para9;
        final TextView Para10;

        public ViewHolder(View view) {
            super(view);
            DayOfWeek=view.findViewById(R.id.DayOfWeek);
            Para1=view.findViewById(R.id.Par1);
            Para2=view.findViewById(R.id.Par2);
            Para3=view.findViewById(R.id.Par3);
            Para4=view.findViewById(R.id.Par4);
            Para5=view.findViewById(R.id.Par5);
            Para6=view.findViewById(R.id.Par6);
            Para7=view.findViewById(R.id.Par7);
            Para8=view.findViewById(R.id.Par8);
            Para9=view.findViewById(R.id.Par9);
            Para10=view.findViewById(R.id.Par10);
        }
    }
}


