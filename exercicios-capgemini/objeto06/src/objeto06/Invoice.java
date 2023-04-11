package objeto06;

public class Invoice {
	
	private int numeroItem, quantidade;
	private String descricao;
	private float precoItem;
	
	public Invoice(int numeroItem, int quantidade, String descricao, float precoItem) {
		this.numeroItem = numeroItem;
		setQuantidade(quantidade);
		this.descricao = descricao;
		setPrecoItem(precoItem);
	}

	public int getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if(quantidade < 0) {
			this.quantidade = 0;
		} else {
			this.quantidade = quantidade;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(float precoItem) {
		if(precoItem < 0) {
			this.precoItem = 0;
		} else {
			this.precoItem = precoItem;
		}
	}
	
	public double getInvoiceAmount() {
		return quantidade * precoItem;
	}
	
	public String toString() {
		return "O número do produto " + descricao + " é " + numeroItem + ", existem " + quantidade +  " no estoque, e custa " + 
				precoItem + " cada!";
				
	}
	
	

}
