package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello!";
    }

    @RequestMapping("/homepage")
    public String homePage() {
        return  "index";
    }

}
