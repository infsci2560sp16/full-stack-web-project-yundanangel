package routes;

import java.sql.Connection;

import java.util.HashMap;
import java.util.Map;

import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

import com.heroku.sdk.jdbc.DatabaseUrl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import static spark.Spark.get;
public class Route1 {
    public Route1() {
        setupRoutes();
    }

    private void setupRoutes() {
            get("/index", (req, res) -> {
                Map<String, Object> attributes = new HashMap<>();
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                String[] dayOfWeek = dateFormat.format(date).split(" ",-1)[0].split("/",-1);
                String[] timeOfDay = dateFormat.format(date).split(" ",-1)[1].split(":",-1);
                attributes.put("title", "Wicked Assets");
                attributes.put("dayOfWeek", dayOfWeek);
                attributes.put("timeOfDay", timeOfDay);
                return new ModelAndView(attributes, "index.ftl");
              }, new FreeMarkerEngine());
    }
                
    
    
}
