package org.spring.main;

import org.spring.examples.Employee;
import org.spring.examples.Student;
import org.spring.resources.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

public class Main {
    public static void main(String[] args) {

        //String Config_location = "classpath:SpringConfig.java";
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        /**
         * this implementation is through xml configuration bean
         */
        Student std = (Student) context.getBean("studentIDTwo");
     // Student std = context.getBean(Student.class); if only one bean is present
          std.display();
          std.setEmail("dyanamicstar@gmail.com");

          System.out.println(std.getEmail());

        /**
         * this implementation is through normal java object
         */
        Employee emp = new Employee(20, "hola", 30);
        emp.employeeDetails();
    }
}