package com.example.greetingappdevelopment.service;

import com.example.greetingappdevelopment.model.GreetingData;
import com.example.greetingappdevelopment.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService
{
    @Autowired
    GreetingRepository greetingRepository;
    public static String getmessage()
    {
        return "Hello World";
    }

    public static String sayHelloByName(String firstName, String lastName)
    {
        return "Hello "+firstName+" "+lastName;
    }

    public GreetingData postData(GreetingData greetingData)
    {
        greetingRepository.save(greetingData);
        return greetingData;
    }

}