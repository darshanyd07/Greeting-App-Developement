package com.example.greetingappdevelopment.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService
{
    public static String getmessage()
    {
        return "Hello World";
    }

    public static String sayHelloByName(String firstName, String lastName)
    {
        return "Hello "+firstName+" "+lastName;
    }

}