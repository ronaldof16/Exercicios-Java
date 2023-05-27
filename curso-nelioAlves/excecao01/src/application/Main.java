package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

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
		
		System.out.print("Enter amount for withdraw: ");
		Double amount = scan.nextDouble();
		account.withdraw(amount);
		//System.out.println(account.getBalance());
		
		scan.close();
	}

}
