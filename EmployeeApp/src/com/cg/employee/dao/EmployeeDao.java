package com.cg.employee.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cg.employee.bean.Employee;
import com.cg.employee.db.EmployeeDB;
import com.cg.employee.exception.EmployeeException;

public class EmployeeDao implements IEmployeeDao {

	static HashMap<Integer , Employee> empMap= EmployeeDB.getEmpdB();
	@Override
	public Collection<Employee> getAllEmployee() throws EmployeeException {
		try{
		return empMap.values();
		}
		catch(Exception ex){
			throw new EmployeeException(ex.getMessage());
		}
	} 
		// TODO Auto-generated method stub
	@Override
	public Employee getEmployeeId(int id) throws EmployeeException {
		Employee emp=empMap.get(id);
		if(emp==null)
		{
			throw new EmployeeException("Employee with the id"+id+"Does not exist");
			
		}
		return emp;
	}
	@Override
	public int addEmployee(Employee emp) throws EmployeeException {
		if(empMap.containsKey(emp.getId())){
			throw new EmployeeException("Employee with the id " + emp.getId()+"Already exist in the database");
			
		}
		empMap.put(emp.getId(), emp);
		return emp.getId();
	}
	public int deleteEmployee(int id) throws EmployeeException {
		if(!empMap.containsKey(id)){
			throw new EmployeeException("Employee with the id " + id+"does not exist in the database");
		}
		empMap.remove(id);
		return id;
	}
	@Override
	public List<Employee> getEmployeeByDesignation(String designation)
			throws EmployeeException {
		try{
			List<Employee> employees= empMap.values().stream().
					filter(x->x.getDesignation().equals(designation)).collect(Collectors.toList());
			if(employees.size()==0 || employees==null)
			{
				throw new EmployeeException("Invalid designation, Please enter a valid designation");
			}
			return employees;
		}catch(Exception e){
			throw new EmployeeException(e.getMessage());
		}
		
	}
	@Override
	public Employee findSeniorMostEmployee() throws EmployeeException {
		Optional<Employee> emp = empMap.values().stream().min((x,y)->x.getDoj().compareTo(y.getDoj()));
		return emp.get();
		
	}
	@Override
	public int updateEmployee(Employee emp) throws EmployeeException {
		try{
			empMap.replace(emp.getId(), emp);
		}catch(Exception e){
			throw new EmployeeException(e.getMessage());
		}
		return emp.getId();
	}
		
	

}
