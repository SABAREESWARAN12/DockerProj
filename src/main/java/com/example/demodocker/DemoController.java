package com.example.demodocker;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @PostMapping("/GetMessage")
    public String home() { return "Hi FINALLY YOU MADE I";}

}
