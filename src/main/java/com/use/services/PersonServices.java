package com.use.services;

import com.use.entity.Person;
import com.use.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServices {

    @Autowired
    private PersonRepo repo;

    public Person getPerson(Person person){
        return repo.save(person);
    }
}
