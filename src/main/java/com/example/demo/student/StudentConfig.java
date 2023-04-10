package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    // we want to have a bean
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args ->{
            Student James = new Student(
                    1L,
                    "James Bond",
                    "kkk@gmail.com",
                    LocalDate.of(2000, 1, 5)
            );

            Student Mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2004, 10, 5)
            );

            // Save into our database
            repository.saveAll(
                    List.of(James, Mariam)
            );
        };
    }
}
