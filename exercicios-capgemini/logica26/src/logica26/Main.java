package logica26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println("um");
			break;
			
		case 2:
			System.out.println("dois");
			break;
			
		case 3:
			System.out.println("três");
			break;
			
		case 4:
			System.out.println("quatro");
			break;
			
		case 5:
			System.out.println("cinco");
			break;
			
		default:
			System.out.println("número inválido!");
		}
		
		scan.close();

	}

}
