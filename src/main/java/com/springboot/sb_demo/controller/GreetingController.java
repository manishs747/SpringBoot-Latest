package com.springboot.sb_demo.controller;


import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


/**
 * https://www.baeldung.com/spring-controller-vs-restcontroller
 */

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    String greeting() {
        return "Greeting from Sprintboot!";
    }


    /**
     * http://localhost:8080/spring-mvc-basics/api/foos?id=abc
     * ID: abc
     * @param id
     * @return
     */
    @GetMapping("/api/foos")
    @ResponseBody
    public String getFoos(@RequestParam String id) {
        return "ID: " + id;
    }
}
