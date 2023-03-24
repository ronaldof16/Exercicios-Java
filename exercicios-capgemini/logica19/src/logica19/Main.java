package logica19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int totalHomens = 0;
		int totalMulheres = 0;
		
		for(int i = 0; i < 3; i++) {
			
			System.out.print("Digite o nome da pessoa: ");
			String nome = scan.nextLine();
			System.out.print("Digite o sexo da pessoa, M - masculino / F - feminino: ");
			char sexo = scan.next().charAt(0);
			
			if(sexo == 'M' || sexo == 'm') {
				totalHomens++;
				System.out.println(nome + " é homem!");
			} else if(sexo == 'F' || sexo == 'f') {
				totalMulheres++;
				System.out.println(nome + " é mulher!");
			}
			
			scan.nextLine();
		}
		
		System.out.println("O total de homens é: " + totalHomens);
		System.out.println("O total de mulheres é: " + totalMulheres);
		
		scan.close();
	}

}
