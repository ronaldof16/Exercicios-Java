package exercicio05;

public class ContaBancaria {

	private String nome;
	private int conta;
	private double saldo;
	
	
	public ContaBancaria(String nome, int conta, double depositoInicial) {
		this.nome = nome;
		this.conta = conta;
		depositar(depositoInicial);
	}
	
	public ContaBancaria(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getConta() {
		return conta;
	}
	
	public double getSaldo( ) {
		return saldo;
	}
	
	public void sacar(double valorSaque) {
		saldo -= (valorSaque + 5.00);	
	}
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public String toString() {
		return "Conta " + conta + ", Titular: " + nome + ", saldo: " + saldo;
	}
	
	
}
