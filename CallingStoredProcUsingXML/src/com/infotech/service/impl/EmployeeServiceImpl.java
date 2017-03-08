package com.infotech.service.impl;

import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	@Override
	public Employee fetchEmployeeNamAndSalaryById(int employeeId) {
		return employeeDAO.getEmployeeNamAndSalaryById(employeeId);
	}

}
