package Controler;

import java.util.Collection;
import java.util.HashMap;

import Model.Cliente;

public class ClienteControler {
	private HashMap<Integer, Cliente> clientes = new HashMap<>();

	public void atualizarCliente(Cliente cliente) {
		clientes.put(cliente.getId(), cliente);
	}

	public void excluirCliente(int id) {
		clientes.remove(id);
	}

	public Collection<Cliente> listarClientes() {
		return clientes.values();
	}

	public Cliente carregarCliente(int id) {
		return clientes.get(id);
	}
	public void  inserirCliente(Cliente cliente) {
		clientes.put(cliente.getId(), cliente);
	}

}
