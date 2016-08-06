package com.blog.mvc.controllers;
import com.blog.mvc.data.services.Project;
import com.blog.mvc.data.services.RestCaller;
import com.blog.mvc.controllers.GenericException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.blog.mvc.data.services.CustomerDAO;


@Controller
public class HController {
	
	@Autowired
    private CustomerDAO customerDAO;
	
	//RestCaller a;
	Project c;
	private static final Logger log =Logger.getLogger(HController.class);
	
	@RequestMapping("/home")
	public String goHome(Model model){
         
         int total = customerDAO.findTotalCustomer();
         System.out.println("Total : " + total);
         model.addAttribute("desc", total);
		return "home";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add()
	{
		return "wish_add";
	}
	
	@RequestMapping(value="/sub",method=RequestMethod.POST,params={"type=single"},produces={"application/json"})
	@ResponseBody
	public Project addProject(){
		System.out.println("In Project()............");
		Project p=new Project();
		p.setDescription("Hi Srinath");
		return p;
			// done by jackson
	}
	
	@RequestMapping(value="/sub", method=RequestMethod.POST, params={"type=multi"})
	@ResponseBody
	public String delete()
	{
		log.trace("Application Starting...");
	    log.trace("Checking arguments...");
		try
		{
		RestCaller a=new RestCaller();
			System.out.println("try inside");
		String s=a.getOnlyXML();
		
		return s;
		}
		catch(Exception e)
		{
			log.error("CXF not available...");
		
	    System.out.println("catch");
		throw new GenericException("E888", "This is custom message X");
		}
	}
	
	@RequestMapping(value="/sub", method=RequestMethod.POST, params={"type=many"})
	@ResponseBody
	public String delete1()
	{
		log.trace("Application Starting...");
	    log.trace("Checking arguments...");
		try
		{
		RestCaller a=new RestCaller();
			System.out.println("try inside");
		String s=a.getOnlyXML1();
		
		return s;
		}
		catch(Exception e)
		{
			log.error("Camel not available...");
		
	    System.out.println("catch");
		throw new GenericException("E888", "This is custom message X");
		}
	}
	
	
	@ExceptionHandler(GenericException.class)
	public ModelAndView handleCustomException(GenericException ex) {

		ModelAndView model = new ModelAndView("generic_error");
	    model.addObject("exception", ex.errCode);
		System.out.println(ex.errCode);
		System.out.println("ll");
		return model;

	}
}
