package com.demo.spring.data.springdata.controllers;

import com.demo.spring.data.springdata.models.Person;
import com.demo.spring.data.springdata.repositories.PersonRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PersonController {

    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping("/person")
    public String getPerson() {
        Optional<Person> person = personRepository.findById(new Long(2));
        Optional<Person> person2 = personRepository.findByJob("Musician");

        StringBuilder sb = new StringBuilder();
        sb.append("Person by id: " + person.get().getName() + "<br/>");
        sb.append("Person by job: " + person2.get().getName());

        return sb.toString();
    }
}
