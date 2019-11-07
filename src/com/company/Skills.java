package com.company;

public class Skills {
    private String skillName;
    private String proficiency;

    public Skills() {
    }

    public String displaySkills() {
        String str = "";
        str += skillName + ", " + proficiency;
        return str;
    }

    public Skills(String skillName, String proficiency) {
        this.skillName = skillName;
        this.proficiency = proficiency;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }
}
