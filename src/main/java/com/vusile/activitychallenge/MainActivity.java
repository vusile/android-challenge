package com.vusile.activitychallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButtonAboutAlc;
    private Button mButtonMyProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonAboutAlc = findViewById(R.id.button_about_alc);
        mButtonMyProfile = findViewById(R.id.button_my_profile);

        setAboutAlcOnClickListener();
        setMyProfileOnClickListener();
    }

    private void setAboutAlcOnClickListener()
    {
        mButtonAboutAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutAlc.class);
                startActivity(intent);
            }
        });
    }

    private void setMyProfileOnClickListener()
    {
        mButtonMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyProfile.class);
                startActivity(intent);
            }
        });
    }
}
