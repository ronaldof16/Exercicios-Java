package objeto02;

public class ContaCorrente {
	
	private String nome;
	private int conta;
	private float saldo;
	
	public ContaCorrente(String nome, int conta, float saldo) {
		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;	
	}
	
	public void deposito(float valorDeposito) {
		saldo = saldo + valorDeposito;
		return saldo;
	}
	
	public void saque(float valorSaque) {
		return saldo + valorSaque;
	}
	
	
	
	

}
