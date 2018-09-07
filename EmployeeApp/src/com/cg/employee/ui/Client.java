package com.cg.employee.ui;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.cg.employee.bean.Employee;
import com.cg.employee.exception.EmployeeException;
import com.cg.employee.service.EmployeeService;
import com.cg.employee.service.IEmployeeService;

public class Client {
Scanner scan = new Scanner(System.in);
IEmployeeService service = new EmployeeService();
	public static void main(String[] args) {
		Client c= new Client();
		
		// TODO Auto-generated method stub
String option="";
while(true){
	System.out.println("1. Display all Employees");
	System.out.println("2.Add an Employee");
	System.out.println("3.Delete an Employee");
	System.out.println("4.Update an Employee");;
	System.out.println("5. Display Employee by Id");
	System.out.println("6. Display Employees by Designation");
	System.out.println("7. Display the most senior Employees");
	System.out.println("Exit");
	System.out.println("Enter your Choice");
	option= c.scan.nextLine();
	switch(option){
	case "1":
		c.displayAllEmployee();
		
		break;
	case "2":
		c.addEmployee();
		break;
	case "3":
		c.deleteEmployee();
		break;
	case "4":
		c.updateEmployee();
		break;
	case "5":
		c.displayEmployeeById();
		break;
	case "6":
		c.displayEmployeeByDesig();
		break;
	case "7":
		c.findSenior();
		break;
	case "8":
		System.exit(0);
		default:
			System.out.println("Please select option from 1 to 8");
			break;
			
	}
	
}
	}
private void displayAllEmployee(){
	try{
		Collection<Employee> employees= service.getAllEmployee();
		employees.forEach(System.out::println);
	}catch(EmployeeException e)
	{
		System.out.println();
		System.err.println("An error occured : "+e.getMessage());
		System.out.println();
	}
}
public void displayEmployeeById(){
	System.out.println("Enter the employee id");
	int id=Integer.parseInt(scan.nextLine());
	try {
		Employee emp = service.getEmployeeId(id);
		System.out.println(emp);
		
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		System.out.println();
		System.err.println("An error occured : "+e.getMessage());
		System.out.println();
	}
			
}
public void addEmployee(){
	Employee emp = new Employee();
	System.out.println("Enter employee id");
	emp.setId(Integer.parseInt(scan.nextLine()));
	System.out.println("Enter employee name");
	emp.setName(scan.nextLine());
	System.out.println("Enter employee gender");
	emp.setGender(scan.nextLine());
	System.out.println("Enter employee age");
	emp.setAge(Integer.parseInt(scan.nextLine()));
	System.out.println("Enter employee designation");
	emp.setDesignation(scan.nextLine());
	System.out.println("Enter employee mobile");
	emp.setMobile(scan.nextLine());
	emp.setDoj(LocalDate.now());
	System.out.println("Enter employee salary");
	emp.setSalary(Double.parseDouble(scan.nextLine()));
	try {
		boolean result = service.validateEmployee(emp);
		if(result){
			int ret = service.addEmployee(emp);
			System.out.println("Employee with Id "+ ret+ " added to the database");
			System.out.println(emp);
		}
	} catch (EmployeeException e) {
		System.out.println();
		System.err.println("An error occured : "+e.getMessage());
		System.out.println();
	}
	
}
private void deleteEmployee(){
	System.out.println("Enter the employee id");
	int id=Integer.parseInt(scan.nextLine());
	try {
		int ret = service.deleteEmployee(id);
		System.out.println("deleted " + ret);
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		System.out.println();
		System.err.println("An error occured : "+e.getMessage());
		System.out.println();
	}
	
}
public void displayEmployeeByDesig(){
	System.out.println("Enter the employee designation");
	String desig=scan.nextLine();
try {
	List<Employee> employees = service.getEmployeeByDesignation(desig);
	employees.forEach(System.out::println);
} catch (EmployeeException e) {
	// TODO Auto-generated catch block
	System.out.println();
	System.err.println("An error occured : "+e.getMessage());
	System.out.println();
}
}
public void findSenior(){
	
	try{
		Employee emp = service.findSeniorMostEmployee();
		System.out.println(emp);
	}catch(EmployeeException e)
	{
		System.out.println();
		System.err.println("An error occured : "+e.getMessage());
		System.out.println();
	}
}
public void updateEmployee(){
	System.out.println("Enter Employee id");
	int id= Integer.parseInt(scan.nextLine());
	try {
		Employee emp = service.getEmployeeId(id);
		System.out.println("Employee current details");
		System.out.println(emp);
		System.out.println("enter name");
		System.out.println("Enter employee name");
		emp.setName(scan.nextLine());
		System.out.println("Enter employee gender");
		emp.setGender(scan.nextLine());
		System.out.println("Enter employee age");
		emp.setAge(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter employee designation");
		emp.setDesignation(scan.nextLine());
		System.out.println("Enter employee mobile");
		emp.setMobile(scan.nextLine());
		System.out.println("Enter employee salary");
		emp.setSalary(Double.parseDouble(scan.nextLine()));
		emp.setDoj(emp.getDoj());
		emp.setId(emp.getId());
		boolean b = service.validateEmployee(emp);
		if(b){
			int ret= service.updateEmployee(emp);
			System.out.println("Employee with id "+ id + " successfully updated");
		}
	} catch (EmployeeException e) {
		System.out.println();
		System.err.println("An error occured : "+e.getMessage());
		System.out.println();
	}
}


}
