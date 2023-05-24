package entities;

public class PessoaJuridica extends Pessoa{
	
	private Integer employees;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double taxesPaid() {
		double tax;
		if(employees > 10) {
			tax = 0.14 * getAnualIncome();
		} else {
			tax = 0.16 * getAnualIncome();
		}
		
		return tax;
	}

}
