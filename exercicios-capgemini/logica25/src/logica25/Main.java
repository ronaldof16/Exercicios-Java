package logica25;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int x = scan.nextInt();
		System.out.print("Digite o primeiro número: ");
		int y = scan.nextInt();
		
		if( x == y) {
			System.out.println("Os números são iguais!");
		} else if(x > y) {
			System.out.println("Os números são diferentes e " + x + " é o maior!");
		} else {
			System.out.println("Os números são diferentes e " + y + " é o maior!");
		}
		
		scan.close();

	}

}
