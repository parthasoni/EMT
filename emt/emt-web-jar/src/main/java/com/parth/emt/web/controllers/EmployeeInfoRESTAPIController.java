package com.parth.emt.web.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.parth.emt.beans.Employee;

@RestController
public class EmployeeInfoRESTAPIController {
	
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	public ArrayList<Employee> getEmployeeList(){
		
		Employee emp1 = new Employee();
		emp1.setName("Parth");
		
		Employee emp2 = new Employee();
		emp2.setName("Vivek");
		
		Employee emp3 = new Employee();
		emp3.setName("Jatin");
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		
		return employeeList;
	}
	

	
	@RequestMapping(value="/employees/{name}", method=RequestMethod.GET)
	public Employee getEmployeeList(@PathVariable("name") String employeeName){
		
		Employee emp1 = new Employee();
		emp1.setName(employeeName);
		emp1.setEmail(employeeName + ".xyz@gmail.com");
	
		
		return emp1;
	}
}
