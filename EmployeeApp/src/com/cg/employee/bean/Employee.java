package com.cg.employee.bean;

import java.time.LocalDate;

public class Employee {
private int id;
private String name;
private String gender;
private int age;
private String designation;
private String mobile;
private LocalDate doj;
private double salary;
public Employee(int id, String name, String gender, int age,
		String designation, String mobile, LocalDate doj, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.designation = designation;
	this.mobile = mobile;
	this.doj = doj;
	this.salary = salary;
}
public Employee() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", gender=" + gender
			+ ", age=" + age + ", designation=" + designation + ", mobile="
			+ mobile + ", doj=" + doj + ", salary=" + salary + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public LocalDate getDoj() {
	return doj;
}
public void setDoj(LocalDate doj) {
	this.doj = doj;
}
public double getSalary() {
	return salary;
}
public void setSalary(double d) {
	this.salary = d;
}



}
