package objeto01;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private Date dataNascimento;
	private float altura;
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public Date getdataNascimento() {
		return dataNascimento;
	}
	
	public void setdataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public float getaltura() {
		return altura;
	}
	
	public void setaltura(float altura) {
		this.altura = altura;
	}
	
	
	

}
