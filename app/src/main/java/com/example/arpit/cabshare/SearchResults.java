package com.example.arpit.cabshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class SearchResults extends AppCompatActivity {

    private List<searchResults> searchList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        Toolbar t1 = (Toolbar) findViewById(R.id.toolbar4);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);


        searchResults result = new searchResults("Shobhan Awasthi","shobhan.awasthi2015@gmail.com","20-05-2017","12:30 AM");
        searchList.add(result);
        searchList.add(result);
        searchList.add(result);
        searchList.add(result);
        searchList.add(result);
        searchList.add(result);
        searchList.add(result);
        searchList.add(result);
        searchList.add(result);

        searchAdopter mAdapter = new searchAdopter(searchList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


    }
}
