package exercicio06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos números vai digitar? ");
		int n = scan.nextInt();
		int[] vect = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = scan.nextInt();
		}
		
		System.out.println("Números negativos: ");
		
		for(int i = 0; i < n; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		
		scan.close();
	}

}
