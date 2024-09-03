package com.springboot.sb_demo.controller;


import com.springboot.sb_demo.model.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/api/person")
    public Person getPerson(@RequestParam(value = "name", defaultValue = "John Doe") String name,
                            @RequestParam(value = "age", defaultValue = "25") int age) {
        return new Person(name, age);
    }

    @GetMapping("/person")
    public String personView(Model model,
                             @RequestParam(value = "name", defaultValue = "John Doe") String name,
                             @RequestParam(value = "age", defaultValue = "25") int age) {
        Person person = new Person(name, age);
        model.addAttribute("person", person);
        return "person";
    }
}
