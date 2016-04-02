package routes;
import com.google.gson.Gson;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Date;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;
import com.heroku.sdk.jdbc.DatabaseUrl;
import spark.Request;

public class SignUp {
	private static boolean shouldReturnHtml(Request request) {
        String accept = request.headers("Accept");
        return accept != null && accept.contains("text/html");
    }

    Gson gson = new Gson();

    public SignUp() {
        setupRoutes();
    }

    private void setupRoutes() {
        get("/SignUp", (req, res) -> {
            Map<String, Object> data = new HashMap<>();
            data.put("format", "json");
            data.put("status", "live");
            System.out.println("Done");
            return data;
        }, gson::toJson);

  }
}