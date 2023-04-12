package objeto14;

import java.util.Locale;

public class FaturaTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Fatura fatura1 = new Fatura("1", "mouse", 15, 15.69);
		
		System.out.println("Número do item: " + fatura1.getNumero());
		System.out.println("Descrição do item: " + fatura1.getDescricao());
		System.out.println("Quantidade comprada: " + fatura1.getQuantidadeComprada());
		System.out.println("Valor do item: R$ " + fatura1.getPrecoItem());
		System.out.println("Valor total da fatura é: R$ " + fatura1.getTotalFatura());

	}

}
