package com.example.gauravpc.tabview;

/**
 * Created by gaurav pc on 25-Apr-16.
 */
public class ListProvider {

    private String week_name,option_name,cost;

    public ListProvider(String option_name, String cost, String week_name) {
        this.week_name = week_name;
        this.option_name=option_name;
        this.cost=cost;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getOption_name() {
        return option_name;
    }

    public void setOption_name(String option_name) {
        this.option_name = option_name;
    }

    public String getWeek_name() {
        return week_name;
    }

    public void setWeek_name(String week_name) {
        this.week_name = week_name;
    }
}

