package vendas.app;

import java.util.Scanner;

import Menu.MenuPrinter2;
//import br.com.fuhr.mysql.ClienteControllerDB;
import vendas.controller.ClienteController;
import vendas.controller.ClienteControllerDB;
import vendas.controller.PedidoController;
import vendas.controller.ProdutoController;
import vendas.ui.ClientePrinter;

public class VendasApp {
	// instancia singleton
	// variaveis est�ticas sao variaveis instanciadas uma unica vez no sistema
	// inteiro por classe
	// Sao acessiveis independente de instanciar a classe em questao
	// * pesquisar sobre o padrao de projeto singleton e variaveis static
	private static Scanner scanner = new Scanner(System.in);

	public static Scanner getScanner() {
		return scanner;
	}

	public static void main(String[] args) throws Exception {
		// controlar os clientes
		ClienteController clienteController = new ClienteController();
		ProdutoController produtoController = new ProdutoController();
		//ProdutocontrollerDB proDB = new ProdutocontrollerDB();
		MenuPrinter2 menuP = new MenuPrinter2();
		PedidoController pedidoController = new PedidoController();
		ClienteControllerDB clieDB = new ClienteControllerDB();
		ClientePrinter clieP = new ClientePrinter();
		
		menuP.menuPrinter2(clienteController,produtoController,clieP,clieDB, pedidoController);

		//ATUALIZAR CLIENTE DO BANCO DE DADOS  ok	
		//INSERIR CLIENTE NO BANCO DE DADOS
//		Cliente cliente = new Cliente();
//		cliente.setNome("");
//		cliente.setCpf("147.587.584-58");
//		clieDB.inserirCliente(cliente);
		
		//ACIONAR PRODUTO OK
//		Produto produto = new Produto();
//		produto.setNome("Monitor");
//		produto.setPreco(1500);	
//		proDB.inserirProduto(produto);
		
	
		
		
		
		//BUSCAR CLIENTE NO BANCO DE DADOS PEWLO ID
		//clieP.exibirCliente(clieDB.getCliente(1));
		
		//ATUALIZAR CLIENTE DO BANCO DE DADOS
//		try {
//			Cliente cliente = clieDB.getCliente(7);
//			cliente.setCpf("258.369.147-25");
//			cliente.setNome("Carlos");
//			clieDB.atualizarCliente(cliente);			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//EXCLUI O CLIENTE PELO ID 
//		clieDB.excluirCliente(clieDB.getCliente(2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//			Cliente clie = clieDB.getCliente(2);
//		
//			clieP.exibirLista(clie);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		// instancia e grava clientes pr� armazenados
		// caso queira armanezar outros tipos, executar aqui

		// * pesquisar sobre try catch em java
//		try {
//			clienteController.inserirCliente(new Cliente(1, "012.345.789-66", "Jo�o da Silva"));
//			clienteController.inserirCliente(new Cliente(2, "789.456.123-00", "Aline dos Santos"));
//			clienteController.inserirCliente(new Cliente(3, "444.321.654.99", "Jos� Lima"));
//		} catch (Exception e) {
//			System.err.println(e.getLocalizedMessage());
//		}
//
//		// insere novo cliente
//		ClientePrinter printer = new ClientePrinter();
//		try {
//			clienteController.inserirCliente(printer.capturarCliente(new Cliente()));//NOVO / id,cpf, nome
//		} catch (Exception e) {
//			System.err.println(e.getLocalizedMessage());
//		}

		// Cliente cliente = printer.capturarCliente(new Cliente());
		// clienteController.inserirCliente(cliente);

		// listar
		//Collection<Cliente> collection = clienteController.listarClientes();
		//printer.exibirLista(collection);
		//System.out.println("Total de " + collection.size() + " clientes.");

		// alterar cliente
//		try {
//			clienteController.atualizarCliente(printer.capturarCliente(clienteController.carregarCliente(2)));
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.err.println(e.getLocalizedMessage());
//		}

		// listar
//		collection = clienteController.listarClientes();
//		printer.exibirLista(collection);
//		System.out.println("Total de " + collection.size() + " clientes.");

		// controlar os produto
//		ProdutoController produtoController = new ProdutoController();
//		try {
//			produtoController.inserirProduto(new Produto(10, "Placa de video", 6.000));
//			produtoController.inserirProduto(new Produto(11, "Ssd", 500));
//			produtoController.inserirProduto(new Produto(12, "Mouse", 859));
//			produtoController.inserirProduto(new Produto(13, "Teclado", 970));
//		} catch (Exception e) {
//			System.err.println(e.getLocalizedMessage());
//		}
//
//		ProdutoPrinter printerp = new ProdutoPrinter();
//		try {
//			produtoController.inserirProduto(printerp.capturarProduto(new Produto()));
//		} catch (Exception e) {
//			System.err.println(e.getLocalizedMessage());
//		}
//
		// listar


//		//log
//		System.out.println(clienteController.listarClientes());
//		
//		//alterar cliente
//		//primeiro busca o cliente
//		Cliente cliente = clienteController.carregarCliente(2);
//		//altera o que for necess�rio
//		cliente.setNome("Joana dos Santos");
//		//faz o update
//		clienteController.atualizarCliente(cliente);
//		
//		//log
//		System.out.println(clienteController.listarClientes());
//		
//		//excluir cliente
//		clienteController.excluirCliente(3);
//		//log
//		System.out.println(clienteController.listarClientes());
//		
//		PedidoController pedidoController = new PedidoController();
//		
		//novo pedido
//		Pedido pedido = new Pedido();
//		pedido.setId(1);
//		pedido.setData(pedidoController.stringToDate("10/05/2022"));
	//	pedido.setCliente(clienteController.carregarCliente(1));
//		
}
	}

	

