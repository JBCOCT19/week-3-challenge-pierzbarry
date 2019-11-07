package com.company;

public class Education {
    private String degreeType;
    private String major;
    private String university;
    private String year;

    public Education() {
    }

    public String displayEducation(){
        String str = "";
        str += degreeType + " in " + major + ",\n" + university + ", " + year + "\n";
        return str;
    }

    public Education(String degreeType, String major, String university, String year) {
        this.degreeType = degreeType;
        this.major = major;
        this.university = university;
        this.year = year;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
