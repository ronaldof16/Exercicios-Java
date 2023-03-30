package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.print("Digite o nome: ");
		estudante.nome = scan.nextLine();
		System.out.println("Digite as notas: ");
		estudante.nota1 = scan.nextDouble();
		estudante.nota2 = scan.nextDouble();
		estudante.nota3 = scan.nextDouble();
		
		System.out.println("Nota Final = " + String.format("%.2f", estudante.calcularNotaFinal()));
		
		if(estudante.calcularNotaFinal() >= 60.0) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
			System.out.println("Faltou " + String.format("%.2f", estudante.calcularDiferenca()) + " pontos");
		}
		
		scan.close();
	}

}
