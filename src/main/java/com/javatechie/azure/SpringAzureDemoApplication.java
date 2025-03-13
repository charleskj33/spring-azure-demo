package com.javatechie.azure;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {
    @GetMapping("/message")
    public String message(){
        return "Congrats ! your application deployed successfully in Azure Platform. !";
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}