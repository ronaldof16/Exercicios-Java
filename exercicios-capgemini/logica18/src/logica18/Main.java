package logica18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		for(int i = 0; i < 75; i++) {
			
			System.out.print("Digite o nome da pessoa: ");
			String nome = scan.nextLine();
			System.out.print("Digite a idade: ");
			int idade = scan.nextInt();
			
			if(idade >= 18) {
				System.out.println(nome + " é maior de idade!");
			} else {
				System.out.println(nome + " é menor de idade!");
			}
			
			scan.nextLine();
		}
		
		scan.close();

	}

}
