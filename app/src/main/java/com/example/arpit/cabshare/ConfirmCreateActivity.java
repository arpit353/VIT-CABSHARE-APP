package com.example.arpit.cabshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmCreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_create);

        Intent intent = getIntent();

        String toLocation = intent.getStringExtra("toLocation");
        String fromLocation = intent.getStringExtra("fromLocation");
        String date = intent.getStringExtra("date");
        String time = intent.getStringExtra("time");
        String noOfSeats = intent.getStringExtra("noOfSeats");

        TextView to = (TextView) findViewById(R.id.to);
        TextView from = (TextView) findViewById(R.id.from);
        TextView travelDate = (TextView) findViewById(R.id.date);
        TextView travelTime = (TextView) findViewById(R.id.timeValue);
        TextView seats = (TextView) findViewById(R.id.seats);

        to.setText(toLocation);
        from.setText(fromLocation);
        travelDate.setText(date);
        travelTime.setText(time);
        seats.setText(noOfSeats);


    }
}
