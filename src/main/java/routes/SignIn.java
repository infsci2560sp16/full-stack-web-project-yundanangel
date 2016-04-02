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

		post("/SignUp",(req,res)->{
			Map<String,Object> user=new HashMap<>();
			String email=req.queryParams("email");
			user.put("First_name","Bolun");
			user.put("Last_name","Zhang");
			user.put("email",email);
			user.put("password", 12);
			user.put("zipcode",15232);
			System.out.println("sign up success");
			return user;
		},gson::toJson);

		get("/SignIn",(req,res)->{
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