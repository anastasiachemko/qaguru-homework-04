package com.gmail.chemko.nast;

public class University {

        String name;
        int numberOfStudents;
        String mainSubjects;

        public void sayName() {
            System.out.println("University: " + name);
        }

        public void sayNumberOfStudents() {
            System.out.println("Number of students: " + numberOfStudents);
        }

        public void sayMainSubjects() {
            System.out.println("Main subjects: " + mainSubjects);
        }

        public void getStudentsInfo() {
            System.out.println("There are " + numberOfStudents + " students" + " at " + name);
        }
    }
