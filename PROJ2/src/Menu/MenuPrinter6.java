package Menu;
//package Menu;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import vendas.app.VendasApp;
//import vendas.controller.ClienteController;
//import vendas.controller.ClienteControllerDB;
//import vendas.controller.PedidoController;
//import vendas.controller.ProdutoController;
//import vendas.model.Cliente;
//import vendas.model.Pedido;
//import vendas.model.Produto;
//import vendas.model.Usuario;
//import vendas.ui.ClientePrinter;
//import vendas.ui.PedidoPrinter;
//import vendas.ui.ProdutoPrinter;
//import vendasControllerDB.PedidoDB;
//import vendasControllerDB.ProdutocontrollerDB;
//
//public class MenuPrinter6 {
//	ClientePrinter printer = new ClientePrinter();
//	ClienteControllerDB clisql = new ClienteControllerDB();
//	ProdutoPrinter printerP = new ProdutoPrinter();
//	ProdutocontrollerDB proMenu = new ProdutocontrollerDB();
//	PedidoPrinter printerPedido = new PedidoPrinter();
//	PedidoDB pediB = new PedidoDB();
//	PedidoController pedi = new PedidoController();
//
//	static Scanner scan = VendasApp.getScanner();
//
//	public void menuPrinter2(ClienteController clieContro, ProdutoController produContro,
//			PedidoController pedidoController, PedidoController pedidoController2) {
//		try {
//			int opcao = 0;
//			int operacao = 0;
//			boolean rodando = true;
//			int resposta = 0;
//
//		
//
//			while (rodando) {
//				System.out.println("=========================");
//				System.out.println("Cristiano devSistemas");
//				System.out.println("O melhor para sua empresa");
//				System.out.println("=========================");
//				System.out.println("Escolha a opçao desejada");
//				System.out.println("1-Cliente");
//				System.out.println("2-Produto");
//				System.out.println("3-Pedido");
//				System.out.println("4- Sair do programa");
//				System.out.println("=========================");
//				opcao = scan.nextInt();
////opcao principal
//				switch (opcao) {
//				case 1:
//					System.out.println("=======CLIENTE=======");
//					System.out.println("1-Adicionar cliente");
//					System.out.println("2-Excluir cliente");
//					System.out.println("3-Clientes cadastrados");
//					System.out.println("4-Atualizar cliente");
//					System.out.println("5-Voltar ao menu principal");
//					operacao = scan.nextInt();
////operacao cliente
//					switch (operacao) {
//					case 1:
//		// ADICIONAR CLIENTE
//						clisql.inserirCliente(printer.capturarCliente(new Cliente()));
//						System.out.println();
//						
//							break;
//						
//					case 2:
//		// EXCLUIR CLIENTE
//						System.out.println("Informe o Id do cliente que deseja excluir");
//						int cli = Integer.parseInt(scan.nextLine());
//						clisql.buscarCliente(clisql.getCliente(cli));
//						clisql.excluirCliente(clisql.getCliente(cli));
//						clisql.bucarUsuarios();
//						System.out.println("1- Voltar ao menu");
//						System.out.println("2- Sair do programa");
//						resposta = Integer.parseInt(scan.nextLine());
//						if (resposta != 1) {
//							System.out.println("Finalizando...");
//							System.out.println("Cristiano devSistemas");
//							System.out.println("======================");
//							break;
//						}
//					case 3:
//		// EXIBIR OS CLIENTES CADASTRADOS
//						System.out.println("Esses s�o os clientes cadastrados");
//						clisql.bucarUsuarios();
//					
//							break;
//						}
//					case 4:
//		// ATUALIZAR CLIENTE
//						System.out.println("Atualizar cliente");
//						System.out.println("Digite o id do cliente ");
//						int l = Integer.parseInt(scan.nextLine());
//						Cliente cliente = clisql.getCliente(l);
//						System.out.println("Digite o cpf");
//						String a = scan.nextLine();
//						cliente.setCpf(a);
//						System.out.println("Digite o nome");
//						String b = scan.nextLine();
//						cliente.setNome(b);
//						clisql.atualizarCliente(cliente);
//						clisql.bucarUsuarios();
//						
//						break;
//	//voltar ao menu principal					
//					case 5:
//						break;
//				default: {
//					break;
//				}
//	//PRODUTOS			
//				case 2:
//					System.out.println("======PRODUTOS========");
//					System.out.println("1-Adicionar produto");
//					System.out.println("2-Excluir produto");
//					System.out.println("3-Produto cadastrados");
//					System.out.println("4-Atualizar produto");
//					System.out.println("5-Voltar ao menu principal");
//					opcao = scan.nextInt();
//
//					switch (operacao) {
//					case 1:
//	// ADICIONAR PRODUTO
//						proMenu.inserirProduto(printerP.capturarProduto(new Produto()));
//						
//						break;
//					case 2:
//			// EXCLUIR PRODUTO //OK
//						System.out.println("digite o Id do produto que deseja excluir");
//						proMenu.buscarProdutos();
//						int pro = Integer.parseInt(scan.nextLine());
//						proMenu.excluirProduto(proMenu.getProduto(pro));
//						proMenu.buscarProdutos();
//						
//						break;
//					case 3:
//			// LISTAR PRODUTOS
//						System.out.println("Esses sao os produtos");
//						proMenu.buscarProdutos();
//						break;
//					case 4:
//			// ATUALIZAR PRODUTO
//						System.out.println("Atualizar produto");
//						System.out.println("Digite o id do produto ");
//						proMenu.buscarProdutos();
//						int x = Integer.parseInt(scan.nextLine());
//						Produto produto = proMenu.getProduto(x);
//						System.out.println("Digite o preco");
//						double j = Double.parseDouble(scan.nextLine());
//						produto.setPreco(j);
//						System.out.println("Digite o nome");
//						String n = scan.nextLine();
//						produto.setNome(n);
//						proMenu.atualizarProduto(produto);	
//						break;
//					case 5:
//			// VOLTAR AO MENU PRINCIPAL
//						break;
//					}
//				case 3:
//					System.out.println("1-Adicionar pedido");
//					System.out.println("2-Excluir pedido");
//					System.out.println("3-Pedido cadastrados");
//					System.out.println("4-Voltar ao menu principal");
//					operacao= scan.nextInt();
//
//					switch (operacao) {
//					case 1:
//		// ADD PEDIDO
//						Pedido pedido = new Pedido();
//						List<Produto> listaProPedidos = new ArrayList<>();
//						System.out.println("");
//						System.out.println("Esses s�o os clientes cadastrados");
//						System.out.println("Informe o id do cliente");
//						System.out.println();
//						clisql.bucarUsuarios();
//						int idCliente = Integer.parseInt(scan.nextLine());
//						Cliente objCliente = clisql.getCliente(idCliente);
//						pedido.setCliente(objCliente);
//						// Data pedido
//						System.out.println("Selecione a data do pedido");
//						String dataPedido = scan.nextLine();
//						pedido.setDate(PedidoController.stringToDate(dataPedido));
//						// produto
//						System.out.println();
//						System.out.println("Quantos produtos deseja");
//						int p = Integer.parseInt(scan.nextLine());
//						proMenu.buscarProdutos();
//						System.out.println("Esses s�o os produtos disponiveis");
//						for (int i = 0; i < p; i++) {
//							System.out.println("Informe o id do produto");
//							int idProduto = Integer.parseInt(scan.nextLine());
//							Produto produto1 = proMenu.getProduto(idProduto);
//							// estava getId eu alterei para set pq estava dando erro
//							// precisa testa agora para ver se funciona.
//							// estava funcionando corretamente
//							// 24/01 11:04
//							produto1.setId(idProduto);
//							listaProPedidos.add(produto1);
//						}
//			// EXIBIR PEDIDO
//						pedido.setProdutos(listaProPedidos);
//						pedido.somar();
//						for (int i = 1; i < listaProPedidos.size(); i++) {
//							System.out.println(pedido.getProdutos());
//						}
//						System.out.println(pedido.getValorTotal());
//						System.out.println(pedido.getDate());
//						System.out.println(pedido.getCliente());
//						break;
//					case 2:
//			// EXCLUIR PEDIDO
//						
//						break;
//					case 3:
//			// LISTAR PEDIDOS CADASTRADOS
//						System.out.println("1- Voltar ao menu");
//						System.out.println("2- Sair do programa");
//						resposta = Integer.parseInt(scan.nextLine());	
//						
//						break;
//					case 4:
//						rodando = false;
//						// Encerrar programa
//						break;
//					default: {
//						break;
//					}
//				  }
//				}
//			}
//		  } catch (Exception e) {
//		
//			} finally {
//				 
//					
//	  }
//	}
//
//	}
//
