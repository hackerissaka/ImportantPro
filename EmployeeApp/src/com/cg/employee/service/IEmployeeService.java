package com.cg.employee.service;

import java.util.Collection;
import java.util.List;

import com.cg.employee.bean.Employee;
import com.cg.employee.exception.EmployeeException;

public interface IEmployeeService {
	public Collection<Employee> getAllEmployee() throws EmployeeException;
	Employee getEmployeeId(int id) throws EmployeeException;
	boolean validateEmployee(Employee emp) throws EmployeeException;
	int addEmployee(Employee emp) throws EmployeeException;
	int deleteEmployee(int id) throws EmployeeException;
	List<Employee> getEmployeeByDesignation(String designation) throws EmployeeException;
	Employee findSeniorMostEmployee() throws EmployeeException;
	int updateEmployee(Employee emp) throws EmployeeException;
}

