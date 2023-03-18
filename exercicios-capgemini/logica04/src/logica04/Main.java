package logica04;

import java.util.Locale;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String nome;
		float salarioFixo, totalVendas;
		
		System.out.print("Digite o nome do vendedor: ");
		nome = scan.nextLine();
		System.out.print("Digite o salário fixo do vendedor: ");
		salarioFixo = scan.nextFloat();
		System.out.print("Digite o total de vendas feito pelo vendedor no mês: ");
		totalVendas = scan.nextFloat();
		
		float comissao = (15 / 100.f) * totalVendas;
		float salarioTotal = salarioFixo + comissao;
		
		System.out.println(String.format("%.2f", comissao));
		
		System.out.println("Vendedor: " + nome);
		System.out.println("Salário Fixo: " + String.format("%.2f", salarioFixo));
		System.out.println("Salário fixo mais comissão: " + String.format("%.2f", salarioTotal));
		
		scan.close();

	}

}
