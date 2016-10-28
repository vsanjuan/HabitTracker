package com.example.android.habittracker;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.habittracker.Data.HabitDbHelper;
import com.example.android.habittracker.Data.HabitTrackerContract.HabitTracker;

public class MainActivity extends AppCompatActivity {

    /** Database helper that will provide us access to the database */
    private HabitDbHelper mDbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // To access our database, we instantiate our subclass of SQLiteOpenHelper
        // and pass the context, which is the current activity.
        HabitDbHelper mDbHelper = new HabitDbHelper(this);

    }

    public boolean Insert() {

        // Gets the database in write mode
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        // Create a ContentValues object where column names are the keys,
        // and a habit activity register attributes are the values.

        ContentValues values = new ContentValues();

        values.put(HabitTracker.COLUMN_HABIT, HabitTracker.RUNNING);
        values.put(HabitTracker.COLUMN_DATE, "29-10-2016");
        values.put(HabitTracker.COLUMN_DURATION, "03:30" );
        values.put(HabitTracker.COLUMN_COMMENTS, "5 kilometers");

        






    }

}
