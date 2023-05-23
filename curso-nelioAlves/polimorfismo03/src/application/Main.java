package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.importedProduct;
import entities.usedProduct;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Price: ");
			double price = scan.nextDouble();
			if(ch == 'i') {
				System.out.print("Customs fee:");
				double customsFee = scan.nextDouble();
				Product product = new importedProduct(name, price, customsFee);
				list.add(product);
			} else if(ch =='u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(scan.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product product = new usedProduct(name, price, date);
				list.add(product);
			} else if(ch == 'c') {
				Product product = new Product(name, price);
				list.add(product);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product x : list) {
			System.out.println(x.priceTag());
		}
		
		
		scan.close();
	}

}
