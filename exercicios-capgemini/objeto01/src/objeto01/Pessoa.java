package objeto01;

public class Pessoa {
	
	 private String nome;
	 private int anoNascimento;
	 private int anoAtual;
	 float altura;
	
	
	  public String getnome() {
		  return nome; 
	  }
	  
	  public void setnome(String nome) {
		  this.nome = nome; 
	  }
	  
	  public int getanoNascimento() {
		  return anoNascimento; 
	  }
	  
	  public void setanoNascimento(int anoNascimento) {
		  this.anoNascimento = anoNascimento; 
	  }
	  
	  public int getanoAtual() {
		  return anoAtual;
	  }
	  
	  public void setanoAtual(int anoAtual) {
		  this.anoAtual = anoAtual;
	  }
	  
	  public float getaltura() {
		  return altura; 
	  }
	  
	  public void setaltura(float altura) {
		  this.altura = altura; 
	  }
	 
	
	  public void imprimirDados() {
		  System.out.println("Nome: " + nome);
		  System.out.println("Data de nascimento: " + anoNascimento);
		  System.out.println("Ano atual: " + anoAtual);
		  System.out.println("Altura: " + altura);
	  }
	  
	  public int calcularIdade() {
		  return anoAtual - anoNascimento;
	  }
	

}
