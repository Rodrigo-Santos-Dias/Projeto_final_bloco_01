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

    @Override
    public String toString() {
        return super.toString() + ", ProdutoNacional [impostoNacional=" + impostoNacional + "]";
    }
}
