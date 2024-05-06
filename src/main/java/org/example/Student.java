package org.example;

public class Student {
    private String nameStudent;


    public Student() {

    }


    public void introduceYourself(String name) {
        System.out.println("Imię to " + name);
    }

    public void showMeName(String nameStudent) {
        System.out.println("Twoje imie to " + nameStudent);
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setStudentName (String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void printName() {
        System.out.println("My name is " + nameStudent);
    }
}



