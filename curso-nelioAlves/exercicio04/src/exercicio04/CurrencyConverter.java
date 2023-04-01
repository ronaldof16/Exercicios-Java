package exercicio04;

public class CurrencyConverter {
	
	public double cotacaoDolar, valorDolar;
	public double valorIOF = 0.06;
	
	public double calcularValorReal() { 
		return cotacaoDolar * valorDolar * (1 + valorIOF);
	}
	
}
