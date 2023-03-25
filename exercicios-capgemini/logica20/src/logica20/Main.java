package logica20;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int totalCarros = 0;
		int carrosAte2000 = 0;
		int carrosAcima2000 = 0;
		char continuar = 'S';
		
		while(continuar != 'N') {
			
			System.out.print("Digite o preço do veículo: ");
			float preco = scan.nextFloat();
			System.out.print("Digite o ano do veículo: ");
			int anoVeiculo = scan.nextInt();
			totalCarros++;
			
			if(anoVeiculo > 2000) {
				carrosAcima2000++;
				float desconto = preco * (7 / 100.0f);
				preco = preco - desconto;
				System.out.println("Valor do desconto: " + String.format("%.2f", desconto));
				System.out.println("Valor a ser pago pelo cliente: " + String.format("%.2f", preco));
			} else {
				carrosAte2000++;
				float desconto = preco * (12 / 100.0f);
				preco = preco - desconto;
				System.out.println("Valor do desconto: " + String.format("%.2f", desconto));
				System.out.println("Valor a ser pago pelo cliente: " + String.format("%.2f", preco));
			}
			
			System.out.print("Deseja continuar calculando os descontos: S - sim / N - não. ");
			continuar = scan.next().charAt(0);
			
		}
		
		System.out.println("A quantidade de carros até o ano 2000 é " + carrosAte2000 + " e o o total de carros é " + totalCarros);
		
		scan.close();
	}

}
