package exrcicio12;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = scan.nextInt();
		double[] vet = new double[n];
		double somaElementos = 0;
		
		for(int i =0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = scan.nextDouble();
			somaElementos += vet[i];
		}
		
		double media = somaElementos / n;
		
		System.out.println();
		System.out.println("MEDIA DO VETOR = " + String.format("%.3f", media));
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for(int i = 0; i < n; i++) {
			if(vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		
		scan.close();
	}

}
