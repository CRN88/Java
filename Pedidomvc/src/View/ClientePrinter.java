package View;

import java.util.Collection;

import Model.Cliente;
import Model.Pedido;

public class ClientePrinter {	
	
	public void mostrarConsole(Collection <Cliente> collection){
		
		for(Cliente cliente : collection)
		System.out.println("["+cliente.getId()+"]"+" "+cliente.getNome()+" - "+cliente.getCpf());
	}
	
	
	public void carregarCliente(Collection <Cliente> carregar) {
		for(Cliente cliente : carregar)
			System.out.println(cliente.getId());
	}
	public void carregarCliente(Cliente carregarCliente) {	
	}
	public void excluirCliente(Cliente excluirCliente) {
		return;
	}
	public void mostrarPedidoConsole(Pedido pedidop) {		
	}

	
}
