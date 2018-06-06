package com.aleksandr.newprogramm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Aleksandr on 11.09.17.
 */

public class FriendActivity extends AppCompatActivity{
    public static final String EXTRA_FRIEND = "EXTRA_FRIEND";

//    private FrameLayout fragmentContainer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);
//        fragmentContainer = (FrameLayout) findViewById(R.id.fragment_container); Якого дідька лисого ми це робили???

        int friendPosition = getIntent().getIntExtra(EXTRA_FRIEND, -1);

        Fragment fragment = FriendFragment.getInstance(friendPosition);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}
