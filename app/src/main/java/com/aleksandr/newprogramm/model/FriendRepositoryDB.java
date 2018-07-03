package com.aleksandr.newprogramm.model;

import android.content.ContentValues;
import android.content.Context;

import com.aleksandr.newprogramm.Friends;

public class FriendRepositoryDB {
    public static FriendRepositoryDB friendRepositoryDB;
    private Context context;
    private FriendsDbHelper dbHelper;

    public FriendRepositoryDB(Context context) {
        this.context = context;
        this.dbHelper = new FriendsDbHelper(context.getApplicationContext());
    }

    public static FriendRepositoryDB getInstanse(Context context) {
        if (friendRepositoryDB == null) {
            friendRepositoryDB = new FriendRepositoryDB(context);
        }
        return friendRepositoryDB;
    }

    private ContentValues getContentValues(Friends friends) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DbScheme.Cols.NAME, friends.getName());
        contentValues.put(DbScheme.Cols.SECNAME, friends.getSecName());
        contentValues.put(DbScheme.Cols.AGE, friends.getAge());
        contentValues.put(DbScheme.Cols.GENDER, friends.getGender());
        return contentValues;
    }
}
