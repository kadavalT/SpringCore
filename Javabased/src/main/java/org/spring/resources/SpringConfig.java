package org.spring.resources;

import org.spring.examples.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    //the @Bean in spring is used to declare a method as a factory
    // for creating and configuring a bean managed by the spring container
    @Bean
    public Student studentIDOne(){

        Student student = new Student();
        student.setName("Triveni");
        student.setEmail("dadslittleprincess@gmail.com");
        student.setRollno(6789);
        return student;
    }

    @Bean("studentIDTwo") //bean name
    public Student detailsofStudent(){

        Student student = new Student();
        student.setName("jessica");
        System.out.println("check ittt");
        student.setEmail("girlheartrobber@gmail.com");
        student.setRollno(1234);
        return student;
    }
}
