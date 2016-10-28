package com.example.android.habittracker.Data;

import android.provider.BaseColumns;

/**
 * Created by salva on 28/10/2016.
 */

public final class HabitTrackerContract {

    // To prevent anyone to instate this class
    private HabitTrackerContract() {}

    public static final class HabitTracker implements BaseColumns {

        public final static String TABLE_NAME = "habit_tracks";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_HABIT = "habit";
        public final static String COLUMN_DATE = "date";
        public final static String COLUMN_DURATION = "duration";
        public final static String COLUMN_COMMENTS = "comments";

        /*
            Possible values for habit
         */

        public final static int RUNNING = 0;
        public final static int VIOLIN = 1;
        public final static int CODING = 2;


    }



}
