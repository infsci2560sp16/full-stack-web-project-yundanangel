package routes;
import com.google.gson.Gson;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import static spark.Spark.get;
import static spark.Spark.post;

public class SignIn {
	Gson gson=new Gson();
	public SignIn(){
		userSignin();
	}
	public void userSignin(){
		System.out.println("sign up success");
		post("/SignUp",(req,res)->{
			System.out.println("get to java success");
			Map<String,Object> user=new HashMap<>();
			String email=req.queryParams("email");
			String password=req.queryParams("password");
			String First_name=req.queryParams("First_name");
			String Last_name=req.queryParams("Last_name");
			String zipcode=req.queryParams("zipcode");
			System.out.println("dataget success");
			user.put("First_name",First_name);
			user.put("Last_name",Last_name);
			user.put("email",email);
			user.put("password", password);
			user.put("zipcode",zipcode);
			System.out.println("sign up success");
			return user;
		},gson::toJson);

		get("/signin",(req,res)->{
		try{
			Map<String,Object> user=new HashMap<>();
			String email=req.queryParams("email");
			String password=req.queryParams("password");
			user.put("email", email);
			user.put("password", password);
			System.out.println("User Authenticated");
			return user;
		}catch(Exception e){
			System.out.println("Exception:"+e);
			return res;}
		
		},gson::toJson);
	}
}