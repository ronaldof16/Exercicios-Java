package logica09;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		float valorDepositado, juros, valorComJuros;
		
		System.out.print("Digite o valor depositado: ");
		valorDepositado = scan.nextFloat();
		
		juros = valorDepositado * 0.0007f;
		
		valorComJuros = valorDepositado + juros;
		
		System.out.println("O valor total com os rendimentos é: R$ " + String.format("%.2f",  valorComJuros));
		
		scan.close();
	}

}
