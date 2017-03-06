package com.transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;

import com.transactionManagement.java.Employee;
import com.transactionService.service.TransactionService;

import junit.framework.TestCase;


@RunWith(JUnit4.class)
public class SpringTransactionManageTest extends TestCase {
	
	@Autowired
	TransactionService transactionService;
	
	@Test
	public void testInsertEmployee(){
		Employee emp =new Employee();
		emp.setFirstName("muni");
		emp.setLastName("bhaskar");
		emp.setAmount(50000);
		transactionService.insertEmployee(emp);
	}

}
