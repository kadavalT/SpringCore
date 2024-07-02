package org.spring.main;

import org.spring.examples.Employee;
import org.spring.examples.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        String Config_location = "classpath:applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(Config_location);

        /**
         * this implementation is through xml configuration bean
         */
        Student std = (Student) context.getBean("studentIDOne");
        std.display();

        /**
         * this implementation is through normal java object
         */
        Employee emp = new Employee(20,30);
        emp.employeeDetails();
        System.out.println(emp);
    }
}