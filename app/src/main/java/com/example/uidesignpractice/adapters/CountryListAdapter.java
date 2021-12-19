package com.example.uidesignpractice.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.uidesignpractice.R;
import com.example.uidesignpractice.models.Country;

import org.w3c.dom.Text;

import java.util.List;

public class CountryListAdapter extends BaseAdapter {
    Activity activity;
    private List<Country> countryList;

    public CountryListAdapter(Activity activity, List<Country> countryList) {
        this.activity = activity;
        this.countryList = countryList;
    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public Country getItem(int i) {
        return countryList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();

        view = layoutInflater.inflate(R.layout.item_country,null);
        ImageView   flagIcon = (ImageView) view.findViewById(R.id.item_country_iv_icon);
        TextView    countryName = (TextView) view.findViewById(R.id.item_country_tv_name);
        ImageButton sendMessageButton = (ImageButton) view.findViewById(R.id.item_country_bt_send_message);

        if (countryList.get(i).getCountryName().equalsIgnoreCase("china")) {
            sendMessageButton.setEnabled(false);
        }

        flagIcon.setImageResource(countryList.get(i).getCountryFlagIcon());
        countryName.setText(countryList.get(i).getCountryName());
        sendMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "Send a message to " + countryList.get(i).getCountryName() + " successfully!", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
