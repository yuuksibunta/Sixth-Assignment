package com.helloworld.greet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class GreetController {

    private final String[] greetings = {
            "Hello", "Hi", "Hola", "Bonjour", "Ciao", "こんにちは", "안녕하세요"
    };

    @GetMapping("/greet")
    public String greet() {
        String randomGreeting = getRandomGreeting();
        return randomGreeting + ", World!";
    }

    private String getRandomGreeting() {
        Random random = new Random();
        int index = random.nextInt(greetings.length);
        return greetings[index];
    }
}

