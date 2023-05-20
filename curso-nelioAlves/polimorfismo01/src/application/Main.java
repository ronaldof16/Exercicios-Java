package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + i + 1 + " data:");
			System.out.print("Outsourced (y/n)?");
			char out = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Hours: ");
			int hours = scan.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			
			if(out =='y') {
				System.out.print("Additional charge: ");
				double additionalCharge = scan.nextDouble();
				Employee emp1 = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp1);
			} else if(out == 'n') {
				Employee emp2 = new Employee(name, hours, valuePerHour);
				list.add(emp2);
			}
			
			
		}
		
		scan.close();
	}

}
