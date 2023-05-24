package entities;

public class PessoaFisica extends Pessoa {
	
	private Double healthExpenditures;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double taxesPaid() {
		double tax;
		if(getAnualIncome() < 20000.0) {
			tax = 0.15 * getAnualIncome();
		} else {
			tax = 0.25 * getAnualIncome();
		}
		
		return tax - (healthExpenditures / 2);
	}

}
