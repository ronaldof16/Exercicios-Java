package logica03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a distancia percorrida: ");
		int distancia = scan.nextInt();
		System.out.println("Digite o total de combustível gasto: ");
		float combustivelGasto = scan.nextFloat();
		
		float consumoMedio = distancia / combustivelGasto;
		
		System.out.println("O consumo médio foi de " + consumoMedio + "km/l.");
		
		scan.close();

	}

}
