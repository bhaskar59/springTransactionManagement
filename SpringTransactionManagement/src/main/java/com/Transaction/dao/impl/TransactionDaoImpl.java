package com.Transaction.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Transaction.dao.Transaction;
import com.transactionManagement.java.Employee;

@Component("transactionDao")
public class TransactionDaoImpl implements Transaction {

	@Autowired
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional(propagation =Propagation.REQUIRED)
	public void insertEmployee(Employee emp) {
		sessionFactory.openSession().save(emp);
		
	}

	public Employee getEmployeebyId(Integer employeeIdentifier) {
		// TODO Auto-generated method stub
		return (Employee) sessionFactory.openSession().get(Employee.class, employeeIdentifier);
	}

	public int updateSalaryfoeEmployee(Integer employeeIdentifier,
			Integer Salary) {
		// TODO Auto-generated method stub
		Query q= (Query) sessionFactory.openSession().createQuery("update Employee set Salary=:salary where id=:id")
				.setParameter("salary", Salary)
				.setParameter("id", employeeIdentifier);
		return q.executeUpdate();
		
	}

}
