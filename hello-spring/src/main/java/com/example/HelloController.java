package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.ThreadLocalRandom;

@Controller
public class HelloController {

    private static final String[] DICE = {"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello, World!");
        model.addAttribute("dice", DICE[ThreadLocalRandom.current().nextInt(DICE.length)]);
        return "index";
    }
}
