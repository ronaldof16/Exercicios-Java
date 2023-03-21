package logica11;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		float precoCusto, porcentagemLucro, precoVenda;
		
		System.out.print("Digite o preço de custo do produto: ");
		precoCusto = scan.nextFloat();
		System.out.print("Digite a porcentagem de lucro do produto: ");
		porcentagemLucro = scan.nextFloat();
		
		precoVenda = precoCusto + (porcentagemLucro * precoCusto);
		
		System.out.println("O preço de venda do produto é: R$ " + String.format("%.2f", precoVenda));
		
		scan.close();

	}

}
