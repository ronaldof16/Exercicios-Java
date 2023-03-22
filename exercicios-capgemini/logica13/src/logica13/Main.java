package logica13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int x = scan.nextInt();
		
		if(x > 10) {
			System.out.println( "O número digitado é maior que 10!");
		} else {
			System.out.println("O número digitado é menor que 10!");
		}
		
		scan.close();

	}

}
