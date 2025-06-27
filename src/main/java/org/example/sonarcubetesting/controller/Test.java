package org.example.sonarcubetesting.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class Test {
    
    @GetMapping("/users")
    public String getData() {
        String unusedVariable = "never used"; // Unused local variable
        String password = "admin123"; // Hardcoded credentials
        return "GET request successful";
    }
    
    @PostMapping("/create")
    public String postData(@RequestBody String data) {
        return "POST request successful: " + data;
    }
}
