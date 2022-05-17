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

		// solicita o nome
		// se o pedido nao for novo, exibe o nome anterior
//		System.out.print("Informe o nome");
//		if (!isNew) {
//			System.out.print(" [nome anterior = " + pedido.getNome() + "]");
//		}
//		System.out.println(":");
		// se o pedido for novo, passa qualquer valor
		// se o pedido nao for novo, passa o novo valor somente
		// se o valor capturado nao for vazio ""
		// funcao trim remove os espaços do final da string
//		String nome = sc.nextLine();
//		if (isNew || (!isNew && !nome.trim().equals(""))) {
//			pedido.setNome(nome);
//		}

	//	System.out.println();

		// solicita o cpf
		// se o  nao for novo, exibe o cpf anterior
//		System.out.print("Informe o cpf");
//		if (!isNew) {
//			System.out.print(" [cpf anterior = " + pedido.getCpf() + "]");
//		}
//		System.out.println(":");
//		cliente.setCpf(sc.nextLine());
//
//		return cliente;
//	}
//
//	@SuppressWarnings("unused")
////	public void exibirLista(Collection<Pedido> pedidos) {
////			exibirPedido(pedidos);
//		}
//	}

	public void exibirPedido(Collection<Pedido> pedidos) {
		System.out.println(pedidos);
	}

}
