package com.aleksandr.newprogramm;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Aleksandr on 06.09.17.
 */

public class MainActivity extends AppCompatActivity {
    TextView tvNumber;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    ImageView ivArrow;
    Button btnFriends;
    TextView tvScroll;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNumber = (TextView) findViewById(R.id.tv_number);
        btnOne = (Button) findViewById(R.id.btn_one);
        btnTwo = (Button) findViewById(R.id.btn_two);
        btnThree = (Button) findViewById(R.id.btn_three);
        ivArrow = (ImageView) findViewById(R.id.iv_arrow);
        btnFriends = (Button) findViewById(R.id.btn_friends);
        tvScroll = (TextView) findViewById(R.id.tv_scroll);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumber.setText("Ктоооооооо.....");
                tvScroll.setText("Ктоооооооо.....");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumber.setText("Живет на дне ОКЕАНА?????");
                tvScroll.setText("Живет на дне ОКЕАНА?????");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumber.setText("СПАНЧ БОБ квадратные штаны!!!! Труляляяяяяяяяяяяяяяяяяяяяяяяяяя");
                tvScroll.setText("СПАНЧ БОБ квадратные штаны!!!! Труляляяяяяяяяяяяяяяяяяяяяяяяяяя");
            }
        });

        ivArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BobHomeActivity.class);
                startActivity(intent);
            }
        });

        btnFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListFriendsActivity.class);
                startActivity(intent);
            }
        });

    }
}
