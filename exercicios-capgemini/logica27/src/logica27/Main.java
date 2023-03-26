package logica27;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		float totalDesconto = 0;
		float totalPago = 0;
		System.out.print("Digite o preço do veículo: ");
		float preco = scan.nextFloat();
		
		
		while(preco != 0) {
			
			char combustivel;
			float desconto = 0;
			
			System.out.print("Digite o combustível do ceículo: G - gasolina / D - diesel / A - álcool: ");
			combustivel = scan.next().charAt(0);
			
			if(combustivel == 'G') {
				desconto = preco * (21 / 100.0f);
				preco = preco - desconto;
				System.out.println("Valor do desconto: " + String.format("%.2f", desconto));
				System.out.println("Preço final do veículo: " + String.format("%.2f", preco));
			} else if(combustivel == 'A') {
				desconto = preco * (25 / 100.0f);
				preco = preco - desconto;
				System.out.println("Valor do desconto: " + String.format("%.2f", desconto));
				System.out.println("Preço final do veículo: " + String.format("%.2f", preco));
			} else if(combustivel == 'D') {
				desconto = preco * (14 / 100.0f);
				preco = preco - desconto;
				System.out.println("Valor do desconto: " + String.format("%.2f", desconto));
				System.out.println("Preço final do veículo: " + String.format("%.2f", preco));
			} else {
				System.out.println("Tipo de combustível inválido!");
			}
			
			totalDesconto = totalDesconto + desconto;
			totalPago  = totalPago + preco;
			
			
			System.out.print("Digite o preço do veículo: ");
			preco = scan.nextFloat();
			
		}
		
		System.out.println("Total de  descontos: " + String.format("%.2f", totalDesconto));
		System.out.println("Total pago pelos clientes: " + String.format("%.2f", totalPago));
		
		scan.close();

	}

}
