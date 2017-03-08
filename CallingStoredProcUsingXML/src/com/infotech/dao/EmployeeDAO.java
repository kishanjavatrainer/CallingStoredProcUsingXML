package com.infotech.dao;

import com.infotech.model.Employee;

public interface EmployeeDAO {
	public abstract Employee getEmployeeNamAndSalaryById(int employeeId);
}
