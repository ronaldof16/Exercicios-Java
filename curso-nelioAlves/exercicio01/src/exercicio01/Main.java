package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.print("Digite a altura do retangulo: ");
		ret.altura = scan.nextDouble();
		System.out.print("Digite a largura do retangulo: ");
		ret.largura = scan.nextDouble();
		
		System.out.println("Area = " + String.format("%.2f", ret.area()));
		System.out.println("Perímetro = " + String.format("%.2f", ret.perimetro()));
		System.out.println("Diagonal = " + String.format("%.2f", ret.diagonal()));
		
		scan.close();
	}

}
