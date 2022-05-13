package vendas.controller;

import java.util.Collection;
import java.util.HashMap;

import vendas.model.Cliente;

public class ClienteController {
	private HashMap<Integer, Cliente> clientes = new HashMap<>();
	public ClienteController() {
		try {
			inserirCliente(new Cliente(1, "012.345.789-66", "João da Silva"));
			inserirCliente(new Cliente(2, "789.456.123-00", "Aline dos Santos"));
			inserirCliente(new Cliente(3, "444.321.654.99", "José Lima"));
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}

	}

	public void inserirCliente(Cliente cliente) throws Exception {
		if (clientes.containsKey(cliente.getId())) {
			throw new Exception("Já existe um cliente com esse código.");
		}
		if (cliente.getNome().trim().equals("")) {
			throw new Exception("Não é possível inserir clientes sem nome.");
		}

		clientes.put(cliente.getId(), cliente);
	}

	public void atualizarCliente(Cliente cliente) {
		clientes.replace(cliente.getId(), cliente);
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

	public void getNome(String nextLine) {	
		
	}
}
