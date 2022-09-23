package com.example.greetingappdevelopment.controller;

import com.example.greetingappdevelopment.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/getMap")
    public String getmessage(){
        return "Hello World";
    }
    @GetMapping("/getbyparam")
    public String getByParam(@RequestParam String name){
        return " Hello " +name;
    }
    @GetMapping("/getpath/{name}")
    public String getpath(@PathVariable String name){
        return " Hello " +name;
    }

    @GetMapping("/getbyservice")
    public String getbyservice(){
        String message= GreetingService.getmessage();
        return message;
    }

    @GetMapping("/hello")
    public String sayPosting(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName)
    {
        if (lastName == null) lastName = "";
        else if (firstName == null) firstName = "";
        else if (firstName == null && lastName == null)
        {
            firstName = "";
            lastName = "";
        }
        return  GreetingService.sayHelloByName(firstName, lastName);
    }

}