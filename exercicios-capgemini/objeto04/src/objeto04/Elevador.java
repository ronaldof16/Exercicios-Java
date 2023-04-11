package objeto04;

public class Elevador {
	
	private int andarAtual, totalAndares, capacidade, pessoasNoElevador;
	
	public Elevador(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
	}

	public int getAndarAtual() {
		return andarAtual;
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
	
	public void entrar() {
		if(pessoasNoElevador < capacidade) {
			pessoasNoElevador += 1;
		} else {
			System.out.println("O elevador já está lotado!");
		}
		
	}
	
	public void sair() {
		if(pessoasNoElevador > 0) {
			pessoasNoElevador -= 1;
		} else {
			System.out.println("O elevador está vazio!");
		}
		
	}
	
	public void subir() {
		if(andarAtual < totalAndares) {
			andarAtual += 1;
		} else {
			System.out.println("O elevador já está no último andar!");
		}
	}
	
	public void descer() {
		if(andarAtual > 0) {
			andarAtual -= 1;
		} else {
			System.out.println("O elevador está no térreo!");
		}
	}
	
}
