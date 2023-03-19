package logica05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String nome;
		float nota1, nota2, nota3;
		float media;
		
		System.out.print("Digite o nome do aluno: ");
		nome = scan.nextLine();
		System.out.print("Digite a primeira nota do aluno: ");
		nota1 = scan.nextFloat();
		System.out.print("Digite a segunda nota do aluno: ");
		nota2 = scan.nextFloat();
		System.out.print("Digite a terceira nota do aluno: ");
		nota3 = scan.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Média do aluno : " + String.format("%.1f", media));
		
		scan.close();

	}

}
