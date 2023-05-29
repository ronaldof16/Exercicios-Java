package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = scan.nextInt();
		System.out.print("Holder: ");
		scan.nextLine();
		String holder = scan.nextLine();
		System.out.print("Initial balance: ");
		Double initialBalance = scan.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = scan.nextDouble();
		
		Account account = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = scan.nextDouble();
		
		try {
			account.withdraw(amount);
			System.out.println("New Balance: " + String.format("%.2f", account.getBalance()));
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		scan.close();
		
	}

}
