package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");
        luckyNumberBtn();
        locationBtn();
        dateOfBirthBtn();
        teamBtn();
        addMembersBtn();
        teamListBtn();
    }
    public void luckyNumberBtn() {
        Button luckyNumberBtn = findViewById(R.id.luckynumber_btn);
        luckyNumberBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,LuckyNumberActivity.class);
            startActivity(intent);
        });
    }
    public void locationBtn() {
        Button locationBtn = findViewById(R.id.location_btn);
        locationBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LocationActivity.class);
            startActivity(intent);
        });
    }
    public void dateOfBirthBtn() {
        Button dateOfBirthBtn = findViewById(R.id.date_of_birth_btn);
        dateOfBirthBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, DateOfBirthActivity.class);
            startActivity(intent);
        });
    }
    public  void teamBtn() {
        Button teamBtn = findViewById(R.id.team_btn);
        teamBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,TeamActivity.class);
            startActivity(intent);
        });
    }
    public void addMembersBtn() {
        Button addMembersBtn = findViewById(R.id.addmembers_btn);
        addMembersBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AddMembersActivity.class);
            startActivity(intent);
        });
    }
    public void teamListBtn() {
       Button teamListBtn = findViewById(R.id.teamlist_btn);
        teamListBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,TeamListActivity.class);
            startActivity(intent);
        });
    }
}
