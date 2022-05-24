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
import vendas.model.Usuario;
import vendas.ui.ClientePrinter;
import vendas.ui.PedidoPrinter;
import vendas.ui.ProdutoPrinter;
import vendasControllerDB.PedidoDB;
import vendasControllerDB.ProdutocontrollerDB;

public abstract class MenuPrinter2 {

	static Scanner scan = VendasApp.getScanner();
	ClientePrinter printer = new ClientePrinter();
	ClienteControllerDB clisql = new ClienteControllerDB();
	ProdutoPrinter printerP = new ProdutoPrinter();
	ProdutocontrollerDB proMenu = new ProdutocontrollerDB();
	PedidoPrinter printerPedido = new PedidoPrinter();
	PedidoDB pediB = new PedidoDB();
	PedidoController pedi = new PedidoController();
	ArrayList<Usuario> usuarios = new ArrayList();
	boolean rodando = true;

	while(rodando)
	{
		// MENU + INPUT DO USUARIO
		System.out.println("1-Fazer cadastro");
		System.out.println("2-Fazer login");
		System.out.println("3-Sair");
		System.out.println("Digite a opção:");
		String opcao = scan.nextLine();

		// PROCESSAR O INPUT DO USUARIO
		switch (opcao) {
		case "1": {
			System.out.println("===CADASTRO===");
			System.out.println("Digite o email:");
			String email = scan.nextLine();
			System.out.println("Digite a senha:");
			String senha = scan.nextLine();

			Usuario u = new Usuario();
			u.setEmail(email);
			u.setSenha(senha);

			usuarios.add(u);
			System.out.println("Usuario cadastrado com sucesso!");
			break;
		}
		case "2":
			System.out.println("===LOGIN===");
			System.out.println("Digite o email:");
			String email = scan.nextLine();
			System.out.println("Digite a senha:");
			String senha = scan.nextLine();
			boolean loginSucesso = false;
			for (Usuario u : usuarios) {
				String uEmail = u.getEmail();
				String uSenha = u.getSenha();
				boolean emailConfere = email.equals(uEmail);
				boolean senhaConfere = senha.equals(senha);

				if (emailConfere && senhaConfere) {
					// Login feito com sucesso!
					loginSucesso = true;
					Usuario usuarioLogado = u;
					homePage();
					break;
				}
			}
			if (!loginSucesso) {
				System.out.println("Email ou senha incorretos");
			} else {
				System.out.println("Login feito com sucesso");
			}

		case "3":
			rodando = false;
			System.out.println("Encerrando o programa");
			System.out.println("Cristiano DevSistemas");
			break;

		default: {
			break;
		}
		}
	}

	public static void homePage(){

	public void menuPrinter2(ClienteController clieContro, ProdutoController produContro,
				PedidoController pedidoController, PedidoController pediContro)
		throws Exception {
		int opcao = 0;
		int operacao = 0;
		boolean rodando = true;
		int resposta = 0;
	
		ArrayList<Usuario> usuarios = new ArrayList();

		while (rodando) {
			System.out.println("=========================");
			System.out.println("Cristiano devSistemas");
			System.out.println("O melhor para sua empresa");
			System.out.println("=========================");
			System.out.println("Escolha a opçao desejada");
			System.out.println("1-Cliente");
			System.out.println("2-Produto");
			System.out.println("3-Pedido");
			System.out.println("4- Sair do programa");
			System.out.println("=========================");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("=======CLIENTE=======");
				System.out.println("1-Adicionar cliente");
				System.out.println("2-Excluir cliente");
				System.out.println("3-Clientes cadastrados");
				System.out.println("4-Atualizar cliente");
				System.out.println("5-Voltar ao menu principal");
				operacao = scan.nextInt();

				switch (operacao) {
				case 1:
					// ADICIONAR CLIENTE
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
					// EXCLUIR CLIENTE
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
				case 3:
					// EXIBIR OS CLIENTES CADASTRADOS
					System.out.println("Esses s�o os clientes cadastrados");
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
				case 4:
					// ATUALIZAR CLIENTE
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
					System.out.println("1- Voltar ao menu");
					System.out.println("2- Sair do programa");
					resposta = Integer.parseInt(scan.nextLine());
					if (resposta != 1) {
						System.out.println("Finalizando...");
						System.out.println("Cristiano devSistemas");
						System.out.println("======================");
					}
					break;
				case 5:

				}

			default: {
				break;
			}
			case 2:
				System.out.println("======PRODUTOS========");
				System.out.println("1-Adicionar produto");
				System.out.println("2-Excluir produto");
				System.out.println("3-Produto cadastrados");
				System.out.println("4-Atualizar produto");
				System.out.println("5-Voltar ao menu principal");
				opcao = scan.nextInt();

				switch (opcao) {
				case 1:
					// ADICIONAR PRODUTO
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
				case 2:
					// EXCLUIR PRODUTO //OK
					System.out.println("digite o Id do produto que deseja excluir");
					proMenu.buscarProdutos();
					int pro = Integer.parseInt(scan.nextLine());
					proMenu.excluirProduto(proMenu.getProduto(pro));
					proMenu.buscarProdutos();
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
					// LISTAR PRODUTOS
					System.out.println("Esses sao os produtos");
					proMenu.buscarProdutos();
					break;
				case 4:
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
					System.out.println("1- Voltar ao menu");
					System.out.println("2- Sair do programa");
					resposta = Integer.parseInt(scan.nextLine());
					if (resposta != 1) {
						System.out.println("Finalizando...");
						System.out.println("Cristiano devSistemas");
						System.out.println("======================");
					}
					break;
				case 5:
					// VOLTAR AO MENU PRINCIPAL

					break;
				}
			case 3:
				System.out.println("1-Adicionar pedido");
				System.out.println("2-Excluir pedido");
				System.out.println("3-Pedido cadastrados");
				System.out.println("4-Voltar ao menu principal");
				operacao = scan.nextInt();

				switch (opcao) {
				case 1:
					// ADD PEDIDO
					Pedido pedido = new Pedido();
					List<Produto> listaProPedidos = new ArrayList<>();
					System.out.println("");
					System.out.println("Esses s�o os clientes cadastrados");
					System.out.println("Informe o id do cliente");
					System.out.println();
					clisql.bucarUsuarios();
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
					// EXIBIR PEDIDO
					pedido.setProdutos(listaProPedidos);
					pedido.somar();
					for (int i = 1; i < listaProPedidos.size(); i++) {
						System.out.println(pedido.getProdutos());
					}
					System.out.println(pedido.getValorTotal());
					System.out.println(pedido.getDate());
					System.out.println(pedido.getCliente());
					System.out.println("1- Voltar ao menu");
					System.out.println("2- Sair do programa");
					resposta = Integer.parseInt(scan.nextLine());
					if (resposta != 1) {
						System.out.println("Finalizando...");
						System.out.println("Cristiano devSistemas");
						System.out.println("======================");
					}
					break;
				case 2:
					// EXCLUIR PEDIDO
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
					// LISTAR PEDIDOS CADASTRADOS
					System.out.println("1- Voltar ao menu");
					System.out.println("2- Sair do programa");
					resposta = Integer.parseInt(scan.nextLine());
					if (resposta != 1) {
						System.out.println("Finalizando...");
						System.out.println("Cristiano devSistemas");
						System.out.println("======================");
					}
					break;
				case 4:
					// Encerrar programa
					break;
				default: {
					break;
					System.out.println("Opcao invalida");
					}
				  
				
			}
		}
      }
	}
}
}