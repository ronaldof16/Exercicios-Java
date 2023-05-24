package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = scan.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = scan.nextDouble();
				list.add(new PessoaFisica(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				Integer employees = scan.nextInt();
				list.add(new PessoaJuridica(name, anualIncome, employees));
			}
			
			
		}
		
		
		scan.close();
	}

}
