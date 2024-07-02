package org.spring.main;

import org.spring.examples.Employee;
import org.spring.examples.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        String Config_path ="classpath:applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(Config_path);

        Student student = (Student) context.getBean("student");
        student.display();

        Employee employee = new Employee();
        employee.employe();   // returning default value only because @value is not assigned
        // as bean is not created as it is taking normal java object
    }
}