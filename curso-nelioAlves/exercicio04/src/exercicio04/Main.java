package exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		CurrencyConverter converter = new CurrencyConverter();
		
		System.out.print("What is the dollar price: ");
		converter.cotacaoDolar = scan.nextDouble();
		System.out.print("How many dollars be bought: ");
		converter.valorDolar = scan.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", converter.calcularValorReal()));
		
		scan.close();
	}

}
