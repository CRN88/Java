package Vendas.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import vendas.controller.PedidoController;
import vendas.model.Pedido;
import vendas.model.Produto;
import vendasControllerDB.PedidoDB;

public class PedidoControllerTeste {

	/**
	 * Requisitos para executar esse teste
	 * Necessita um cliente e um produto
	 */
	@Test
	@DisplayName("Deve inserir um pedido")
	void inserePedido() throws Exception {
		//Novo pedido
		Pedido pedido = new Pedido();
		//busca o cliente da classe auxiliar.
		pedido.setCliente(TestAux.getCliente());
		//pega a data atual para inserir no pedido
		pedido.setDate(new Date(System.currentTimeMillis()));
		//pega o produto que esta na classe auxiliar.
		pedido.getProdutos().add(TestAux.getProduto());
		//usa o metodo auxiliar mas também pode ser feito na classe auxiliar
		//e ser usado nos testes.
		pedido.somar();
		
		new PedidoDB().inserirPedido(pedido);
		
		double total = 0;
		for (Produto produto : pedido.getProdutos()) 
			total += produto.getPreco();
		
		assertEquals(total, pedido.getValorTotal());
	}
	
//	@Test
//	@DisplayName("Deve excluir um pedido")
//	void excluir pedido() throws Exeption {
//		Pedido pedido = new Pedido();
//		//inserir e excluir pedido
//		pedido.setCliente(TestAux.getCliente());
//		pedido.setDate(new Date(System.currentTimeMillis()));
//		pedido.getProdutos().add(TestAux.getProduto());
//		return pedido.
//		
	
	}
//}
