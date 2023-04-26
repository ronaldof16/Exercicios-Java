package exrcicio18;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos funcionários vão ser registrados? ");
		int n = scan.nextInt();
		List<Funcionario> lista = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionário #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = scan.nextInt();
			
			while (hasId(lista, id)) {
				System.out.print("Id já cadastrado! Digite outro: ");
				id = scan.nextInt();
			}
			
			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Salário: ");
			double salario = scan.nextDouble();
			
			Funcionario func = new Funcionario(id, nome, salario);
			lista.add(func);
		}
		
		System.out.println("Digite o id do funcionário que vai receber aumento no salário: ");
		int idSalario = scan.nextInt();
		Integer pos = posicao(lista, idSalario);
		if(pos == null) {
			System.out.println("Este ID não existe!");
		} else {
			System.out.print("Digite a porcentagem do aumento: ");
			double porcentagem = scan.nextDouble();
			lista.get(pos).aumentarSalario(porcentagem);
		}
		
		System.out.println(lista);
		
		
		scan.close();
	}
	
	public static Integer posicao(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
				}
			}
		return null;
	}

	private static boolean hasId(List<Funcionario> lista, int id) {
		return false;
	}

}
