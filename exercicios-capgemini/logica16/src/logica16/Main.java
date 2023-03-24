package logica16;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String nome;
		float nota1, nota2, nota3, media;
		
		System.out.print("Digite o nome do aluno: ");
		nome = scan.nextLine();
		System.out.print("Digite a primeira nota do aluno: ");
		nota1 = scan.nextFloat();
		System.out.print("Digite a segunda nota do aluno: ");
		nota2 = scan.nextFloat();
		System.out.print("Digite a terceira nota do aluno: ");
		nota3 = scan.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= 7) {
			System.out.println(nome + " está aprovado com média " + String.format("%.2f", media) + "!");
		} else if(media > 5.1 && media < 6.9) {
			System.out.println(nome + " ficou em recuperação com média " + String.format("%.2f", media) + "!");
		} else {
			System.out.println(nome + " foi reprovado " + String.format("%.2f", media) + "!");
		}
		
		scan.close();

	}

}
