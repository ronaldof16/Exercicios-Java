package objeto08;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = scan.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		double somaAltura = 0;
		int menor16 = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			nome[i] = scan.next();
			System.out.print("Idade: ");
			idade[i] = scan.nextInt();
			System.out.print("Altura: ");
			altura[i] = scan.nextDouble();
			somaAltura += altura[i];
			
			if(idade[i] < 16) {
				menor16 += 1;
			}
		}
		
		double mediaAltura = somaAltura / n;
		//System.out.println(menor16);
		double porcentagemMenor16 = menor16 / n * 100;
		
		System.out.println("Altura média: " + String.format("%.2f", mediaAltura));
		System.out.println("Pessoas com menos de 16 anos: " + porcentagemMenor16 + "%");
		
		for(int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		scan.close();
	}

}
