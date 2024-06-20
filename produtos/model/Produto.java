package produtos.model;

public abstract class  Produto {
	
	private long idProuto;
	private String nomeProduto;
	 
	private String categoria;
	private double preco;
	private int estoque;	
	
	
	
	public Produto(long idProuto, String nomeProduto,  String categoria, double preco, int estoque) {
		this.idProuto = idProuto;
		this.nomeProduto = nomeProduto;
		 
		this.categoria = categoria;
		this.preco = preco;
		this.estoque = estoque;
	}

	

	public long getIdProuto() {
		return idProuto;
	}



	public void setIdProuto(long idProuto) {
		this.idProuto = idProuto;
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

