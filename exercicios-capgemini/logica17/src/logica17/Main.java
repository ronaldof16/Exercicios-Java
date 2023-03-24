package logica17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int quantidade = 0;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.print("Digite um número: ");
			int numero = scan.nextInt();
			
			if(numero >= 10 && numero <= 150) {
				quantidade = quantidade + 1;
			}
			
		}
		
		System.out.println("A quantidade de números no intervalo é: " + quantidade);
		
		scan.close();
	}

}
