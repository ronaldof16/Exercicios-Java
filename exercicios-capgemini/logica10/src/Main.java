import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		float valorCompra, valorPrestacao;
		int quantidadePrestacao;
		
		System.out.print("Digite o valor da compra: ");
		valorCompra = scan.nextFloat();
		
		System.out.print("Digite a quantidade de prestações desejada: ");
		quantidadePrestacao = scan.nextInt();
		
		valorPrestacao = valorCompra / quantidadePrestacao;
		
		System.out.println("O valor das prestações ficou em: " + String.format("%.2f", valorPrestacao));
		
		scan.close();
		

	}

}
