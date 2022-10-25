package com.example.foldersandfiles.controllers;

import com.example.foldersandfiles.models.Person;
import com.example.foldersandfiles.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PeopleController {

    @Autowired
    PeopleRepository peopleRepository;

    @GetMapping(value = "/people")
    public List<Person> getAllPeople(){
        return peopleRepository.findAll();
    }

    @GetMapping(value = "/people/{id}")
    public Optional<Person> getPerson(@PathVariable Long id){
        return peopleRepository.findById(id);
    }
}
