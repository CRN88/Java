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
import vendasControllerDB.ProdutocontrollerDB;

public class MenuPrinter2 {

	public void menuPrinter2(ClienteController clieContro, ProdutoController produContro, ClientePrinter clieP, PedidoController pediContro)
	
			throws Exception {
		Scanner scan = VendasApp.getScanner();
		ClientePrinter printer = new ClientePrinter();
		ProdutoPrinter printerP = new ProdutoPrinter();
		ProdutoPrinter printerProduto = new ProdutoPrinter();
		ProdutocontrollerDB proMenu = new ProdutocontrollerDB();
		PedidoPrinter printerPedido = new PedidoPrinter();
		ClienteControllerDB clisql = new ClienteControllerDB();
		boolean respostaValida = true;
		int resposta = 1;
		while (resposta != 10) {
			System.out.println("=========================");
			System.out.println("Cristiano devSistemas");
			System.out.println("=========================");
			System.out.println("Escolha a opçao desejada");
			System.out.println("1- Adicionar cliente");
			System.out.println("2- Exibir clientes cadastrados");
			System.out.println("3- Atualizar cliente");
			System.out.println("4- Excluir cliente");
			System.out.println("5- Adicionar produto");
			System.out.println("6- Exibir produtos");
			System.out.println("7- Exicluir produto");
			System.out.println("8- adicionar pedido");
			System.out.println("9- Exibir pedido");
			System.out.println("10- Excluir pedido");
			System.out.println("11- Sair do programa");
		
			System.out.println("=========================");

			resposta = Integer.parseInt(scan.nextLine());

			switch (resposta) {
			case 1:
				// chamar metodo adicionar cliente
				clisql.inserirCliente(printer.capturarCliente(new Cliente()));			
				System.out.println();
				System.out.println("1- Voltar ao menu");
				System.out.println("2- Sair do programa");
				resposta = Integer.parseInt(scan.nextLine());
				if (resposta != 1) {
					System.out.println("Finalizando...");
					System.out.println("Cristiano devSistemas");
					System.out.println("======================");
					break;
				}
			case 2:
				System.out.println("Esses são os clientes cadastrados");		
				clisql.bucarUsuarios();
				System.out.println("1- Voltar ao menu");
				System.out.println("2- Sair do programa");
				resposta = Integer.parseInt(scan.nextLine());
				if (resposta != 1) {
					System.out.println("Finalizando...");
					System.out.println("Cristiano devSistemas");
					System.out.println("======================");
				}
				break;

			case 3:
				System.out.println("Atualizar cliente");
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
				clisql.bucarUsuarios();
				
				break;
			case 4:
				// chamar metodo excluir cliente
				System.out.println("Informe o Id do cliente que deseja excluir");
				int cli = Integer.parseInt(scan.nextLine());
				clisql.buscarCliente(clisql.getCliente(cli));
				clisql.excluirCliente(clisql.getCliente(cli));
				clisql.bucarUsuarios();
				System.out.println("1- Voltar ao menu");
				System.out.println("2- Sair do programa");
				resposta = Integer.parseInt(scan.nextLine());
				if (resposta != 1) {
					System.out.println("Finalizando...");
					System.out.println("Cristiano devSistemas");
					System.out.println("======================");
					break;
				}
				
				break;
			case 5:
				// chamar metodo Adicionar produto
				//clisql.inserirCliente(printer.capturarCliente(new Cliente()));
				proMenu.inserirProduto(printerP.capturarProduto(new Produto()));
			
				System.out.println("1- Voltar ao menu");
				System.out.println("2- Sair do programa");
				resposta = Integer.parseInt(scan.nextLine());
				if (resposta != 1) {
					System.out.println("Finalizando...");
					System.out.println("Cristiano devSistemas");
					System.out.println("======================");
				}

				break;

			case 7:
				// chamar metodo exibir produto
				System.out.println("Esses sao os produtos");
				//printerProduto.exibirLista(produContro.listarProduto());
				break;

			case 6:
				// chamar metodo excluir produto
				//printerProduto.exibirLista(produContro.listarProduto());
				System.out.println("digite o Id do produto que deseja excluir");
				int i = Integer.parseInt(scan.nextLine());
				//produContro.excluirProduto(i);
				//printerProduto.exibirLista(produContro.listarProduto());
				System.out.println("Produto excluido");
				System.out.println("1- Voltar ao menu");
				System.out.println("2- Sair do programa");
				resposta = Integer.parseInt(scan.nextLine());
				if (resposta != 1) {
					System.out.println("Finalizando...");
					System.out.println("Cristiano devSistemas");
					System.out.println("======================");
				}
			
				break;

			case 8:
				
				Pedido pedi = new Pedido();
				List<Produto> listaP = new ArrayList();
				// chamar metodo adicionar pedido
				System.out.println("Informe o id do pedido");
				int j = Integer.parseInt(scan.nextLine());
				pediContro.setId(j);
				
				
				//Cliente pedido
				
				System.out.println("Informe o id do cliente");
				//printer.exibirLista(clieContro.listarClientes());
				int cp = Integer.parseInt(scan.nextLine());
				pediContro.setId(cp);
				
				
				
				
				//produto
				System.out.println("Informe o id do produto");
				System.out.println("");
				//printerProduto.exibirLista(produContro.listarProduto());
				int k = Integer.parseInt(scan.nextLine());
				//listaP.add(produContro.carregarProduto(k));
				printerPedido.exibirPedidos(pediContro.listarPedido());
				//pediContro
				
				
				//data pedido
				System.out.println("Selecione a data do pedido");
				String d = scan.nextLine();	
				pediContro.setData(PedidoController.stringToDate(d));
				pediContro.inserirPedido(pedi);
				printerPedido.exibirPedidos(pediContro.listarPedido());
				System.out.println(pedi.getData());
				System.out.println(pedi.getId());
				System.out.println(pedi.getCliente());
				System.out.println(pedi.getProdutos());
				
				
				//valor pedido
				

				
				break;

			case 9:
				// chamar metodo exibir pedidos
				System.out.println("Esses sao os dados do pedido");

				break;

			case 10:
				// chamar metodo excluir pedido

				
			

				respostaValida = false;
				break;
			case 11 :
				// chamar metodo sair do programa
				respostaValida = false;
				System.out.println("Cristiano devSistemas");
				System.out.println("======================");
				try {
						
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
			if (!respostaValida) {
				System.out.println("Opcao Invalida");
			} else {
				System.out.println("");

			}
		}// while
		if (resposta != 1) {
			System.out.println("Deseja fazer mais alguma operação\n 1- sim \n 2- não");
			resposta = scan.nextInt();
			System.out.println("Finalizando");
			System.out.println("Cristiano devSistemas");
			System.out.println("======================");

		}
		

	} 
}
