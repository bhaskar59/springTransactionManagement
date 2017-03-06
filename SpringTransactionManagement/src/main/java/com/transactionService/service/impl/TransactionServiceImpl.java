package com.transactionService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Transaction.dao.Transaction;
import com.transactionManagement.java.Employee;
import com.transactionService.service.TransactionService;


@Component("transactionService")
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	private Transaction transactionDao;

	public void insertEmployee(Employee emp) {
		transactionDao.insertEmployee(emp);
		
	}

	public Employee getEmployeebyId(Integer employeeIdentifier) {
		
		return transactionDao.getEmployeebyId(employeeIdentifier);
	}

	public int updateSalaryfoeEmployee(Integer employeeIdentifier,
			Integer Salary) {
		return transactionDao.updateSalaryfoeEmployee(employeeIdentifier, Salary);
	}

}
