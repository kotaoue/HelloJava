package com.example;

import com.opensymphony.xwork2.ActionSupport;

import java.util.concurrent.ThreadLocalRandom;

public class HelloAction extends ActionSupport {

    private static final String[] DICE = {"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};

    private String message;
    private String dice;

    @Override
    public String execute() {
        message = "Hello, World!";
        dice = DICE[ThreadLocalRandom.current().nextInt(DICE.length)];
        return SUCCESS;
    }

    public String getMessage() {
        return message;
    }

    public String getDice() {
        return dice;
    }
}
