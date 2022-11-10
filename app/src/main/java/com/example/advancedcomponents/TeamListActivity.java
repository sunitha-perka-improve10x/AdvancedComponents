package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TeamListActivity extends AppCompatActivity {
    public ArrayList<String> teamList;
    public ListView teamListLv;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);
        getSupportActionBar().setTitle("Team List");
        setupTeamListAddBtn();
        deleteBtn();
        setUpTeamListData();
        setupTeamList();
    }

    private void deleteBtn() {
        Button deleteBtn = findViewById(R.id.delete_btn);
        deleteBtn.setOnClickListener(view -> {
            EditText memberNameTxt = findViewById(R.id.member_neme_txt);
            String memberName = memberNameTxt.getText().toString();
            arrayAdapter.remove(memberName);
            arrayAdapter.notifyDataSetChanged();
            memberNameTxt.setText("");
        });
    }

    public void setupTeamListAddBtn() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText memberNameTxt = findViewById(R.id.member_neme_txt);
            String memberName = memberNameTxt.getText().toString();
            if (memberName.equals("")==false) {
                arrayAdapter.add(memberName);
                arrayAdapter.notifyDataSetChanged();
            }
            memberNameTxt.setText("");
        });
    }

    public void setUpTeamListData() {
        teamList = new ArrayList<>();
        teamList.add("Vishwanath");
        teamList.add("Renuka");
    }

    public void setupTeamList() {
        teamListLv = findViewById(R.id.teamlist_lv);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teamList);
        teamListLv.setAdapter(arrayAdapter);
        teamListLv.setOnItemClickListener((adapterView, view, position, l) -> {
            String memberName = teamList.get(position);
            EditText memberNameTxt = findViewById(R.id.member_neme_txt);
            memberNameTxt.setText(memberName);
            Toast.makeText(this, "Click : " + teamList.get(position), Toast.LENGTH_SHORT).show();
        });
    }
}