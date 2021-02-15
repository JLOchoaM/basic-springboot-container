package com.jlochoam.basiccontainer;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String greet() {
        return "Hello, this is my first spring boot application";
    }
}
