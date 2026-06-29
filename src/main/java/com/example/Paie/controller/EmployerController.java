package com.example.Paie.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Paie.Exception.EmployerException;
import com.example.Paie.model.Employer;
import com.example.Paie.repository.EmployerRepository;

@RestController
public class EmployerController {
    private final EmployerRepository repository;

    EmployerController(EmployerRepository repository){
        this.repository = repository;
    }

    @GetMapping("/employees")
    List<Employer> all(){
        return this.repository.findAll();
    }

    @PostMapping("/employees")
    Employer newEmployer(@RequestBody Employer newemployer){
        return this.repository.save(newemployer);
    }

    @GetMapping("/employees/{id}")
    Employer one(@PathVariable Long id){
        return this.repository.findById(id).orElseThrow(() -> new EmployerException(id));
    }
}
