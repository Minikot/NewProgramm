package com.aleksandr.newprogramm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aleksandr on 11.09.17.
 */

public class FriendFragment extends Fragment {
    ArrayList<Friends> friends = new ArrayList<>();

    private ImageView ivPhoto;
    private TextView tvFirstName;
    private TextView tvSecondName;
    private TextView tvAge;
    private TextView tvGender;
    private TextView tvAddress;

    public static FriendFragment getInstance(int position){
        Bundle bundle = new Bundle();
        bundle.putInt(FriendActivity.EXTRA_FRIEND, position);
        FriendFragment personFragment = new FriendFragment();
        personFragment.setArguments(bundle);
        return personFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_friend, container, false);

        ivPhoto = (ImageView) view.findViewById(R.id.iv_photo);
        tvFirstName = (TextView) view.findViewById(R.id.tv_firstName);
        tvSecondName = (TextView) view.findViewById(R.id.tv_secondName);
        tvAge = (TextView) view.findViewById(R.id.tv_age);
        tvGender = (TextView) view.findViewById(R.id.tv_gender);
        tvAddress = (TextView) view.findViewById(R.id.tv_address);

        int friendPosition = getArguments().getInt(FriendActivity.EXTRA_FRIEND);

        Friends friends = Friends.getFriends().get(friendPosition);

        ivPhoto.setImageResource(friends.getImage());
        tvFirstName.setText(friends.getName());
        tvSecondName.setText(friends.getSecName());
        tvAge.setText(String.valueOf(friends.getAge()));
        tvGender.setText(friends.getGender());
        tvAddress.setText(friends.getAddress());
        return view;
    }
}
