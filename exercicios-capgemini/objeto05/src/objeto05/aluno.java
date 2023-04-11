package objeto05;

public class aluno {
	
	private int matricula;
	private String nome;
	private float notaProva1, notaProva2, notaTrabalho;
	
	public aluno(int matricula, String nome, float notaProva1, float notaProva2, float notaTrabalho) {
		this.matricula = matricula;
		this.nome = nome;
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho = notaTrabalho;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNotaProva1() {
		return notaProva1;
	}

	public void setNotaProva1(float notaProva1) {
		this.notaProva1 = notaProva1;
	}

	public float getNotaProva2() {
		return notaProva2;
	}

	public void setNotaProva2(float notaProva2) {
		this.notaProva2 = notaProva2;
	}

	public float getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(float notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
	public float media() {
		return ((notaProva1 + notaProva2) * 2.5f + (notaTrabalho * 2.0f)) / 7;
	}
	
	public float calcularFinal() {
		if(media() >= 7) {
			return 0;
		} else {
			return 7.0f - media();
		}
	}
	

}
