//package Menu;
//
//import java.util.Collection;
//import java.util.Scanner;
//
//import vendas.app.VendasApp;
//import vendas.controller.ClienteController;
//import vendas.controller.PedidoController;
//import vendas.controller.ProdutoController;
//import vendas.model.Cliente;
//import vendas.ui.ClientePrinter;
//import vendas.ui.ProdutoPrinter;
//
//public  class MenuPrinter {
//	
//	
//	private static Collection<Cliente> collection;
//
//	public static void main(String[] args) throws Exception{
//			
//			Scanner scan = VendasApp.getScanner();
//			ClientePrinter printer = new ClientePrinter();
//			ClientePrinter cPrinter = new ClientePrinter(); 
//		
//
//			ClienteController clienteController = new ClienteController();	
//			boolean respostaValida = true;
//			
//			
//			int resposta = 1;
//			while (resposta == 1) {
//				System.out.println("=========================");
//				System.out.println("Cristiano devSistemas");
//				System.out.println("=========================");
//				System.out.println("Escolha a opçao desejada");
//				System.out.println("1- Adicionar cliente");
//				System.out.println("2- Exibir cliente");
//				System.out.println("3- Excluir cliente");
//				System.out.println("4- Adicionar produto");
//				System.out.println("5- Exibir produto");
//				System.out.println("6- Exicluir produto");
//				System.out.println("7- adicionar pedido");
//				System.out.println("8- Exibir pedido");
//				System.out.println("9- Excluir pedido");
//				System.out.println("10- Sair do programa");
//				System.out.println("=========================");
//
//				resposta = Integer.parseInt(scan.nextLine());
//		
//				switch (resposta) {
//				case 1: 
//					// chamar metodo adicionar cliente
//					//System.out.println("1-Informe o id do cliente");
//					clienteController.inserirCliente(printer.capturarCliente(new Cliente()));
//					System.out.println("informações do cliente cadastrado");
//					//System.out.println(clienteController.listarClientes());
//					//cPrinter.exibirCliente(clienteController);
//					System.out.println();
//					System.out.println("1- Voltar ao menu");
//					System.out.println("2- Sair do programa");
//					resposta = scan.nextInt();
//					if (resposta != 1) {
//						System.out.println("Finalizando");
//						System.out.println("Cristiano devSistemas");
//						System.out.println("======================");
//						break;
//
//					}
//				
//				case 2: 
//	
//					
//
//					break;
//				
//				case 3: 
//					// chamar metodo exclir cliente
//					System.out.println("Informe o Id do cliente que deseja excluir");
//					clienteController.excluirCliente(3);
//
//					break;
//				
//				case 4: 
//					// chamar metodo Adicionar produto
//					System.out.println("Informe o Id do produto");
//			
//
//					break;
//				
//				case 5: 
//					// chamar metodo exibir produto
//					System.out.println("Esses sao os produtos");
//			
//
//					break;
//				
//				case 6: 
//					// chamar metodo excluir produto
//					System.out.println("digite o Id do produto que deseja excluir");
//					
//
//					break;
//				
//				case 7: 
//					// chamar metodo adicionar pedido
//					System.out.println("Informe os dados do pedido");
//
//					break;
//				
//				case 8: 
//					// chamar metodo exibir pedido
//					System.out.println("Esses sao os dados do pedido");
//					
//
//					break;
//				
//				case 9: 
//					// chamar metodo excluir cliente
//
//					break;
//				
//				case 10: 
//					// chamar metodo sair do programa
//
//					System.out.println("Cristiano devSistemas");
//					System.out.println("======================");
//				
//
//				default: 
//					
//					respostaValida = false;
//				}
//
//					if (!respostaValida) {
//						System.out.println("Opcao Invalida");
//					} else {
//						System.out.println("opcao");
//					}
//				}
//			
//				System.out.println("Deseja fazer mais alguma operaçaõ\n 1- sim \n 2- não");
//				resposta = scan.nextInt();
//				if (resposta != 1) {
//					System.out.println("Finalizando");
//					System.out.println("Cristiano devSistemas");
//					System.out.println("======================");
//				
//				}
//				
//			} // while
//	
//	public void executarPrinter(ClienteController clienteController, ProdutoController produtoController, 
//			PedidoController pedidoController, ClientePrinter clientePrinter)  {	
//	}		
//		
//}
////}
//
//
////		private static void infoCliente(Cliente cliente) {
////			ClientePrinter.mostrarConsole(ClientePrinter.listarClientes());
////			
////		}
//
//// private static void addCliente() {
////			System.out.println("informações");
////			ClientePrinter.mostrarConsole(ClientePrinter.listarClientes());
