package com.beginsecure.hw.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HwController {
    
    @GetMapping("/api/hw")      
    public String hwMessage(){
        return "Hello World!";
    }

}
