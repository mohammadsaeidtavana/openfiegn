package com.example.demo12;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @autor mohammad saeid tavana
 */
@RestController
@RequestMapping("/client")
public class controller {

    @Autowired
    personService personService;

    @GetMapping(value = "/getname")
    public String getname(){

        return personService.getpersonname()+"feign";
    }

    @GetMapping(value = "/getperon")
    public person getperson(){

        return personService.getperson();
    }

    @PostMapping(value = "/getinfor")
    public String getinfo(@RequestParam("name") String name){

        return personService.getinfo(name);
    }
}
