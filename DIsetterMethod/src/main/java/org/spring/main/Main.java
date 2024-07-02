package org.spring.main;

import org.spring.example.Address;
import org.spring.example.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student std =(Student)context.getBean("studentID");
        std.display();


        Address ads =(Address) context.getBean("studentAddress");
        ads.print();
    }
}