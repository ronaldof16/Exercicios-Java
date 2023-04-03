package exercicio05;

public class ContaBancaria {

	private String nome;
	private static int conta;
	private double depositoInicial, saldo;
	private static double taxa = 5.00;
	
	public ContaBancaria(String nome, int conta, double depositoInicial) {
		this.nome = nome;
		ContaBancaria.conta = conta;
		this.depositoInicial = depositoInicial;
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
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public double getDepositoInicial() {
		return depositoInicial;
	}
	
	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}
	
	public double sacar(double valorSaque) {
		saldo = depositoInicial - (valorSaque + taxa);
		return saldo;
	}
	
	public double depositar(double valorDeposito) {
		saldo = depositoInicial + valorDeposito;
		return saldo;
	}
	
	
}
