package com.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transactionManagement.java.Employee;
import com.transactionService.service.TransactionService;

public class TransactionManagementTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new  ClassPathXmlApplicationContext("Bean.xml");
		Employee emp = (Employee)applicationContext.getBean("employee");
		emp.setFirstName("vivek3");
		emp.setLastName("krishna2");
		emp.setAmount(2000);
		TransactionService ts=(TransactionService) applicationContext.getBean("transactionService");
		ts.insertEmployee(emp);
	}

}
