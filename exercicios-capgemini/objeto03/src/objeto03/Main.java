package objeto03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		BombaCombustivel bomba = new BombaCombustivel('G', 5.29f, 8.0f);
		
		System.out.print("Digite o valor a ser abastecido: ");
		bomba.abastecerPorValor(scan.nextFloat());
		System.out.println("Quantidade Atualizada: " + bomba.getQuantidadeBomba());
		System.out.println();
		System.out.print("Digite a quantidade a ser abastecida: ");
		bomba.abastecerPorLitro(scan.nextFloat());
		System.out.println("Quantidade Atualizada: " + bomba.getQuantidadeBomba());
		
		scan.close();
	}

}
