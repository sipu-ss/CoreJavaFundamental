package com.ss.spring.mvc;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class EmployeeValidator implements Validator {


	public boolean supports(Class clazz) {
		
		return Employee.class.equals(clazz);
	}

	public void validate(Object obj, Errors errors) {
       
		Employee emp=(Employee)obj;
		if(emp.getFirstname()==null || emp.getFirstname().length()==0){
			errors.rejectValue("firstname", "errors.firstname,required",new Object[]{},"first name is required.");
		}
		if(emp.getLastname()==null || emp.getLastname().length()==0){
			errors.rejectValue("lastname", "errors.lastname,required",new Object[]{},"lastname is required.");
		}
		if(emp.getEmail()==null || emp.getEmail().length()==0){
			errors.rejectValue("email", "errors.email,required",new Object[]{},"email is required.");
		}
		else if(!(emp.getEmail().contains("@"))&&(emp.getEmail().endsWith(".com")||(emp.getEmail().endsWith(".co.in")||emp.getEmail().endsWith(".in")))){
			errors.rejectValue("email", "errors.email.invalid",new Object[]{},"invalid email");
		}
		if(emp.getPhone()==null || emp.getPhone().length()==0){
			errors.rejectValue("Phone", "errors.Phone,required",new Object[]{},"Phone is required.");
		}
		else if(emp.getPhone().length()!=10){
			errors.rejectValue("Phone", "errors.Phone,invalid",new Object[]{},"Phone is required 10 digit.");	
		}
		else if(emp.getPhone().length()==10){
			try{
			Integer.parseInt(emp.getPhone());
			}catch(Exception e){
				errors.rejectValue("Phone", "errors.Phone,invalid",new Object[]{},"Phone contains only digits.");	
			}
		}
	}

}
