package routes;
import static spark.Spark.get;
import static spark.Spark.post;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import org.json.JSONObject;

public class Search {
	Gson gson=new Gson();
	public Search(){
		search();
	}
	public void search(){

		get("/search",(req,res)->{


			Map<String,Object> Job=new HashMap<>();
			Job.put("Job",req.queryParams("jobs"));
			Job.put("Employer", "Microsoft");
			Job.put("City", "New York City");
			Job.put("State", "New York");
			Job.put("Zipcode", "12345");
			Job.put("Country","US");
			Job.put("type","Full-time");
			Job.put("startdate","2016-7-1");
			Job.put("enddate","2016-9-1");
			Job.put("wage","200");
			Job.put("sponsor", "Yes");
			String xml =    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                    "<Job>" +
                        "<Employer>"+Job.get("Employer")+"</Employer>" +
                        "<postingtime>1 month ago</postingTime>" +
                        "<City>"+Job.get("City")+"</City>" +
                        "<country>"+Job.get("Country")+"</country>" +
                        "<Zipcode>"+Job.get("Zipcode")+"</Zipcode>" +
                        "<type>"+Job.get("type")+"</type>" +
                        "<startdate>"+Job.get("startdate")+"</startdate>" +
                        "<enddate>"+Job.get("enddate")+"</enddate>" +
                        "<wage>"+Job.get("wage")+"</wage>" +
                        "<sponsor>"+Job.get("sponsor")+"</sponsor>" +
                    "</Job>";
			res.type("content/xml");
			System.out.println("search successfully");
			return xml;
		});

	}
}