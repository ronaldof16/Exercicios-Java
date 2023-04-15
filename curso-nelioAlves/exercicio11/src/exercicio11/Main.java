package exercicio11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = scan.nextInt();
		int[] vetA = new int[n];
		int[] vetB = new int[n];
		int[] vetC = new int[n];
		
		System.out.println("Digite os valores do vetor vetA: ");
		for(int i = 0; i < n; i++) {
			vetA [i] = scan.nextInt();
		}
		
		System.out.println("Digite os valores do vetor vetB: ");
		for(int i = 0; i < n; i++) {
			vetB [i] = scan.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0; i < n; i++) {
			vetC[i] = vetA[i] + vetB[i];
			System.out.println(vetC[i]);
		}
		
		
		scan.close();
	}

}
