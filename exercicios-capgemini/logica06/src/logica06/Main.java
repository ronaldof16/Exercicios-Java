package logica06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A, B, variavelTemporaria;
		
		System.out.print("Digite o valor de A: ");
		A = scan.nextInt();
		System.out.print("Digite o valor de B: ");
		B = scan.nextInt();
		
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		
		variavelTemporaria = A;
		A = B;
		B = variavelTemporaria;
		
		System.out.println("O novo valor de A é:  " + A);
		System.out.println("O novo valor de B é: " + B);
		
		scan.close();
	}

}
