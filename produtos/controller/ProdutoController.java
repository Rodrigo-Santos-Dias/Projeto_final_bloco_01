package produtos.controller;
import produtos.model.Produto;
import produtos.repository.ProdutoReposytory; 
import java.util.ArrayList;
public class ProdutoController implements ProdutoReposytory {
	 private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	    private long idProduto = 0;

	    @Override
	    public void procurarPorId(long id) {
	        Produto produto = buscarNaColecao(id);
	        if (produto != null) {
	            System.out.println(produto);
	        } else {
	            System.out.println("\nO produto com ID " + id + " não foi encontrado!");
	        }
	    }

	    @Override
	    public void listarTodos() {
	        for (Produto produto : listaProdutos) {
	            System.out.println(produto);
	        }
	    }

	    @Override
	    public void cadastrar(Produto produto) {
	        produto.setIdProduto(gerarId());
	        listaProdutos.add(produto);
	        System.out.println("\nO produto com ID " + produto.getIdProduto() + " foi cadastrado com sucesso!");
	    }

	    @Override
	    public void atualizar(Produto produto) {
	        Produto produtoExistente = buscarNaColecao(produto.getIdProduto());
	        if (produtoExistente != null) {
	            listaProdutos.set(listaProdutos.indexOf(produtoExistente), produto);
	            System.out.println("\nO produto com ID " + produto.getIdProduto() + " foi atualizado com sucesso!");
	        } else {
	            System.out.println("\nO produto com ID " + produto.getIdProduto() + " não foi encontrado!");
	        }
	    }

	    @Override
	    public void deletar(long id) {
	        Produto produto = buscarNaColecao(id);
	        if (produto != null) {
	            listaProdutos.remove(produto);
	            System.out.println("\nO produto com ID " + id + " foi deletado com sucesso!");
	        } else {
	            System.out.println("\nO produto com ID " + id + " não foi encontrado!");
	        }
	    }

	    private long gerarId() {
	        return ++idProduto;
	    }

	    private Produto buscarNaColecao(long id) {
	        for (Produto produto : listaProdutos) {
	            if (produto.getIdProduto() == id) {
	                return produto;
	            }
	        }
	        return null;
	    }

		@Override
		public void atualizarEstoque(long id, int estoque) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void listarPorCategoria(String categoria) {
			// TODO Auto-generated method stub
			
		}
	}

