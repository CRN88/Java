package vendas.ui;

import java.util.Collection;
import java.util.Scanner;

import vendas.app.VendasApp;
import vendas.model.Pedido;
import vendas.model.Produto;

public class PedidoPrinter {
	public Pedido capturarPedido(Pedido pedido) {
		// armazena o estado do cliente quando entrar no metodo
		boolean isNew = pedido.isNew();

		// faz referencia a scanner
		Scanner sc = VendasApp.getScanner();

		// se o pedido nao for novo exibe o codigo, senao exibe mensagem de novo
		// cliente
		if (!isNew) {
			System.out.println("Alterando codigo pedido: " + pedido.getId());
		} else {
			System.out.println("Inserindo novo pedido");
		}

		System.out.println();

		// se for um novo pedido, pergunta o codigo
		if (isNew) {
			System.out.println("Informe o código: ");
			pedido.setId(sc.nextInt());
			sc.nextLine();
		}
		return pedido;
		}
	public void exibirPedidos(Collection<Pedido>pedidos) {
		for (Pedido pedido : pedidos) {
			System.out.println(pedido.getId()+pedido.getValorTotal());
			for(Pedido p : pedidos) {
				System.out.println(p.getProdutos());
			}
		}
		
		
	}
	public void exibirPedido(Collection<Pedido> pedidos) {
		System.out.println(pedidos);
	}

}
