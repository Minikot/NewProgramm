package com.aleksandr.newprogramm.model;

import android.content.Context;

public class FriendRepositoryDB {
    public static FriendRepositoryDB friendRepositoryDB;
    private Context context;

    public FriendRepositoryDB(Context context) {
        this.context = context;
    }

    public static FriendRepositoryDB getInstanse(Context context){
        if(friendRepositoryDB == null){
            friendRepositoryDB = new FriendRepositoryDB(context);
        }
        return friendRepositoryDB;
    }
}
