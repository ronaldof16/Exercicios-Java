package exercicio02;

public class Employee {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
		double aumento = salarioBruto * (porcentagem / 100);
		salarioBruto += aumento;
	}
	
	public String toString() {
		return nome + " , $ " + String.format("%.2f", salarioLiquido());
	}
}
