package com.aleksandr.newprogramm.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FriendsDbHelper extends SQLiteOpenHelper {

    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "friend.sqlite";

    public FriendsDbHelper(Context context) {
        super(context, DB_NAME, null , DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + DbScheme.NAME
                + "( _id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE, "
                + DbScheme.Cols.NAME + " TEXT, "
                + DbScheme.Cols.SECNAME + " TEXT, "
                + DbScheme.Cols.AGE + " INTEGER NOT NULL, "
                + DbScheme.Cols.GENDER + " TEXT)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
