package exercicio16;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = scan.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		double maiorAltura = altura[0];
		double menorAltura = altura[0];
		double somaAlturaMulheres = 0;
		int quantidadeHomens = 0;
		int quantidadeMulheres = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			altura[i] = scan.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			genero[i] = scan.next().charAt(0);
			
			if(genero[i] == 'F') {
				somaAlturaMulheres += altura[i];
				quantidadeMulheres += 1;
			} else if(genero[i] == 'M') {
				quantidadeHomens += 1;
			}
		}
		
		for (int i = 0; i < n; i++) {
	        if (altura[i] > maiorAltura) {
	            maiorAltura = altura[i];
	            menorAltura = altura[0];
	        } else if(altura[i] < menorAltura) {
	        	menorAltura = altura[i];
	        }
	        
	    }
		
		double mediaAlturaMulheres = somaAlturaMulheres / quantidadeMulheres;
		
		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);;
		System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaAlturaMulheres));
		System.out.println("Numero de homens = " + quantidadeHomens);
		
		scan.close();
	}

}
