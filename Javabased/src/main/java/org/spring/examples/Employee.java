package org.spring.examples;

public class Employee {

    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void employeeDetails(){

        System.out.println("THIS IS NORMAL JAVA IMP");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}
