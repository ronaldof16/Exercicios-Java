package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Digite o nome: ");
		employee.nome = scan.nextLine();
		System.out.print("Digite o salário bruto: ");
		employee.salarioBruto = scan.nextDouble();
		System.out.print("Digite o imposto: ");
		employee.imposto = scan.nextDouble();
		
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.print("Qual a porcentagem de aumento no salário? ");
		double porcentagem = scan.nextDouble();
		employee.aumentarSalario(porcentagem);
		System.out.println();
		System.out.println("Dados atualizados: " + employee);
		
		
		
		scan.close();
	}

}
