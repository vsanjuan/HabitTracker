package com.example.android.habittracker.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.habittracker.Data.HabitTrackerContract.HabitTracker;

/**
 * Created by salva on 28/10/2016.
 */

public class HabitDbHelper extends SQLiteOpenHelper {

    public final String LOG_TAG = HabitDbHelper.class.getSimpleName();

    private static final String DATABASE_NAME = "habit_tracker.db";
    private static final int DATABASE_VERSION = 1;

    public HabitDbHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // Database still at version 1.0 nothing to be done
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // Create a String that contains the SQL statement to create the HabitTracker table

        String COMMA = ", ";

        String SQL_CREATE_HABITS_TABLE = "CREATE TABLE " + HabitTracker.TABLE_NAME + "( " +
                HabitTracker._ID + "INTEGER PRIMARY KEY AUTOINCREMENT " + COMMA +
                HabitTracker.COLUMN_HABIT + "INTEGER NOT NULL DEFAULT " + HabitTracker.RUNNING + COMMA +
                HabitTracker.COLUMN_DATE + "TEXT NOT NULL" + COMMA +
                HabitTracker.COLUMN_DURATION + "TEXT NOT NULL " + COMMA +
                HabitTracker.COLUMN_COMMENTS + "TEXT " + ")";

        db.execSQL(SQL_CREATE_HABITS_TABLE);





    }
}
