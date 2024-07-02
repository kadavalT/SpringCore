package org.spring.examples;

public class Employee {

    private int id;
    private String name;
    private int age;

    public Employee(int id, int age) {
        this.id = id;
        this.age = age;
        System.out.println(id);
        System.out.println(age);
    }

    public void employeeDetails(){
        System.out.println("THIS IS NORMAL JAVA IMP");
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
