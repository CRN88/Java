package vendas.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

import vendas.model.Cliente;
import vendas.model.Pedido;
import vendas.model.Produto;

public class PedidoController {
	private HashMap<Integer, Pedido> pedidos = new HashMap();
	/**
	 * Recebe uma data no formado dd/mm/yyyy em String
	 * e retorna uma instacia de Date
	 * @param data
	 * @return
	 */
	private Collection<Pedido> pedido;
	public static Date stringToDate(String data) {
		try {
			return new SimpleDateFormat("dd/MM/yyyy").parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void setData(Date stringToDate) {		
	}
	public void setId(int j) {		
	}
	public void setCliente(Cliente carregarCliente) {		
	}

	public static Date stringToDate() {	
		return null;
	}

	public void inserirPedido(Pedido pedido) {
		pedido.put(pedido.getId(), pedido);
	}

	public void atualizarProduto(Pedido pedido) {
		pedido.replace(pedido.getId(), pedido);
	}

	public void exibirProduto(Produto produto) {
		System.out.println(produto);
	}

	public void excluirPedido(int id) {
		pedidos.remove(id);
	}

	public Collection<Pedido> listarPedido() {
		return pedidos.values();
	}

	public Pedido carregarPedido(int id) {
		return pedidos.get(id);
	}
	public char[] getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public char[] getData() {
		// TODO Auto-generated method stub
		return null;
	}

}
