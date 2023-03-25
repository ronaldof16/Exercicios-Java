package logica23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número :");
		numero = scan.nextInt();
		
		if(numero > 80) {
			System.out.println("O número é maior que 80!");
		} else if(numero < 25) {
			System.out.println("O número é menor que 25!");
		} else if(numero == 40) {
			System.out.println("O número é 40!");
		}
		
		scan.close();

	}

}
