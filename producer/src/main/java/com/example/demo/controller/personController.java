package com.example.demo.controller;


import com.example.demo.person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autor mohammad saeid tavana
 */
@RestController
@RequestMapping("/person")
public class personController {


    @PostMapping(value = "/getperson")
    public String personnaem() {

        return " mohammad saeid tavan";
    }

    @PostMapping(value = "/personinfo")
    public person personIfno() {
        person person = new person("saeed", "tavana");
        return person;
    }

    @PostMapping(value = "/getinfo")
    public String getinfo(@RequestParam("name") String name) {

        return name;
    }
}
