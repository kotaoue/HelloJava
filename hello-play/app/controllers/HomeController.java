package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import java.util.concurrent.ThreadLocalRandom;

public class HomeController extends Controller {

    private static final String[] DICE = {"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};

    public Result index() {
        String dice = DICE[ThreadLocalRandom.current().nextInt(DICE.length)];
        return ok(index.render("Hello, World!", dice));
    }
}
