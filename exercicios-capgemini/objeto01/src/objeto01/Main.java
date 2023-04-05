package objeto01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Digite o nome: ");
		pessoa.setnome(scan.nextLine());
		System.out.print("Digite o ano de nascimento: ");
		pessoa.setanoNascimento(scan.nextInt());
		System.out.print("Digite o ano atual: ");
		pessoa.setanoAtual(scan.nextInt());
		System.out.print("Digite a altura: ");
		pessoa.setaltura(scan.nextFloat());
		
		pessoa.imprimirDados();
		System.out.println("A idade é: " + pessoa.calcularIdade());
		
		scan.close();
	}

}
