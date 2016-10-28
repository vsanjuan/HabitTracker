package com.example.android.habittracker;

import android.content.ContentValues;
import android.database.Cursor;
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

    public long Insert() {

        // Gets the database in write mode
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        // Create a ContentValues object where column names are the keys,
        // and a habit activity register attributes are the values.

        ContentValues values = new ContentValues();

        values.put(HabitTracker.COLUMN_HABIT, HabitTracker.RUNNING);
        values.put(HabitTracker.COLUMN_DATE, "29-10-2016");
        values.put(HabitTracker.COLUMN_DURATION, "03:30" );
        values.put(HabitTracker.COLUMN_COMMENTS, "5 kilometers");

        // Insert the new row, returning the primary key value of the new row
        long new_row_id = db.insert(HabitTracker.TABLE_NAME,null,values);


        return new_row_id;

    }

    public Cursor Read() {

        // Create and/or open a database to read from it
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        // Make a Query using the query method from the SQLiteDatabase Class

        Cursor cursor = db.query(HabitTracker.TABLE_NAME,
                null,       // The table to query
                null,       // The columns to return
                null,       // The columns for the WHERE clause
                null,       // The values for the WHERE clause
                null,       // don't group the rows
                null        // don't filter by row groups
        );

        return cursor;
    }

}
