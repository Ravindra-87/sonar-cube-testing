package org.example.sonarcubetesting.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class Test {
    
    @GetMapping("/users")
    public String getData() {
         String variable = "neverused"; // Unused local variable
        //String password = "admin1232"; // Hardcoded credentials
        return "GET request successful";


    }

    
    @PostMapping("/create")
    public String postData(@RequestBody String data) {
        return "POST request successful: " + data;
    }
}
