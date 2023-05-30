package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    String helloName(@RequestParam String name){
        return "Hello " + name;
    }

    @PostMapping
    String helloName(@RequestBody HashMap<String, String> body){
        return "Hello Post " + body.get("name").toString();
    }
}
