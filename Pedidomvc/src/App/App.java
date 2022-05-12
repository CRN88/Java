package App;

import Controler.ClienteControler;
import Controler.PedidoController;
import Controler.ProdutoController;
import Model.Cliente;
import Model.Pedido;
import Model.Produto;
import View.ClientePrinter;
import View.PedidoPrinter;
import View.ProdutoPrinter;

public class App {
	public static void main(String[] args) {
	//controlar os clientes
		ClienteControler clienteController = new ClienteControler();
		ClientePrinter printer = new ClientePrinter();
		ProdutoController produtoController = new ProdutoController();
		ProdutoPrinter printerProduto = new ProdutoPrinter();
		PedidoController pedidoController = new PedidoController();
		PedidoPrinter printerPedido = new PedidoPrinter();
		
		
		
	// instancia e grava os clientes
		clienteController.inserirCliente(new Cliente(1, "123,466,456-12", "João da Silva"));
		clienteController.inserirCliente(new Cliente(2, "789.456.123.-85", "Maria josé"));
		clienteController.inserirCliente(new Cliente(3, "785.652.965-14", "Marcos Alves"));
		clienteController.inserirCliente(new Cliente(4, "785.652.258-84", "Fernando martins"));

		
		produtoController.inserirProduto(new Produto(10,"Placa de video", 6.859));
		produtoController.inserirProduto(new Produto(11,"Gabinete", 599.00));
		produtoController.inserirProduto(new Produto(12, "Ssd-1T", 395 ));
		produtoController.inserirProduto(new Produto(13, "Memoria", 357 ));
		
	
		
		pedidoController.inserirPedido(new Pedido(20,"1°pedido",350));
		pedidoController.inserirPedido(new Pedido(21,"2°pedido",3));
		pedidoController.inserirPedido(new Pedido(23,"3°pedido",200));
		pedidoController.inserirPedido(new Pedido(24,"4°pedido",250));
		
//		Pedido pedidop = new Pedido();
//		 pedidop.getNome("Ssd");
//		 pedidop.getPreco(20);
//		 pedidop.setId(45);
//		 Pedido.add(pedidop);
		
		printer.mostrarConsole(clienteController.listarClientes());
	
		System.out.println();
		printerProduto.mostrarProdutoConsole(produtoController.listaProdutos());
		
		//System.out.println(produtoController.carregarProduto(12));
		
		printer.mostrarPedidoConsole();
        // System.out.println(pedidop);
         //printerPedido.mostrarPedidoConsole(pedidoControll);
         //quando o sistema estiver rodando melhor quero adicionar um metodo para pegar a data 
         //que o usuario digitar pra quando ele quer o pedido.
		
		
	}
}
