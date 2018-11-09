package com.demo.spring.data.springdata.repositories;

import com.demo.spring.data.springdata.models.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, Long> {
    @Override
    Optional<Person> findById(Long aLong);

    Optional<Person> findByJob(String job);
}
