package objeto05;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		aluno aluno1 = new aluno(1418, "Ronaldo", 8.0f, 7.0f, 9.0f);
		
		System.out.println("A média do aluno foi: " + String.format("%.2f", aluno1.media()));
		System.out.println(aluno1.getNome() + " precisa de " + String.format("%.2f", aluno1.calcularFinal()) +
				" pontos para fazer a final!");
		
	}
}
