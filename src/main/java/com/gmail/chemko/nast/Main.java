package com.gmail.chemko.nast;

public class Main {

    public static void main(String[] args) {
        University uni = new University();
        System.out.println(uni);

        uni.name = "Minsk State Linguistic University";
        uni.numberOfStudents = 7000;
        uni.mainSubjects = "Languages, Linguistics";

        uni.sayName();
        uni.sayNumberOfStudents();
        uni.sayMainSubjects();

        uni.getStudentsInfo();
        System.out.println();

        Student student = new Student();
        System.out.println(student);

        student.firstName = "Anastasia";
        student.lastName = "Chemko";
        student.group = 418;
        student.isReceivesScholarship = true;

        student.sayFirstName();
        student.sayLastName();
        student.sayGroup();
        student.printReceivesScholarship();
    }
}
