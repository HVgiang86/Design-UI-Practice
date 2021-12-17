package com.example.uidesignpractice.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.uidesignpractice.R;
import com.example.uidesignpractice.adapters.CountryListAdapter;
import com.example.uidesignpractice.models.Country;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        List<Country> countryList = new ArrayList<Country>();
        countryList.add(new Country(R.drawable.ic_flag_vietnam, "Vietnam"));
        countryList.add(new Country(R.drawable.ic_flag_france, "France"));
        countryList.add(new Country(R.drawable.ic_flag_china,"China"));
        countryList.add(new Country(R.drawable.ic_flag_germany, "Germany"));
        countryList.add(new Country(R.drawable.ic_flag_italy, "Italy"));
        countryList.add(new Country(R.drawable.ic_flag_japan, "Japan"));
        countryList.add(new Country(R.drawable.ic_flag_south_korea, "South Korea"));
        countryList.add(new Country(R.drawable.ic_flag_united_kingdom, "United Kingdom"));
        countryList.add(new Country(R.drawable.ic_flag_argentina, "Argentina"));
        countryList.add(new Country(R.drawable.ic_flag_australia, "Australia"));
        countryList.add(new Country(R.drawable.ic_flag_brazil, "Brazil"));
        countryList.add(new Country(R.drawable.ic_flag_canada, "Canada"));
        countryList.add(new Country(R.drawable.ic_flag_myanmar, "Myanmar"));
        countryList.add(new Country(R.drawable.ic_flag_taiwan, "Taiwan"));
        countryList.add(new Country(R.drawable.ic_flag_united_states, "United States"));

        CountryListAdapter countryListAdapter = new CountryListAdapter(this, countryList);
        ListView countryListView = (ListView) findViewById(R.id.second_activity_lv_country_list);
        TextView selectedTextView = (TextView) findViewById(R.id.second_activity_tv_selected);

        countryListView.setAdapter(countryListAdapter);
    }
}