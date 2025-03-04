package com.org.employeemanagement;

import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);
	//private EmployeeService employeeService=new EmployeeService();
	static boolean ordering=true;
	
	public static void menu() {
		System.out.println("\n******************Welcome to EmployeeManagement**********************"
				+ "\n1. Add Employee "
				+ "\n2. View Employee"
				+ "\n3. Update Employee"
				+ "\n4. Delete Employee"
				+ "\n5. View All Employee"
				+ "\n6. Exit ");

	}

	public static void main(String[] args) {
		EmployeeService empService=new EmployeeService();
		
		
		do {
			menu();
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1 :
				Employee e=new Employee();
				System.out.println("Set empID");
				e.setId(sc.nextInt());
				System.out.println("Set Name");
				sc.nextLine();
				e.setName(sc.nextLine());
				System.out.println("Set Age");
				e.setAge(sc.nextInt());
				System.out.println("Set Department");
				sc.nextLine();
				e.setDepartment(sc.nextLine());
				System.out.println("Set Designation");
				e.setDesignation(sc.nextLine());
				System.out.println("Set Salary");
				e.setSalary(sc.nextDouble());
				System.out.println(empService.addEmployee(e));
			        
			break;
			case 2:  System.out.println("Enter ID");
			          int id=sc.nextInt();
			          empService.viewEmployee(id);
			break;
			case 3:System.out.println("Enter ID");
	          int id1=sc.nextInt();
	          empService.updateEmployeByID(id1);
			break;
			case 4: System.out.println("Enter ID");
	          int id2=sc.nextInt();
	          empService.deleteEmployee(id2);
			break;
			case 5: empService.viewAllEmployee();
			break;
			case 6:System.out.println("Thank You !!!!!"); 
				System.exit(0);
			default : System.out.println("Wrong Choice");
			
			}
		}while(ordering);

	}

}
