package com.sunbeam.tester;
import com.sunbeam.Employee;
import com.sunbeam.Manager;
import com.sunbeam.Salesman;


import java.util.Scanner;

public class Program03 {

	
	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Manager");
		System.out.println("2. Salesman");
		System.out.print("Enter your choice - ");
		return sc.nextInt();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		Employee emp = null;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				emp = new Manager(); // upcasting
				break;
			case 2:
				emp = new Salesman(); // upcasting
				break;
			default:
				System.out.println("Wrong choice...");
				break;
			}
			if (emp != null) {
				emp.accept(sc);
				emp.display();
				if(emp instanceof Manager)
				{
					Manager m = (Manager)emp;
					m.calculateTotalSalary();
				}
				else {
					Salesman s =(Salesman)emp;
					s.calculateTotalCommission();
				}
				emp = null;
			}
		}

	}

}
