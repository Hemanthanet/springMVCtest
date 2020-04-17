package com.hemantha.test.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processFrom")
	public String processForm()
	{
		return "helloworld";
	}
	
	
	//new controller method to process from data to contoller--> model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model)
	{
		//read the request parameter from the HTML
		String theName=request.getParameter("studentName");
		//convert to the upper case
		theName=theName.toUpperCase();
		//create the message 
		String result="Yooo"+theName;
		//add the message for the model
		model.addAttribute("message",result);//we can add any model attribute here
		
		return "helloworld"; //this is the view jsp
	}

}
