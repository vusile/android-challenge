package com.vusile.activitychallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        setTitle(R.string.my_profile);

        CircleImageView profilePicture = findViewById(R.id.iv_profile_pic);

        Glide.with(this)
                .load(R.drawable.me)
                .into(profilePicture);
    }
}
