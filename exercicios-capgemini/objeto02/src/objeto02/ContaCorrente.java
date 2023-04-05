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
		saldo += valorDeposito;
		
	}
	
	public void saque(float valorSaque) {
		saldo -= valorSaque;
	}
	
	
	
	

}
