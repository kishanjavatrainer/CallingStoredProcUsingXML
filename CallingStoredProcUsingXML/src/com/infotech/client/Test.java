package com.infotech.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;
import com.infotech.service.impl.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
	
	AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
	EmployeeService employeeService=ctx.getBean("employeeService", EmployeeServiceImpl.class);
	Employee employee = employeeService.fetchEmployeeNamAndSalaryById(3);
	
	System.out.println(employee.getEmployeeName()+"\t"+employee.getSalary());
	
	ctx.close();
	}
}
