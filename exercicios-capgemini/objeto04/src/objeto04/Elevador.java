package objeto04;

public class Elevador {
	
	private int andarAtual, totalAndares, capacidade, pessoasNoElevador;
	
	public Elevador(int andarAtual, int totalAndares, int capacidade, int pessoasNoElevador) {
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
		this.pessoasNoElevador = pessoasNoElevador;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getPessoasNoElevador() {
		return pessoasNoElevador;
	}

	public void setPessoasNoElevador(int pessoasNoElevador) {
		this.pessoasNoElevador = pessoasNoElevador;
	}
	
	
	
}
