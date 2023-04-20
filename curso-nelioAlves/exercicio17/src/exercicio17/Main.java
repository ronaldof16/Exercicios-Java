package exercicio17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos quartos vão ser alugados? ");
		int n = scan.nextInt();
		
		Quarto[] quarto = new Quarto[10];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Aluguel #" + (i +1));
			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Email: ");
			String email = scan.nextLine();
			System.out.print("Quarto: ");
			int room = scan.nextInt();
			quarto[room] = new Quarto(nome, email);
			System.out.println();
		}
		
		System.out.println("Quartos alugados: ");
		
		for(int i = 0; i < 10; i++) {
			if(quarto[i] != null) {
				System.out.println(i + ": " + quarto[i]);
			}
		}
		
		
		scan.close();
	}

}
