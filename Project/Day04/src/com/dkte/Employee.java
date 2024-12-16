package com.dkte;
import java.util.Scanner;

public class Employee {

	int empid;
	String name;
	double salary;
	
	public Employee()
	{
		
	}
	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public void accept(Scanner sc)
	{
	   empid = sc.nextInt();
	   name = sc.nextLine();
	   salary = sc.nextDouble();
	}
	public void display() {
		System.out.println("Empid - " + empid);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);
	}
	

}
