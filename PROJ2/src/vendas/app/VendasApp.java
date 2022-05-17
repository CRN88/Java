package vendas.app;

import java.util.Collection;
import java.util.Scanner;

import Menu.MenuPrinter2;
import vendas.controller.ClienteController;
import vendas.controller.PedidoController;
import vendas.controller.ProdutoController;
import vendas.model.Cliente;
import vendas.model.Pedido;
import vendas.model.Produto;
import vendas.ui.ClientePrinter;
import vendas.ui.ProdutoPrinter;

public class VendasApp {
	// instancia singleton
	// variaveis estáticas sao variaveis instanciadas uma unica vez no sistema
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
		MenuPrinter2 menuP = new MenuPrinter2();
		PedidoController pedidoController = new PedidoController();
		menuP.menuPrinter2(clienteController,produtoController, pedidoController);
		// instancia e grava clientes pré armazenados
		// caso queira armanezar outros tipos, executar aqui

		// * pesquisar sobre try catch em java
//		try {
//			clienteController.inserirCliente(new Cliente(1, "012.345.789-66", "João da Silva"));
//			clienteController.inserirCliente(new Cliente(2, "789.456.123-00", "Aline dos Santos"));
//			clienteController.inserirCliente(new Cliente(3, "444.321.654.99", "José Lima"));
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
//		Collection<Cliente> collection = clienteController.listarClientes();
//		printer.exibirLista(collection);
//		System.out.println("Total de " + collection.size() + " clientes.");

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
//		//altera o que for necessário
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
