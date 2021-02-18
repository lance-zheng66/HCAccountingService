package com.hardcore.accounting.controllers;


import com.hardcore.accounting.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloControllers {

    private AtomicLong counter = new AtomicLong();

    //@RequestMapping(path = "v1/greeting", method = RequestMethod.GET)
    @GetMapping("v1/greeting {name}")
    public Greeting sayHello(@PathVariable("name") String name) {
        return new Greeting(counter.incrementAndGet(), String.format("Hello,%s", name));
    }
}