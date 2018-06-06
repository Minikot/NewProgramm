package com.aleksandr.newprogramm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Aleksandr on 08.09.17.
 */

public class ListFriendsActivity extends AppCompatActivity {
    RecyclerView rvFriends;
    ItemFriendAdapter adapterFriend;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_friends);

        rvFriends = (RecyclerView) findViewById(R.id.rv_friends);
        adapterFriend = new ItemFriendAdapter(Friends.getFriends());

        rvFriends.setLayoutManager(new LinearLayoutManager(this));
        rvFriends.setAdapter(adapterFriend);
    }
}
