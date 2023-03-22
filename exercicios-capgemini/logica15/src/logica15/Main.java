package logica15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int x = scan.nextInt();
		
		if(x > 100 && x < 200) {
			System.out.println(x + " está no intervalo entre 100 e 200.");
		} else {
			System.out.println(x + " não está no intervalo entre 100 e 200.");
		}
		
		scan.close();

	}

}
