package Menu;
//package Menu;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import vendas.app.VendasApp;
//import vendas.controller.ClienteController;
//import vendas.controller.ClienteControllerDB;
//import vendas.controller.PedidoController;
//import vendas.controller.ProdutoController;
//import vendas.model.Usuario;
//import vendas.ui.ClientePrinter;
//import vendas.ui.PedidoPrinter;
//import vendas.ui.ProdutoPrinter;
//import vendasControllerDB.PedidoDB;
//import vendasControllerDB.ProdutocontrollerDB;
//
//public class MenuPrinter5 {
//
//	static Scanner scan = VendasApp.getScanner();
//	ClientePrinter printer = new ClientePrinter();
//	ClienteControllerDB clisql = new ClienteControllerDB();
//	ProdutoPrinter printerP = new ProdutoPrinter();
//	ProdutocontrollerDB proMenu = new ProdutocontrollerDB();
//	PedidoPrinter printerPedido = new PedidoPrinter();
//	PedidoDB pediB = new PedidoDB();
//	ClienteController clienteController = new ClienteController();
//	ProdutoController produtoController = new ProdutoController();
//	PedidoController pedi = new PedidoController();
//	MenuHomePage home = new MenuHomePage();
//
//	
//
//	public void login() {
//		ArrayList<Usuario> usuarios = new ArrayList<>();
//		public static Usuario usuarioLogado;
//		boolean rodando = true;
//		while (rodando) {
//			// MENU + INPUT DO USUARIO
//			System.out.println("1-Fazer cadastro");
//			System.out.println("2-Fazer login");
//			System.out.println("3-Sair");
//			System.out.println("Digite a opção:");
//			String opcao = scan.nextLine();
//
//			// PROCESSAR O INPUT DO USUARIO
//			switch (opcao) {
//			case "1": {
//				System.out.println("===CADASTRO===");
//				System.out.println("Digite o email:");
//				String email = scan.nextLine();
//				System.out.println("Digite a senha:");
//				String senha = scan.nextLine();
//
//				Usuario u = new Usuario();
//				u.setEmail(email);
//				u.setSenha(senha);
//
//				usuarios.add(u);
//				System.out.println("Usuario cadastrado com sucesso!");
//				break;
//			}
//			case "2":
//				System.out.println("===LOGIN===");
//				System.out.println("Digite o email:");
//				String email = scan.nextLine();
//				System.out.println("Digite a senha:");
//				String senha = scan.nextLine();
//				boolean loginSucesso = false;
//				for (Usuario u : usuarios) {
//					String uEmail = u.getEmail();
//					String uSenha = u.getSenha();
//					boolean emailConfere = email.equals(uEmail);
//					boolean senhaConfere = senha.equals(senha);
//
//					if (emailConfere && senhaConfere) {
//						// Login feito com sucesso!
//						loginSucesso = true;
//						 usuarioLogado = u;
//						break;
//					}
//				}
//				if (!loginSucesso) {
//					System.out.println("Email ou senha incorretos");
//				} else {
//					System.out.println("Login feito com sucesso");
//					home.menuPrinter2(clienteController, produtoController, pedi, pedi);
//
//				}
//
//			case "3":
//				rodando = false;
//				System.out.println("Encerrando o programa");
//				System.out.println("Cristiano DevSistemas");
//				break;
//
//			default: {
//				break;
//			}
//			}
//		}
//	}
//}
