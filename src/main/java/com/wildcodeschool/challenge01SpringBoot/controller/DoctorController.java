package com.wildcodeschool.challenge01SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    @GetMapping("/doctor/1")
    @ResponseBody
    public String index() {
        return "<ul><a href='https://spring.io/projects/spring-boot'><li>William Hartnell</li></a></ul>";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String david() {
        return "<ul><a href='https://spring.io/projects/spring-boot'><li>David Tennant</li></a></ul>";
    }
    @GetMapping("/doctor/13")
    @ResponseBody
    public String jodie() {
        return "<ul><a href='https://spring.io/projects/spring-boot'><li>Jodie Whittaker</li></a></ul>";
    }
}

