package com.cg.employee.service;

import java.util.Collection;
import java.util.List;

import com.cg.employee.bean.Employee;
import com.cg.employee.dao.EmployeeDao;
import com.cg.employee.dao.IEmployeeDao;
import com.cg.employee.exception.EmployeeException;

public class EmployeeService implements IEmployeeService {

	IEmployeeDao employeeDao = new EmployeeDao();
	public Collection<Employee> getAllEmployee() throws EmployeeException {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee();
	}
	public Employee getEmployeeId(int id) throws EmployeeException{
		return employeeDao.getEmployeeId(id);
	}
	@Override
	public boolean validateEmployee(Employee emp) throws EmployeeException {
		if(validateName(emp.getName()) && validateMobile(emp.getMobile()) && validateAge(emp.getAge())){
			return true;
		}
		return false;
	}
	private boolean validateName(String name)throws EmployeeException{
		
		if(name.isEmpty() || name== null){
			throw new EmployeeException("Employee name cannot be empty");
		}else{
			if(!name.matches("[A-Z][A-Za-z]{3,}")){
				throw new EmployeeException("Name should be capital letter and should contain only albhabet");
			}
		}
		
		return true;
	}
	private boolean validateMobile(String mobile) throws EmployeeException{
		
		if(!mobile.matches("\\d{10}")){
			throw new EmployeeException("Mobile Number should contain 10 digits");
		}
		return true;
	}
	private boolean validateAge(int age)throws EmployeeException{
		if(age>=18 && age<=60){
			return true;
			
		}else
		{
			throw new EmployeeException("Age should be between 18 nand 60");
		}
		
	}
	@Override
	public int addEmployee(Employee emp) throws EmployeeException {
		
		return employeeDao.addEmployee(emp);
	}
	
	@Override
	public int deleteEmployee(int id) throws EmployeeException {
		return employeeDao.deleteEmployee(id);
	}
	@Override
	public List<Employee> getEmployeeByDesignation(String designation)
			throws EmployeeException {
		
		return employeeDao.getEmployeeByDesignation(designation);
				
	}
	@Override
	public Employee findSeniorMostEmployee() throws EmployeeException {
		
		return employeeDao.findSeniorMostEmployee();
	}
	@Override
	public int updateEmployee(Employee emp) throws EmployeeException {
		employeeDao.updateEmployee(emp);
		
		
		return 0;
	}
}
