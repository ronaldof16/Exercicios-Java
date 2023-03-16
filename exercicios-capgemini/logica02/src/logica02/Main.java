package logica02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x;
		int y;
		
		
		System.out.print("Digite o primeiro número: ");
		x = scan.nextInt();
		System.out.print("Digite o segundo número: ");
		y = scan.nextInt();
		
		int soma = x + y;
		int subtracao = x - y;
		double divisao = x / y;
		int multiplicacao = x * y;
		
		
		
		System.out.println("A soma entre os números é: " + soma);
		System.out.println("A subtração de  x com y é: " + subtracao);
		System.out.println("A divisão de x com y é: " + String.format("%.2f", divisao));
		System.out.println("A multiplicção de x com y é: " + multiplicacao);
		
		scan.close();

	}

}

