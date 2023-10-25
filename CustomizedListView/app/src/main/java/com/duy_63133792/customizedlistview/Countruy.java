package com.duy_63133792.customizedlistview;

public class Countruy {
    private String countryName;
    private String countryFlag;
    private int population;

    public Countruy(String countryName, String countryFlag, int population) {
        this.countryName = countryName;
        this.countryFlag = countryFlag;
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
