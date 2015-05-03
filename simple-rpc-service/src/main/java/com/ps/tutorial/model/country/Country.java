package com.ps.tutorial.model.country;

import com.ps.tutorial.model.currency.Currency;

public class Country {

    protected String name;
    protected int population;
    protected String capital;
    protected Currency currency;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int value) {
        this.population = value;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String value) {
        this.capital = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency value) {
        this.currency = value;
    }

}
