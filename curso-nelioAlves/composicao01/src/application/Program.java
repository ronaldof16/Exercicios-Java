package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
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
		
		System.out.print("How many contracts to this worker? ");
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter contract #" + i + 1 + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(scan.next());
			System.out.print("Value per hour: ");
			Double valuePerHour = scan.nextDouble();
			System.out.print("Duration (hours): ");
			int duration = scan.nextInt();
			
			HourContract contract = new HourContract(date, valuePerHour, duration);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		String monthAndYear = scan.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		scan.close();
	}

}
