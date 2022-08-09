package com.example.demo12;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "personservice" , url = "localhost:8120",path = "/person")
public interface personService {

    @PostMapping("/getperson")
    public String getpersonname();

    @PostMapping("/personinfo")
    public person getperson();



    @PostMapping("/getinfo")
    public String getinfo(@RequestParam("name") String name);

}

