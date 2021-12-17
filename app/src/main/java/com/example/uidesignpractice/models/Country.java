package com.example.uidesignpractice.models;

public class Country {
    private String  countryName;
    private int     countryFlagIcon;

    public Country(int countryFlagIcon, String countryName) {
        this.countryName = countryName;
        this.countryFlagIcon = countryFlagIcon;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountryFlagIcon() {
        return countryFlagIcon;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryFlagIcon(int countryFlagIcon) {
        this.countryFlagIcon = countryFlagIcon;
    }
}
