package Controler;

import java.util.Collection;
import java.util.HashMap;

import Model.Produto;

public class ProdutoController {
	
	
	private HashMap<Integer, Produto> produtos = new HashMap<>();
	
	public void atualizarProduto(Produto produto) {
			produtos.put(produto.getId(),produto);
	}
	
	public void excluirProduto(int id) {
		produtos.remove(id);
	}
	
	public Collection<Produto> listaProdutos() {
		return produtos.values();
	}
	public Produto carregarProduto(int id) {
		return produtos.get(id);
	}
	public void inserirProduto(Produto produto) {
		produtos.put(produto.getId(), produto);
	}

	public void mostrarProdutoConsole(Collection<Produto> listaProdutos) {
		return;
		
	}
}
