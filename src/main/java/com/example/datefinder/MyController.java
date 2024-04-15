package com.example.datefinder;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.format.DateTimeFormatter;

@RestController

public class MyController {
    @GetMapping("/")

    public String getDate(){
        LocalDate d = LocalDate.now();

        LocalDate date = d.plusDays(100);

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String s = date.format(dt);

        return s;
    }    
}
