package com.sukumar.firstrest.controller;

import com.sukumar.firstrest.pojo.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @RequestMapping("/hello")
    public Customer hello() {
        Customer c = new Customer("sugan", 22, "Male", "9897876756");
            return c;
    }
}
