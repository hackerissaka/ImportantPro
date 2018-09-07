package com.cg.employee.db;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;

import com.cg.employee.bean.Employee;

public class EmployeeDB {
private  static HashMap<Integer,Employee> empDb= new HashMap<Integer,Employee>();
public static HashMap<Integer,Employee> getEmpdB()
{
	return empDb;
	
}
static{
	empDb.put(1001, new Employee(1, "Mark", "Male", 20, "Programmer","9791919987" ,
			LocalDate.of(2016, Month.APRIL, 21), 56000));
	empDb.put(1002, new Employee(2, "Mayjh", "Female", 20, "Team Lead","9791919987" ,
			LocalDate.of(2016, Month.AUGUST, 24), 78000));
	empDb.put(1003, new Employee(3, "Mahgf", "Male", 20, "Manager", "9791919987",
			LocalDate.of(2016, Month.FEBRUARY, 20), 96000));

}
}
