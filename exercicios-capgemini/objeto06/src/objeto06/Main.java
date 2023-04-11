package objeto06;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Invoice produto = new Invoice(5, 10, "caneta", 1.29f);
		
		System.out.println(produto.getDescricao());
		System.out.println(produto.getNumeroItem());
		System.out.println(produto.getQuantidade());
		System.out.println(produto.getPrecoItem());
		System.out.println(String.format("%.2f", produto.getInvoiceAmount()));
		  
		System.out.println(produto);
		 
		
	}

}
