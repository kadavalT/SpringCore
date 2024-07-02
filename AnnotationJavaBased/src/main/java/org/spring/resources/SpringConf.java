package org.spring.resources;

import org.spring.example.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("org.spring.example")
//@ComponentScan({"org.spring.example", "----"})
@ComponentScan(basePackages = {"org.spring.example"})
public class SpringConf {

}
