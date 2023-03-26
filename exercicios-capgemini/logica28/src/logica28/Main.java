package logica28;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String nomeFuncionario;
		float salario;
		float salarioMinimo;
		float aumentoFolha = 0;
		
		System.out.print("Digite o valor do salário mínimo: ");
		salarioMinimo = scan.nextFloat();
		
		scan.nextLine();
		
		for(int i = 0; i < 584; i++) {
			
			float reajuste;
			float salarioReajustado;
			
			System.out.print("Digite o nome do funcionário: ");
			nomeFuncionario = scan.nextLine();
			System.out.print("Digite seu salário: ");
			salario = scan.nextFloat();
			
			if(salario < (3 * salarioMinimo)) {
				reajuste = salario * (50 / 100.0f);
			} else if(salario >= (3 * salarioMinimo) && salario <= (10 * salarioMinimo)) {
				reajuste = salario * (20 / 100.0f);
			} else if(salario > (10 * salarioMinimo) && salario <= (20 * salarioMinimo)) {
				reajuste = salario * (15 / 100.0f);
			} else {
				reajuste = salario * (10 / 100.0f);
			}
			
			salarioReajustado = salario + reajuste;
			aumentoFolha = aumentoFolha + reajuste;
			
			System.out.println("Nome do funcionário: " + nomeFuncionario);
			System.out.println("Valor do reajuste: R$ " + String.format("%.2f", reajuste));
			System.out.println("Novo salário: R$ " + String.format("%.2f", salarioReajustado));
			
			scan.nextLine();
		}
		
		System.out.println("A empresa vai aumentar sua folha de pagamento em: R$ " + aumentoFolha + " reais!");
		
		scan.close();

	}

}
