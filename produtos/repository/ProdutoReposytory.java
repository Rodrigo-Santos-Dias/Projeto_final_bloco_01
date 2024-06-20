package produtos.repository;
import produtos.model.Produto;
public interface ProdutoReposytory {
    public void procurarPorId(long id);
    public void listarTodos();
    public void cadastrar(Produto produto);
    public void atualizar(Produto produto);
    public void deletar(long id);
    
    public void atualizarEstoque(long id, int estoque);
    public void listarPorCategoria(String categoria);
}
