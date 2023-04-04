package exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		ContaBancaria conta1;
		
		System.out.print("Entre com o número da conta: ");
		int conta = scan.nextInt();
		System.out.print("Entre com o nome do titular da conta: ");
		scan.nextLine();
		String nome = scan.nextLine();
		System.out.print("Existe depósito inicial? S - sim / N - não: ");
		char existeDepositoInicial = scan.next().charAt(0);
		if(existeDepositoInicial == 'S') {
			System.out.println("Entre com o valor do depósito: ");
			double depositoInicial = scan.nextDouble();
			conta1 = new ContaBancaria(nome, conta, depositoInicial);
		} else {
			conta1 = new ContaBancaria(nome, conta);
		}
		
		
		System.out.println("Conta atualizada:");
		System.out.println(conta1);
		System.out.println();
		
		System.out.print("Entre com o valor do depósito: ");
		conta1.depositar(scan.nextDouble());
		System.out.println(conta1);
		System.out.println();
		
		System.out.print("Entre com o valor do saque: ");
		conta1.sacar(scan.nextDouble());
		System.out.println(conta1);
		
		
		scan.close();
	}

}
