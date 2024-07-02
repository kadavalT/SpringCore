package org.spring.examples;

public class Student {

    private String name;
    private int rollno;
    private String email;


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

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Email: " + email);
        }


}
