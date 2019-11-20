package com.example.java_workplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;

import java.util.Calendar;
import java.util.Date;

public class AddActivity extends AppCompatActivity {

    private Calendar calendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_activity);
    }

    private void dateEditor (Date curDate, DatePickerDialog.OnDateSetListener listener) {
        calendar.setTime( curDate );

        DatePickerDialog datePicker = new DatePickerDialog(this,
                listener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH));
        datePicker.show();
    }

    public void datePickerClicked (View v){
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(),"Date Picker");
    }
}

