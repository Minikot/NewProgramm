package com.aleksandr.newprogramm;

import android.support.annotation.DrawableRes;

import java.util.ArrayList;

/**
 * Created by Aleksandr on 08.09.17.
 */

public class Friends {
    private String name;
    private String secName;
    private int age;
    private String gender;
    private String address;
    private
    @DrawableRes
    int image;

    public Friends(String name, String secName, int age, String gender, String address, int image) {
        this.name = name;
        this.secName = secName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getSecName() {
        return secName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public int getImage() {
        return image;
    }

    private ArrayList<FriendActivity> friendActivities = new ArrayList<>();

    public Friends(ArrayList<FriendActivity> friendActivities) {
        this.friendActivities = friendActivities;
    }

    public static ArrayList<Friends> getFriends() {

        ArrayList<Friends> friends = new ArrayList<>();

        friends.add(new Friends("Патрик", "Стар", 20, "Male", "Ocean", R.drawable.star));
        friends.add(new Friends("Сквидвард", "Квентин Тентаклс", 25, "Male", "Ocean", R.drawable.skvidvard));
        friends.add(new Friends("Гэри", "Уилсон-младший", 3, "Male", "BobHome", R.drawable.gery));
        return friends;
    }
}

