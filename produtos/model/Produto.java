package produtos.model;

public abstract class  Produto {
	
	private long idProduto;
	private String nomeProduto;
	 
	private String categoria;
	private double preco;
	private int estoque;	
	
	
	
	public Produto(long idProduto, String nomeProduto,  String categoria, double preco, int estoque) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		 
		this.categoria = categoria;
		this.preco = preco;
		this.estoque = estoque;
	}

	

	public long getIdProduto() {
		return idProduto;
	}



	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}



	public String getNomeProduto() {
		return nomeProduto;
	}



	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}



	 



	 


	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public int getEstoque() {
		return estoque;
	}



	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}



	public void visualizar() {

		}
		
		 
} 

