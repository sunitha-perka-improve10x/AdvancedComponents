package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class TeamActivity extends AppCompatActivity {
    public String[] selectNames = {"Vishwanath" ,"Renuka"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        getSupportActionBar().setTitle("Names");
        setupSpinnerSelectNames();
    }

    public void setupSpinnerSelectNames(){
        Spinner selectNameSp = findViewById(R.id.select_names_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, selectNames);
        selectNameSp.setAdapter(arrayAdapter);
        selectNameSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(TeamActivity.this, "selectName " + selectNames[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}