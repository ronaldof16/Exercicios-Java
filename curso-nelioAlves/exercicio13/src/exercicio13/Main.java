package exercicio13;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = scan.nextInt();
		int[] vet = new int[n];
		double somaPares = 0;
		int quantidadePares = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = scan.nextInt();
			
			if(vet[i] % 2 == 0) {
				somaPares += vet[i];
				quantidadePares += 1;
			}
		}
		
		double mediaPares = somaPares / quantidadePares;
		
		if(quantidadePares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			System.out.println("MEDIA DOS PARES = " + String.format("%.1f", mediaPares));
		}
		
		
		scan.close();
	}

}
