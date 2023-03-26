package logica30;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int a = scan.nextInt();
		System.out.print("Digite o segundo número: ");
		int b = scan.nextInt();
		System.out.print("Digite o terceiro número: ");
		int c = scan.nextInt();
		
		if(a > b && b > c) {
			System.out.println(a + " , " + b + " , " + c);
		} else if(c > b && b > a) {
			System.out.println(c + " , " + b + " , " + a);
		} else if(a > c && c > b) {
			System.out.println(a + " , " + c + " , " + b);
		} else if(b > a && a > c) {
			System.out.println(b + " , " + a + " , " + c);
		} else if(c > a && a > b) {
			System.out.println(c + " , " + a + " , " + b);
		} else if(b > c && c > a) {
			System.out.println(b + " , " + c + " , " + a);
		} else {
			System.out.println("Os números náo podem ser iguais!");
		}
		
		scan.close();
	}

}
