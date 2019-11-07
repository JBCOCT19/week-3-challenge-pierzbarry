package com.company;

import java.util.ArrayList;

public class Resume {
    private String name;
    private String email;
    private ArrayList<Education> education;
    private ArrayList<Work> work;
    private ArrayList<Skills> skills;

    public Resume() {
    }

    public Resume(String name, String email, ArrayList<Education> education, ArrayList<Work> work, ArrayList<Skills> skills) {
        this.name = name;
        this.email = email;
        this.education = education;
        this.work = work;
        this.skills = skills;
    }

    public void displayNameAndEmail() {
        System.out.println(name);
        System.out.println(email);
        System.out.println();
    }

    public String displayEducation(){
        String str = "";
        str += name + ":\n";
        for (Education e : education) {
            str += e.displayEducation();
        }
        return str;
    }

    public String displayWork(){
        String str = "";
        str += name + ":\n";
        for (Work w : work) {
            str += w.displayWork();
        }
        return str;
    }

    public String displaySkills(){
        String str = "";
        str += name + ":\n";
        for (Skills s : skills) {
            str += s.displaySkills() + "\n";
        }
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Education> getEducation() {
        return education;
    }

    public void setEducation(ArrayList<Education> education) {
        this.education = education;
    }

    public ArrayList<Work> getWork() {
        return work;
    }

    public void setWork(ArrayList<Work> work) {
        this.work = work;
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skills> skills) {
        this.skills = skills;
    }
}

// =============================================================
// John J Jingleheimer-Schmidt
// jjjschmidt@gmail.com
//
// Education
// BS in Psychology,
// University of Maryland, 2002
//
// Experience
// Business Analyst
// DCPS, August 2005 - May 2014
// - Duty 1, Lorem ipsum
//
// Skills
// Java, Advanced
// PHP, Intermediate
// Ruby on Rails, Novice
// Perl, Fundamental
