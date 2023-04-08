package objeto03;

public class BombaCombustivel {
	
	private char tipo;
	private float valorLitro;
	private float quantidadeBomba;
	
	public BombaCombustivel(char tipo, float valorLitro, float quantidadeBomba) {
		this.tipo = tipo;
		this.valorLitro = valorLitro;
		this.quantidadeBomba = quantidadeBomba;
	}
	
	public char getTipo() {
		return tipo;
	}
	
	public float getValorLitro() {
		return valorLitro;
	}
	
	public float getQuantidadeBomba() {
		return quantidadeBomba;
	}
	
	public void alterarTipo(char tipo) {
		this.tipo = tipo;
	}
	
	public void alterarValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	
	public void alterarQuantidadeBomba(float quantidadeBomba) {
		this.quantidadeBomba = quantidadeBomba;
	}
	
	public float abastecerPorValor(float valor) {
		float quantidadeAbastecida = valor / valorLitro;
		quantidadeBomba += quantidadeAbastecida; 
		return quantidadeAbastecida;
		
	}	
	
	public float abastecerPorLitro(float quantidadeLitro) {
		float valorPago = quantidadeLitro * valorLitro;
		quantidadeBomba += quantidadeLitro;
		return valorPago; 
	}
	
}
