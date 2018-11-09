package com.demo.spring.data.springdata;

import com.demo.spring.data.springdata.models.Person;
import com.demo.spring.data.springdata.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(PersonRepository personRepository) {
        return args -> {
            personRepository.save(new Person("Kristijan", "Software Engineer"));
            personRepository.save(new Person("Petar", "Architect"));
            personRepository.save(new Person("Marija", "Musician"));
        };
    }
}
