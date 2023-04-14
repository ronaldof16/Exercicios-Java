package exercicio07;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scan.nextInt();
		double[] vet = new double[n];
		double soma = 0.0;
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = scan.nextDouble();
			soma += vet[i];
		}
		
		System.out.print("VALORES = ");
		for(int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
		
		double media = soma / n;
		
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + media);
		
		scan.close();
	}

}
