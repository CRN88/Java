package vendas.controller;

import java.util.Collection;
import java.util.HashMap;

import vendas.model.Produto;

public class ProdutoController {
	private HashMap<Integer, Produto> produtos = new HashMap<>();

	public void inserProduto(Produto produto) throws Exception {
		if (produtos.containsKey(produto.getId())) {
			throw new Exception("Já existe um cliente com esse código.");
		}
		if (produto.getNome().trim().equals("")) {
			throw new Exception("Não é possível inserir clientes sem nome.");
		}

		produtos.put(produto.getId(), produto);

	}

	public HashMap<Integer, Produto> getProduto() {
		return produtos;
	}

	public void setProduto(HashMap<Integer, Produto> produto) {
		this.produtos = produto;
	}

	public ProdutoController() {
		super();
	}

	public void inserirProduto(Produto produto) {
		produtos.put(produto.getId(), produto);
	}

	// produtos.put(produto.getId(), produto);

	public void atualizarProduto(Produto produto) {
		produtos.replace(produto.getId(), produto);
	}

	public void exibirProduto(Produto produto) {

	}

	public void excluirProduto(int id) {
		produtos.remove(id);
	}

	public Collection<Produto> listarProduto() {
		return produtos.values();
	}

	public Produto carregarCliente(int id) {
		return produtos.get(id);
	}

	public void replace(int id, Produto produto) {

	}

	public void put(int id, Produto produto) {
	}

}
