import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("Tamagotchi", request.session().attribute("Tamagotchi"));

      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

   get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

    String name = request.queryParams("name");
    int food = Integer.parseInt(request.queryParams("food"));
    int sleep = Integer.parseInt(request.queryParams("sleep"));
    int activity = Integer.parseInt(request.queryParams("activity"));


    Tamagotchi tamagotchi = new Tamagotchi(food, sleep, activity);


    model.put("name", name);
    return new ModelAndView(model, layout);

    }, new VelocityTemplateEngine());
  }
}
