package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commmandLineRunner(StudentRepository repository){
        return args-> {
            Student mariam = new Student(
                    "Marriam",
                    "marriamjamal123@gmail.com",
                    LocalDate.of(2003, MAY, 28),
                    21
            );
            Student alex = new Student(
                    "Alex",
                    "alexjamal123@gmail.com",
                    LocalDate.of(2001, MAY, 28),
                    21
                    );
            repository.saveAll(List.of(mariam, alex));
        };
    }
}
