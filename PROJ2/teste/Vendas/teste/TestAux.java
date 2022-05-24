package Vendas.teste;

import vendas.controller.ClienteControllerDB;
import vendas.model.Cliente;
import vendas.model.Produto;
import vendasControllerDB.ProdutocontrollerDB;

public class TestAux {
	public static Cliente getCliente() throws Exception {
		ClienteControllerDB clienteController = new ClienteControllerDB();
		
		//insere um cliente e retorna ele com o id
		Cliente cliente = new Cliente();
		cliente.setNome("CLIENTE TESTE");
		cliente.setCpf("1263456789");
		return clienteController.inserirCliente(cliente);
	}
	
	public static Produto getProduto() throws Exception {
		ProdutocontrollerDB produtoController = new ProdutocontrollerDB();
		
		//insere um produto e retorna ele com o id
		Produto produto = new Produto();
		produto.setNome("PRODUTO TESTE");
		produto.setPreco(10.00);
		return produtoController.inserirProduto(produto);
	}
}
