package Controler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import Model.Pedido;

public class PedidoController {

	//ArrayList<Pedido> pedido = new ArrayList<Pedido>();
	private HashMap<Integer, Pedido> pedido = new HashMap<>();

	public void atualizarPedido(Pedido pedido) {
		pedido.put(pedido, getId(), pedido);
	}

	private Object getId() {
		return null;
	}

	public void excluirPedido(int id) {
		pedido.remove(id);
	}

	public ArrayList<Pedido> listaPedido(Pedido listaPedido){
		return listaPedido(listaPedido);
}
	public Pedido carregarPedido(int id) {
		return pedido.get(id);
	}

	public void inserirPedido(Pedido pedido) {
		pedido.put(pedido.getId(), pedido);
	}
	
//	public void mostrarProdutosConsole(ArrayList<Pedido> listaPedido) {
//		return;
//	}

	public void mostrarProdutoConsole(Collection<Pedido> listaPedido) {
		return;
	}
}
