package org.spring.main;

import org.spring.example.Student;
import org.spring.resources.SpringConf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConf.class);

        Student std = (Student) context.getBean("student");
        std.display();
    }
}