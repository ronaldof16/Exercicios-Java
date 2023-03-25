package logica22;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		float totalCusto = 0;
		float totalVenda = 0;
		int i = 0;
		
		for(; i < 3; i++) {
			
			System.out.print("Digite o nome do produto: ");
			String produto = scan.nextLine();
			System.out.print("Digite o preco de custo do produto: ");
			float precoCusto = scan.nextFloat();
			System.out.print("Digite o preco de venda do produto: ");
			float precoVenda = scan.nextFloat();
			
			totalCusto = totalCusto + precoCusto;
			totalVenda = totalVenda + precoVenda;
			
			if(precoVenda > precoCusto) {
				System.out.println(produto + " deu lucro!");
			} else if(precoVenda == precoCusto) {
				System.out.println(produto + " deu empate!");
			} else {
				System.out.println(produto + " deu prejuízo!");
			}
			
			scan.nextLine();
			
		}
		
		float mediaCusto = totalCusto / i;
		float mediaVenda = totalVenda / i;
		
		System.out.println("A média dos preços de custo é: " + String.format("%.2f", mediaCusto));
		System.out.println("A média dos preços de venda é: " + String.format("%.2f", mediaVenda));
	}

}
