package com.org.employeemanagement;

import java.util.HashSet;

public class EmployeeService {
HashSet<Employee> empset=new HashSet<>();

Employee emp1=new Employee(101, "Shubham", 25, "IT", "developer", 25000.0);
Employee emp2=new Employee(102, "Smith", 26, "CO", "Tester", 35000.0);
Employee emp3=new Employee(103, "bob", 35, "Admin", "Front End", 45000.0);
Employee emp4=new Employee(104, "John", 20, "IT", "developer", 65000.0);
Employee emp5=new Employee(105, "ram", 25, "CO", "System Eng", 15000.0);

public EmployeeService(){
	empset.add(emp1);
	empset.add(emp2);
	empset.add(emp3);
	empset.add(emp4);
	empset.add(emp5);
}

public String addEmployee(Employee emp) {
	empset.add(emp);
	return "emp Added";
	

}
//view All Emp
public  void viewAllEmployee() {
	for(Employee e: empset) {
		System.out.println(e);
	}
}
public void viewEmployee(int id) {
	boolean found=false;
	for(Employee emp:empset) {
		if(emp.getId()==id) {
			System.out.println(emp);
			found=true;
		}
		
		
	}
	if(!found)System.out.println("Employee With "+id+" Not Present");
}
	
	
	
	
	
	  public void updateEmployeByID(int id) {
		  boolean found=false;
		  for(Employee emp:empset) {
			  if(emp.getId()==id) {
				  System.out.println("Enter Name");
				  Main.sc.nextLine();
				 emp.setName(Main.sc.nextLine());
				 System.out.println("Enter Age");
				 emp.setAge(Main.sc.nextInt());
				 System.out.println("Enter Designation");
				 Main.sc.nextLine();
				 emp.setDesignation(Main.sc.nextLine());
				 System.out.println("Enter Dept");
				emp.setDepartment(Main.sc.nextLine());
				 System.out.println("Enter Salary");
			     emp.setSalary(Main.sc.nextDouble());
			     empset.add(emp);
			     found =true;
			  }
		  }
		  if(!found)System.out.println("Employee With "+id+" Not Present");
	  }
	 

	  public void deleteEmployee(int id) {
		  boolean found=false;
		  for(Employee emp :empset) {
			  if(emp.getId()==id) {
				  empset.remove(emp);
				  System.out.println("Employee Deleted ");
				  found=true;
			  }
		  }
		  if(!found)System.out.println("Employee With "+id+" Not Present");

	  }
}
