package com.example.prct5.Repository;

import com.example.prct5.Models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findByNameContaining(String name);
}