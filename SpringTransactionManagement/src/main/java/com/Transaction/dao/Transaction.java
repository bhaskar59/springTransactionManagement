package com.Transaction.dao;

import com.transactionManagement.java.Employee;

public interface Transaction {
	
	public void insertEmployee(Employee emp);
	
	public Employee getEmployeebyId(Integer employeeIdentifier);
	
	public int updateSalaryfoeEmployee(Integer employeeIdentifier,Integer Salary);

}
