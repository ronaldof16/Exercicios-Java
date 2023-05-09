package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departament = scan.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = scan.nextLine();
		System.out.print("Level: ");
		String workerLevel = scan.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = scan.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departament));
		
		System.out.println(worker);
			
		
		scan.close();
	}

}
