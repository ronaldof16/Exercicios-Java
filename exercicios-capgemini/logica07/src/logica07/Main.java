package logica07;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		float tempCelsius;
		
		System.out.print("Digite a temperatura em graus Celsius: ");
		tempCelsius = scan.nextFloat();
		
		float tempFahrenheit = (9 * tempCelsius + 160) / 5;
		
		System.out.println("A temperatura em graus Fahrenheit é: " + tempFahrenheit);
		
		scan.close();

	}

}
