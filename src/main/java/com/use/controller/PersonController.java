package com.use.controller;

import com.use.entity.Person;
import com.use.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonServices personService;

    @PostMapping("/save")
    public String save(@RequestBody Person person){
        personService.getPerson(person);
        return "Success";
    }


}
