package objeto14;

public class Fatura {
	
	private String numero, descricao;
	private int quantidadeComprada;
	private double precoItem;
	
	public Fatura(String numero, String descricao, int quantidadeComprada, double precoItem) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeComprada = quantidadeComprada;
		setPrecoItem(precoItem);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		if(precoItem < 0) {
			this.precoItem = 0;
		} else {
			this.precoItem = precoItem;
		}
	}
	
	public double getTotalFatura() {
		return quantidadeComprada * precoItem;
	}
	
}
