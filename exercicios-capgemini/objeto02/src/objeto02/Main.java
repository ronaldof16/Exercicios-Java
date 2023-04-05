package objeto02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		ContaCorrente primeira = new ContaCorrente("Ronaldo", 6298, 200.0f);
		
		System.out.println("Nome: " + primeira.getNome());
		System.out.println("Conta: " + primeira.getConta());
		System.out.println("Saldo: " + primeira.getSaldo());
		
		System.out.print("Digite o nome: ");
		primeira.setNome(scan.nextLine());
		System.out.println(primeira.getNome());
		System.out.print("Digite o valor do saque: ");
		primeira.sacar(scan.nextFloat());
		System.out.println(primeira.getSaldo());
		System.out.print("Digite o valor do depósito: ");
		primeira.depositar(scan.nextFloat());
		System.out.println(primeira.getSaldo());
		
		scan.close();
	}

}
