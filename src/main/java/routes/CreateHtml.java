package routes;

import java.util.HashMap;   
import java.util.Map;   

public class CreateHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HtmlContent content = new HtmlContent();   
	     content.setUserName("zhangsan");   
	        content.setUserPassword("123");   
	        Map<String, Object> root = new HashMap<String, Object>();   
	        root.put("content", content);   
	        String templatesPath = "/Users/Zhangbolun/full-stack-web-project-yundanangel/src/main/resources/public/template";   
	        String templateFile = "/index.ftl";   
	        String htmlFile = templatesPath + "/firsthtml.html";   
	        FreeMarker.analysisTemplate(templatesPath, templateFile, htmlFile, root);   
	}

}
