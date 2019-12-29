package com.ss.spring.mvc;

import java.util.Map;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

//import com.sun.javafx.collections.MappingChange.Map;

@Controller
@SessionAttributes
public class RegisterController {
@Autowired
	private EmployeeValidator employeeValidator;
@RequestMapping(value="/registerEmployee",method=RequestMethod.POST)
public String registerEmployee(@ModelAttribute("employee")Employee emp,BindingResult result)throws ServletException{
	
	System.out.println("registerEmployee");
	employeeValidator.validate(emp,result);
	if(result.hasErrors()){
		System.out.println(result.getErrorCount());
		return "register";
	}
	System.out.println(emp.getFirstname());
	System.out.println(emp.getLastname());
	System.out.println(emp.getEmail());
	System.out.println(emp.getPhone());
	System.out.println(emp.getGender());
	
	return "home";	
}
@RequestMapping(value="/register")
protected String showRegisterForm(Map model)throws ServletException{
	System.out.println("show registerForm");
	Employee emp=new Employee();
	emp.setFirstname("Chinmaya");
	model.put("employee",emp);
	return "register";
	
}
}
