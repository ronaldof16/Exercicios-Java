package logica21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char continuar = 'S';
		int totalAptos = 0;
		int totalInaptos = 0;
		
		while(continuar == 'S' || continuar == 's') {
			
			System.out.print("Digite o nome da pessoa: ");
			String nome = scan.nextLine();
			System.out.print("Digite o sexo da pessoa: M - masculino / F - feminino: ");
			char sexo = scan.next().charAt(0);
			System.out.print("Digite a idade da pessoa: ");
			int idade = scan.nextInt();
			System.out.print("Digite como está a saúde da pessoa: S - ok / N - com problemas de saúde: ");
			char saude = scan.next().charAt(0);
			
			if(sexo == 'M' && idade > 17 && saude == 'S') {
				totalAptos++;
				System.out.println(nome + " está apto(a)!");
			} else {
				totalInaptos++;
				System.out.println(nome + " está inapto(a)!");
			}
			
			System.out.print("Deseja continuar? ");
			continuar = scan.next().charAt(0);
			
			scan.nextLine();
			
		}
		
		System.out.println(totalAptos + " é o total de pessoas aptas para o serviço militar obrigatório!");
		System.out.println(totalInaptos + " é o total de pessoas que não estão aptas para o serviço militar obrigatório!");
		
		scan.close();
	}

}
