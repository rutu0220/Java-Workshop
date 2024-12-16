package com.sunbeam.tester;
import com.sunbeam.entities.Manager;
import com.sunbeam.entities.Salesman;


import java.util.Scanner;

import com.sunbeam.entities.Employee;

public class Program01 {

	public static int menu(Scanner sc) {
		System.out.println("********************");
		System.out.println("0. EXIT");
		System.out.println("1. Add Manager");
		System.out.println("2. Add Salesman");
		System.out.println("3. Display Managers");
		System.out.println("4. Disply Salesman");
		System.out.println("********************");
		System.out.print("Enter your choice - ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int index = 0;
		Employee[] empList = new Employee[5];
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				empList[index] = new Manager();
				empList[index].accept(sc);
				index++;
				break;
			case 2:
				empList[index] = new Salesman();
				empList[index].accept(sc);
				index++;
				break;
			case 3:
				for(Employee e:empList)
					if(e instanceof Manager)
					{
						System.out.println(e);
					}
				break;
			case 4:
				for(Employee e:empList)
					if(e instanceof Salesman)
					{
						System.out.println(e);
					}
				break;

			default:
				System.out.println("Wrong choice... :(");
				break;
			}
		}

	}

}
