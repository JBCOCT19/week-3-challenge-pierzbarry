package com.company;

import java.util.ArrayList;

public class Work {
    private String company;
    private String title;
    private String startDate;
    private String endDate;
    private ArrayList<String> descriptions;

    public Work() {
    }

    public String displayWork(){
        String str = "";
        str += title + "\n" + company + ", " + startDate + " - " + endDate + "\n";
        for (String d : descriptions) {
            str += "- " + d + "\n";
        }
        return str;
    }

    public Work(String company, String title, String startDate, String endDate, ArrayList<String> descriptions) {
        this.company = company;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.descriptions = descriptions;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String> getDescriptions() {
        return descriptions;
    }

    public void setDescription(ArrayList<String> descriptions) {
        this.descriptions = descriptions;
    }
}
