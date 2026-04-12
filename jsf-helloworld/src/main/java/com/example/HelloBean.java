package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.concurrent.ThreadLocalRandom;

@Named
@RequestScoped
public class HelloBean {

    private static final String[] DICE = {"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};

    private String message;
    private String dice;

    @PostConstruct
    public void init() {
        message = "Hello, World!";
        dice = DICE[ThreadLocalRandom.current().nextInt(DICE.length)];
    }

    public String getMessage() {
        return message;
    }

    public String getDice() {
        return dice;
    }
}
