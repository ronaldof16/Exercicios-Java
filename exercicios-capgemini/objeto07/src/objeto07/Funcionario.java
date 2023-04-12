package objeto07;

public class Funcionario {
	
	private String primeiroNome, sobrenome;
	private float salarioMensal;
	
	public Funcionario(String primeiroNome, String sobrenome, float salarioMensal) {
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		setSalarioMensal(salarioMensal);
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(float salarioMensal) {
		if(salarioMensal < 0) {
			this.salarioMensal = 0.0f;
		} else {
			this.salarioMensal = salarioMensal;
		}
	}
	
	public float salarioAnual() {
		return salarioMensal * 12;
	}
	
	public void calcularAumento() {
		float aumento = salarioMensal * 0.1f;
		 salarioMensal += aumento;
	}
	
	public String toString() {
		return primeiroNome + " " + sobrenome + " tem um salário mensal de R$ " + salarioMensal + ", e um salário anual de R$ " + 
				String.format("%.2f", salarioAnual()); 
	}
	
	
}
