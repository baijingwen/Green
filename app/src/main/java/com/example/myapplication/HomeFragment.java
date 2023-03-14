package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class HomeFragment extends AppCompatActivity {

    private ImageButton profileBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homefragment);

        //image button id: profile to activity_profile
        profileBtn = findViewById(R.id.profile);


        //cardview id: to activity_search_plant
        //cardview id: to activity_weather

    }

}