package produtos.model;

public class ProdutoImportado extends Produto {
	 private double taxaImportacao;
	 private String paisOrigem;

	    public ProdutoImportado(long id, String nomeProduto,  String categoria, double preco, int estoque, double taxaImportacao, String paisOrigem) {
	    	super(id, nomeProduto, categoria, preco, estoque);
	        this.taxaImportacao = taxaImportacao;
	        this.paisOrigem = paisOrigem;
	    }

	    public double getTaxaImportacao() {
	        return taxaImportacao;
	    }

	    public void setTaxaImportacao(double taxaImportacao) {
	        this.taxaImportacao = taxaImportacao;
	    }

	    public String getPaisOrigem() {
	        return paisOrigem;
	    }

	    public void setPaisOrigem(String paisOrigem) {
	        this.paisOrigem = paisOrigem;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", ProdutoImportado [taxaImportacao=" + taxaImportacao + ", paisOrigem=" + paisOrigem + "]";
	    }
}
