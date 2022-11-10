package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DateOfBirthActivity extends AppCompatActivity {
    public Integer[] dates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
    public String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public Integer[] years = {1970, 1971, 1972, 1973, 1974, 1975, 1976, 1977, 1978, 1979, 1980,
            1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991,
            1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002,
            2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013,
            2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_of_birth);
        getSupportActionBar().setTitle("DateOfBirth");
        setupSpinnerDateOfBirth();
        setUpSpinnerMonths();
        setUpSpinnerYears();

    }

    public void setupSpinnerDateOfBirth() {
        Spinner dateOfBirthSp = findViewById(R.id.select_Date_sp);
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dates);
        dateOfBirthSp.setAdapter(arrayAdapter);
        dateOfBirthSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this, "Lucky Number : " + dates[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void setUpSpinnerMonths() {
        Spinner selectMonthSp = findViewById(R.id.select_month_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.dateofbirth_dropdown_item,months);
        selectMonthSp.setAdapter(arrayAdapter);
        selectMonthSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this, "Months : " + months[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void setUpSpinnerYears() {
        Spinner selectYearSp = findViewById(R.id.select_year_sp);
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1,years);
        selectYearSp.setAdapter(arrayAdapter);
        selectYearSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this, "year : " + years[position] ,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}

