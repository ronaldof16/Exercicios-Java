package exercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = scan.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		int maiorIdade = idade[0];
		String maisVelho = nome[0];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			nome[i] = scan.next();
			System.out.print("Idade: ");
			idade[i] = scan.nextInt();
			
			if(idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				maisVelho = nome[i];
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + maisVelho);
		
		scan.close();
	}

}
