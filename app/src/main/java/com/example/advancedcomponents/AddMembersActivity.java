package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class AddMembersActivity extends AppCompatActivity {
    public String[] selectTeam = {"Team A" , "Team B"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmembers);
        getSupportActionBar().setTitle("Add Members");
        setupSpinnerSelectTeam();
    }
    public void setupSpinnerSelectTeam() {
        Spinner selectTeamSp = findViewById(R.id.select_team_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, selectTeam);
        selectTeamSp.setAdapter(arrayAdapter);
        selectTeamSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AddMembersActivity.this, "Select Team : " + selectTeam[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}