package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Resume> list = new ArrayList<>();
        ArrayList<Education> educationList = new ArrayList<>();
        ArrayList<Work> workList = new ArrayList<>();
        ArrayList<Skills> skillsList = new ArrayList<>();
        ArrayList<String> descriptionsList = new ArrayList<>();

        Scanner key = new Scanner(System.in);

        Boolean repeat = true;
        Boolean educationLoop = true;
        Boolean workLoop = true;
        Boolean skillsLoop = true;
        Boolean describeLoop = true;

        Resume resume = new Resume();

        int skillsCounter = 0;
        int describeCounter = 1;


        System.out.println("|▓▓▓【☆】▓▓▓| Resume Builder |▓▓▓【☆】▓▓▓|");
        do {
            System.out.println("You want my help building a resume? ...mkay lazy");
            System.out.println("I can tell by looking...you're gonna need a lot of help.\n");
            System.out.print("ミ★ Please enter your full name: ");
            resume.setName(key.nextLine());

            System.out.print("ミ☆ Please enter a valid email address: ");
            resume.setEmail(key.nextLine());
            System.out.println();

            System.out.println(resume.getEmail() + " ? ... really? okay lol\n");

            do {
                Education edu = new Education();
                System.out.println("ミ★ Please fill in required fields for at least (1) educational achievement: ");
                System.out.print("Degree type (Associate's, Bachelor's, Master's, PhD, etc): ");
                edu.setDegreeType(key.nextLine());
                System.out.print("The title of your major: ");
                edu.setMajor(key.nextLine());
                System.out.print("Name of the University you Attended: ");
                edu.setUniversity(key.nextLine());
                System.out.print("Finally the year you graduated: ");
                edu.setYear(key.nextLine());

                educationList.add(edu);
                System.out.println("\nミ☆ Would you like to add another educational achievement to your resume? (Yes/No)");

                String userKey = key.nextLine();
                System.out.println();
                if (userKey.equalsIgnoreCase("n") || userKey.equalsIgnoreCase("no")) {
                    educationLoop = false;
                }

            } while (educationLoop);

            System.out.println("Alrighty next we need to show future employers just how much experience you have in the field!");
            System.out.println("Even though you're probably fresh out of college and can't possibly have enough :D\n");

            System.out.println("ミ★  Please fill in required fields for at least (1) work experience: ");

            do {
                Work jobs = new Work();

                System.out.print("Name of company: ");
                jobs.setCompany(key.nextLine());
                System.out.print("Job title: ");
                jobs.setTitle(key.nextLine());
                System.out.print("Start date: ");
                jobs.setStartDate(key.nextLine());
                System.out.print("End date: ");
                jobs.setEndDate(key.nextLine());

                do {


                    System.out.println("Please add at least one description of your job responsibilities.");
                    System.out.print("Job description (" + describeCounter + "): ");
                    String d = key.nextLine();

                    descriptionsList.add(d);
                    describeCounter++;

                    System.out.println("\nミ☆ Would you like to add more work descriptions of your job? (Yes/No)");

                    String userKey = key.nextLine();
                    System.out.println();
                    if (userKey.equalsIgnoreCase("n") || userKey.equalsIgnoreCase("no")) {
                        describeLoop = false;
                    }

                } while (describeLoop);

                jobs.setDescription(descriptionsList);
                workList.add(jobs);

                System.out.println("\nミ☆ Would you like to add more work experience to your resume? (Yes/No)");

                String userKey = key.nextLine();
                System.out.println();
                if (userKey.equalsIgnoreCase("n") || userKey.equalsIgnoreCase("no")) {
                    workLoop = false;
                }

            } while (workLoop);

            System.out.println("Beautiful! Looks like you have barely any experience in the field as I thought.");
            System.out.println("Don't fret! The next part is where we add a bit of 'fluff' to your resume ;) \n");

            System.out.println("ミ★ Please fill in the required fields for at least (3) skills.");

            do {
                Skills exp = new Skills();
                System.out.print("Name of skill you possess: ");
                exp.setSkillName(key.nextLine());
                System.out.print("Rate / Proficiency (Fundamental, Novice, Intermediate, Advanced, Expert): ");
                exp.setProficiency(key.nextLine());
                System.out.println();

                skillsList.add(exp);
                skillsCounter++;

                if(skillsCounter >= 3) {

                    System.out.println("ミ☆ You've input " + skillsCounter + " skills! Would you like to add more? (Yes/No)");
                    String userKey = key.nextLine();
                    System.out.println();
                    if (userKey.equalsIgnoreCase("n") || userKey.equalsIgnoreCase("no")) {
                        skillsLoop = false;
                    }
                }
            } while (skillsLoop);

            list.add(resume);

            for(Resume r : list) {
                r.displayNameAndEmail();
                System.out.println("Education:");
                for (Education education1 : educationList) {
                    System.out.println(education1.displayEducation());
                }
                System.out.println("Experience:");
                for (Work work1 : workList) {
                    System.out.println(work1.displayWork());
                }
                System.out.println("Skillset:");
                for (Skills skills1 : skillsList) {
                    System.out.println(skills1.displaySkills());
                }
            }

            System.out.println("\nミ★ Wow I mean look at that resume! Absolutely gorgeous.");
            System.out.println("ミ☆ That took a lot of skill on my part to make you look good ya know.");
            System.out.println("ミ★ Do you want to build another resume? (Yes/No)");

            String userKey = key.nextLine();
            System.out.println();
            if (userKey.equalsIgnoreCase("n") || userKey.equalsIgnoreCase("no")) {
                repeat = false;
            } // closing if

        } while (repeat);
    } // closing main method
} // closing


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