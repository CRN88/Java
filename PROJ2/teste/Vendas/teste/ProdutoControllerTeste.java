package Vendas.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import vendas.model.Produto;
import vendasControllerDB.ProdutocontrollerDB;

public class ProdutoControllerTeste {

	// TESTE INSERIR OK
	@DisplayName("Esse teste insere um produto")
	@Test
	void testeController() throws Exception {
		ProdutocontrollerDB proT = new ProdutocontrollerDB();
		Produto p = new Produto();
		p.setId(25);
		p.setNome("Mesa");
		p.setPreco(450);
		p = proT.inserirProduto(p);

		assertNotEquals(0, p.getId());
	}

	// TESTE EXCLUIR OK
	@DisplayName("Esse teste insere e exclui um produto")
	@Test
	void testeProdutoExcluir() throws Exception {
		ProdutocontrollerDB proT = new ProdutocontrollerDB();
		Produto p = new Produto();
		p.setNome("mesa");
		p.setPreco(450);
		p = proT.excluirProduto(p);
	}

	@DisplayName("Listar produtos")
	@Test
	void testeListProdutoNome() throws Exception{
		ProdutocontrollerDB controller = new ProdutocontrollerDB();
		Produto p = new Produto();
		//p.setNome("Monitor");
		String nome = "Geladeira";
		//controller.inserirProduto(p);
		//controller.inserirProduto(new Produto(nome, 0));
		List<Produto>retorno = controller.listProduto(nome);
		assertNotNull(retorno);
		assertEquals(1, retorno.size());
	}
	
	//TESTE ATUALIZAR PRODUTO OK
	@DisplayName(" Atualizar produto")
	@Test
	void testProdutoAtualiazar() throws Exception {
		ProdutocontrollerDB proT = new ProdutocontrollerDB();
		Produto p = new Produto();
		p.setId(6);
		p.setNome("Suporte tv");
		p.setPreco(750);
		p = proT.atualizarProduto(p);
		p = proT.buscarProduto(p);
		
	}
}