package exercicio09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scan.nextInt();
		int[] vet = new int[n];
		int quantidadePares = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = scan.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		for(int i = 0; i < n; i++) {
			if(vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				quantidadePares += 1;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + quantidadePares);
		
		scan.close();
	}

}
