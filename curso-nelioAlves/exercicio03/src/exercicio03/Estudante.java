package exercicio03;

public class Estudante {
	
	public String nome;
	public double nota1, nota2, nota3;
	
	public double calcularNotaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double calcularDiferenca() {
		if(calcularNotaFinal() < 60.0) {
			return 60.0 - calcularNotaFinal();
		} else {
			return 0.0;
		}
	}
	
	

}
