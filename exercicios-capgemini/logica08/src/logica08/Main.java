package logica08;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		float cotacaoDolar, quantidadeDolar, quantidadeReal;
		
		System.out.print("Digite a cotação atual do dólar em real: ");
		cotacaoDolar = scan.nextFloat();
		System.out.print("Digite a quantidade de dólares que o usuário possui: ");
		quantidadeDolar = scan.nextFloat();
		
		quantidadeReal = cotacaoDolar * quantidadeDolar;
		
		System.out.println("O usuário possui o seguinte valor em real: R$ " + String.format("%.2f", quantidadeReal));
		
		scan.close();

	}

}
