package com.transactionService.service;

import com.transactionManagement.java.Employee;

public interface TransactionService {

	public void insertEmployee(Employee emp);

	public Employee getEmployeebyId(Integer employeeIdentifier);

	public int updateSalaryfoeEmployee(Integer employeeIdentifier,Integer Salary);

}
