package com.example.arpit.cabshare;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by arpit on 21/7/17.
 */

public class searchAdopter extends RecyclerView.Adapter<searchAdopter.MyViewHolder> {

    private List<searchResults> searchResult;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name,email,date,time;

        public MyViewHolder(View view) {
            super(view);
            date = (TextView) view.findViewById(R.id.row_date);
            time = (TextView) view.findViewById(R.id.row_time);
            name = (TextView) view.findViewById(R.id.row_name);
            email = (TextView) view.findViewById(R.id.row_email);
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.search_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        searchResults searchresult = searchResult.get(position);
        holder.name.setText(searchresult.getName());
        holder.email.setText(searchresult.getEmail());
        holder.date.setText(searchresult.getDate());
        holder.time.setText(searchresult.getTime());

    }

    public searchAdopter(List<searchResults> searchResult) {
        this.searchResult = searchResult;
    }

    public int getItemCount() {
        return searchResult.size();
    }

}
