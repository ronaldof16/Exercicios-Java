package logica12;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		float custoFabrica, impostosAplicados, percentualDistribuidor, custoConsumidor;
		
		System.out.print("Digite o custo de fábirca do carro: ");
		custoFabrica = scan.nextFloat();
		
		impostosAplicados = custoFabrica * 0.45f;
		percentualDistribuidor = (custoFabrica + impostosAplicados) * 0.28f;
		custoConsumidor = custoFabrica + impostosAplicados + percentualDistribuidor;
		
		System.out.println("O custo do carro ao consumidor é de: " + String.format("%.2f", custoConsumidor));
		
		scan.close();

	}

}
