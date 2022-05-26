package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vendas.app.VendasApp;
import vendas.controller.ClienteController;
import vendas.controller.ClienteControllerDB;
import vendas.controller.PedidoController;
import vendas.controller.ProdutoController;
import vendas.model.Cliente;
import vendas.model.Pedido;
import vendas.model.Produto;
import vendas.ui.ClientePrinter;
import vendas.ui.PedidoPrinter;
import vendas.ui.ProdutoPrinter;
import vendasControllerDB.PedidoDB;
import vendasControllerDB.ProdutocontrollerDB;

public class MenuPrinter2 {
	// teste
	public void menuPrinter2(ClienteController clieContro, ProdutoController produContro,
			PedidoController pedidoController, PedidoController pediContro)

			throws Exception {

Scanner scan = VendasApp.getScanner();
		ClientePrinter printer = new ClientePrinter();
		ClienteControllerDB clisql = new ClienteControllerDB();
		ProdutoPrinter printerP = new ProdutoPrinter();
		ProdutocontrollerDB proMenu = new ProdutocontrollerDB();
		PedidoPrinter printerPedido = new PedidoPrinter();
		PedidoDB pediB = new PedidoDB();
		PedidoController pediC = new PedidoController();
		PedidoDB pedi = new PedidoDB();
		
		int opcao= 12;
		boolean respostaValida = true;
		int resposta = 1;
		while (respostaValida) {
			System.out.println("=========================");
			System.out.println("Cristiano devSistemas");
			System.out.println("=========================");
			System.out.println("Escolha a op�ao desejada");
			System.out.println("1- Adicionar cliente");
			System.out.println("2- Exibir clientes cadastrados");
			System.out.println("3- Atualizar cliente");
			System.out.println("4- Excluir cliente");
			System.out.println("5- Adicionar produto");
			System.out.println("6- Exibir produtos");
			System.out.println("7- Atualizar produto");
			System.out.println("8- Exicluir produto");
			System.out.println("9- adicionar pedido");
			System.out.println("10- Exibir pedido");
			System.out.println("11- Excluir pedido");
			System.out.println("12- Sair do programa");

			System.out.println("=========================");

			resposta = Integer.parseInt(scan.nextLine());

			switch (resposta) {
			case 1:
				// ADICIONAR CLIENTE
				clisql.inserirCliente(printer.capturarCliente(new Cliente()));
				System.out.println();

				break;

			case 2:
				System.out.println("Esses s�o os clientes cadastrados");
				clisql.listarClientes();

				break;

			case 3:
				// ATUALIZAR CLIENTE
				System.out.println("Atualizar cliente");
				clisql.listarClientes();
				System.out.println("Digite o id do cliente ");
				int l = Integer.parseInt(scan.nextLine());
				Cliente cliente = clisql.getCliente(l);
				System.out.println("Digite o cpf");
				String a = scan.nextLine();
				cliente.setCpf(a);
				System.out.println("Digite o nome");
				String b = scan.nextLine();
				cliente.setNome(b);
				clisql.atualizarCliente(cliente);
				clisql.listarClientes();

				break;
			case 4:
				// EXCLUIR CLIENTE
				System.out.println("Informe o Id do cliente que deseja excluir");
				int cli = Integer.parseInt(scan.nextLine());
				clisql.buscarCliente(clisql.getCliente(cli));
				clisql.excluirCliente(clisql.getCliente(cli));
				clisql.listarClientes();

				break;

			case 5:
				// ADICIONAR PRODUTO
				proMenu.inserirProduto(printerP.capturarProduto(new Produto()));

				break;

			case 6:
				// LISTAR PRODUTOS
				System.out.println("Esses sao os produtos");
				proMenu.buscarProdutos();
				break;

			case 7:
				// ATUALIZAR PRODUTO
				System.out.println("Atualizar produto");
				System.out.println("Digite o id do produto ");
				proMenu.buscarProdutos();
				int x = Integer.parseInt(scan.nextLine());
				Produto produto = proMenu.getProduto(x);
				System.out.println("Digite o preco");
				double j = Double.parseDouble(scan.nextLine());
				produto.setPreco(j);
				System.out.println("Digite o nome");
				String n = scan.nextLine();
				produto.setNome(n);
				proMenu.atualizarProduto(produto);

				break;

			case 8:
				// EXCLUIR PRODUTO //OK
				System.out.println("digite o Id do produto que deseja excluir");
				proMenu.buscarProdutos();
				int pro = Integer.parseInt(scan.nextLine());
				proMenu.excluirProduto(proMenu.getProduto(pro));
				proMenu.buscarProdutos();
				break;

			case 9:

				// ADD PEDIDO
				// proMenu.inserirProduto(printerP.capturarProduto(new Produto()));
				Pedido pedido = new Pedido();
				List<Produto> listaProPedidos = new ArrayList<>();
				System.out.println("");
				System.out.println("Esses s�o os clientes cadastrados");
				System.out.println("");
				clisql.listarClientes();
				System.out.println("Informe o id do cliente");
				System.out.println("");
				int idCliente = Integer.parseInt(scan.nextLine());
				Cliente objCliente = clisql.getCliente(idCliente);
				pedido.setCliente(objCliente);

				// Data pedido
				System.out.println("Selecione a data do pedido");
				String dataPedido = scan.nextLine();
				pedido.setDate(PedidoController.stringToDate(dataPedido));

				// produto

				System.out.println();
				System.out.println("Quantos produtos deseja");
				int p = Integer.parseInt(scan.nextLine());
				proMenu.buscarProdutos();
				System.out.println("Esses s�o os produtos disponiveis");
				for (int i = 0; i < p; i++) {
					System.out.println("Informe o id do produto");
					int idProduto = Integer.parseInt(scan.nextLine());
					Produto produto1 = proMenu.getProduto(idProduto);
					produto1.getId(idProduto);
					listaProPedidos.add(produto1);
				}

				// EXIBIR VALOR TOTAL
				pedido.setProdutos(listaProPedidos);
				pedido.somar();
				pedi.inserirPedido(pedido);
				// EXIBIR PRODUTOS/VALOR TOTAL/ DATA/ NOME CLIENTE
				
				System.out.println(pedido.getProdutos());
				System.out.println(pedido.getValorTotal());
				System.out.println(pedido.getDate());
				System.out.println(pedido.getCliente());
				//pedi.inserirPedido(new Pedido());
				//System.out.println(listaProPedidos.size());

				break;
			case 10:
				// EXIBIR PEDIDO
				
				System.out.println("Informe o id do pedido");
				int idPedidoMostrar = Integer.parseInt(scan.nextLine());
				pedi.getPedido(idPedidoMostrar);
				// pedido.setId(pedi.listarPedido());
//				pedido.setProdutos(listaProPedidos);
//				pedido.somar();
//				pedido.setDate(new Date(System.currentTimeMillis()));
//			
				break;
			case 11:
				// DELETAR PEDIDO
				System.out.println("Digite o id do pedido");
				int idPedidoexcluir = Integer.parseInt(scan.nextLine());
				pedi.listarPedidos();
		
				pedi.getPedido(idPedidoexcluir);
				break;
			case 12:
				// chamar metodo sair do programa
				respostaValida = false;
				System.out.println("Cristiano devSistemas");
				System.out.println("======================");
				break;
			}
		}

			if (opcao >= 12) {
				System.out.println("Opcao Invalida");
			} else {
				System.out.println("");

			}
		
		if (resposta != 1) {
			System.out.println("Deseja fazer mais alguma opera��o\n 1- sim \n 2- n�o");
			resposta = scan.nextInt();
			
			
		System.out.println("Finalizando");
		System.out.println("Cristiano devSistemas");
		System.out.println("======================");

		// }

	}
}
}
