package com.example;

import freemarker.template.Configuration;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.staticFiles;

public class HelloWorld {

    private static final String[] DICE = {"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};

    public static void main(String[] args) {
        port(4567);
        routes();
    }

    static void routes() {
        staticFiles.location("/public");
        FreeMarkerEngine engine = createEngine();
        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("message", "Hello, World!");
            model.put("dice", DICE[ThreadLocalRandom.current().nextInt(DICE.length)]);
            return new ModelAndView(model, "index.ftlh");
        }, engine);
    }

    static FreeMarkerEngine createEngine() {
        Configuration config = new Configuration(Configuration.VERSION_2_3_32);
        config.setClassForTemplateLoading(HelloWorld.class, "/templates");
        config.setDefaultEncoding("UTF-8");
        return new FreeMarkerEngine(config);
    }
}
