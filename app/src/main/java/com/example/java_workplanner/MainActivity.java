package com.example.java_workplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.text.DateFormat;



public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());

        TextView textViewDate = findViewById(R.id.text_view_date);
        textViewDate.setText(currentDate);
    }

    public void launchAddActivity(View view) {
        Intent intent = new Intent (this, AddActivity.class);
        startActivity(intent);
    }

    public void launchSettingsActivity(View view) {
        Intent intent = new Intent (this, SettingsActivity.class);
        startActivity(intent);
    }

    public void upcomingDays(View view) {


    }

    public void pastDays(View view) {

    }



}

