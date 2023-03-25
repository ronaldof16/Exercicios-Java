package logica24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char continuar = 'S';
		
		while(continuar == 'S' || continuar == 's') {
			
			System.out.print("Digite um número: ");
			int numero = scan.nextInt();
			
			if(numero > 0) {
				System.out.println("POSITIVO!");
			} else if(numero == 0) {
				System.out.println("ZERO!");
			} else {
				System.out.println("NEGATIVO!");
			}
			
			System.out.print("Deseja continuar? S - sim / N - não: ");
			continuar = scan.next().charAt(0);
			
			
		}
		
		scan.close();
	}

}
