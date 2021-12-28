package com.gmail.chemko.nast;

public class Student {

    String firstName;
    String lastName;
    int group;
    boolean isReceivesScholarship;

    public void sayFirstName() {
        System.out.println("First name: " + firstName);
    }

    public void sayLastName() {
        System.out.println("Last Name: " + lastName);
    }

    public void sayGroup() {
        System.out.println("Group: " + group);
    }

    public void printReceivesScholarship() {
        if (isReceivesScholarship) {
            System.out.println("The student receives a scholarship");
        } else {
            System.out.println("The student does not receive a scholarship");
        }
    }

}

