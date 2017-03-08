package com.infotech.service;

import com.infotech.model.Employee;

public interface EmployeeService {

	public abstract Employee fetchEmployeeNamAndSalaryById(int employeeId);
}
