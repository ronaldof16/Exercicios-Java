package logica14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int x = scan.nextInt();
		System.out.print("Digite o segundo número: ");
		int y = scan.nextInt();
		
		if(x > y) {
			System.out.println(x + "é o maior!");
		} else {
			System.out.println(y + " é o maior!");
		}
		
		scan.close();

	}

}
