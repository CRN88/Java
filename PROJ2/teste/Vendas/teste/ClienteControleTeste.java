package Vendas.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.lang.ModuleLayer.Controller;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import vendas.controller.ClienteController;
import vendas.controller.ClienteControllerDB;
import vendas.model.Cliente;

public class ClienteControleTeste {

	@DisplayName("Meu primeiro teste, deve retormar verdadeiro")
	@Test
	void testeController() throws Exception {

		ClienteControllerDB cliT = new ClienteControllerDB();
		Cliente c = new Cliente();
		c.setCpf("789.456.123-78");
		c.setNome("PAULO");
		c = cliT.inserirCliente(c);

		assertNotEquals(0, c.getId());
	}

	/**
	 * Este método deve encontrar clientes com o nome recebido por parametro e
	 * retornar a lista
	 */
	@Test
	@DisplayName("Listar clientes por nome")
	void testListClientesNome() throws Exception {
		String nome = "Daniel";
		ClienteController controller = new ClienteController();
		controller.inserirCliente(new Cliente(0, "", nome));
		List<Cliente> retorno = controller.listCliente(nome);
		assertNotNull(retorno);
		assertEquals(1, retorno.size());
	}

	// ESSE TESTE ESTÁ INSERINDO O CLIENTE E EXCLUINDO PELO NOME E CPF
	//QUE FOI INSERIDO
	
	@Test
	@DisplayName("Inserir e excluir cliente")
	void testClienteExcluir() throws Exception {
		ClienteControllerDB clisql = new ClienteControllerDB();
		Cliente c = new Cliente();
		c.setCpf("cpf");
		c.setNome("nome");
		c = clisql.inserirCliente(c);
		clisql.excluirCliente(c);
	}

	
	//ESSE TESTE ESTÁ ATUALIZANDO UM CLIENTE E BUSCANDO O CLIENTE
	//QUE FOI ATUALIZADO
	@Test
	@DisplayName("atualizar cliente")
	void testClienteAtualizar() throws Exception {
		ClienteControllerDB clisql = new ClienteControllerDB();
		Cliente c = new Cliente();
		c.setId(16);
		c.setCpf("456.798.123-89");
		c.setNome("Jhon");
		c = clisql.atualizarCliente(c);
		c = clisql.buscarCliente(c);
		
	}
}
