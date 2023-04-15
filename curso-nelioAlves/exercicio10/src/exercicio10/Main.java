package exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scan.nextInt();
		double[] vet = new double[n];
		double maior = vet[0];
		int posicaoMaior = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = scan.nextDouble();
			
			if(vet[i] > maior) {
				maior = vet[i];
				posicaoMaior = i;
			}
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR =" + posicaoMaior);
		
		
		scan.close();
	}

}
