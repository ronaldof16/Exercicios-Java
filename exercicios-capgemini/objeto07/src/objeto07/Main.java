package objeto07;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Funcionario func1 = new Funcionario("Ronaldo", "Fernando", 3200.0f);
		Funcionario func2 = new Funcionario("Niedja", "Lucena", 1.600f);
		
		System.out.println(func1);
		func1.calcularAumento();
		System.out.println(func1);
		System.out.println();
		
		System.out.println(func2);
		func2.calcularAumento();
		System.out.println(func2);
		
	}

}
