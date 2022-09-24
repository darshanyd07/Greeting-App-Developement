package com.example.greetingappdevelopment.repository;

import com.example.greetingappdevelopment.model.GreetingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GreetingRepository extends JpaRepository<GreetingData,Integer>
{
}