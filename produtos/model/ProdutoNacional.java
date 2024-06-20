package produtos.model;

public class ProdutoNacional extends Produto {
	private double impostoNacional;

    public ProdutoNacional(long id, String nomeProduto,String categoria, double preco, int estoque, double impostoNacional) {
    	super(id, nomeProduto, categoria, preco, estoque);
        this.impostoNacional = impostoNacional;
         ;
    }

    public double getImpostoNacional() {
        return impostoNacional;
    }

    public void setImpostoNacional(double impostoNacional) {
        this.impostoNacional = impostoNacional;
    }
    
    
    public double calcularPrecoFinal() {
        return getPreco() + (getPreco() * (impostoNacional / 100));
    }

    public String descricaoDetalhada() {
        return "Produto Nacional [ID=" + getIdProduto() + ", Nome=" + getNomeProduto() + ", Categoria=" + getCategoria() + 
                ", Preço=" + getPreco() + ", Estoque=" + getEstoque() + ", Imposto Nacional=" + impostoNacional + 
                 ", Preço Final=" + calcularPrecoFinal() + "]";
    }
    
    
    @Override
    public String toString() {
        return super.toString() + ", ProdutoNacional [impostoNacional=" + impostoNacional + "]";
    }
}
