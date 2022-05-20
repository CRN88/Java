package vendas.ui;

import java.sql.Connection;
import java.util.Collection;
import java.util.Scanner;
import vendas.app.VendasApp;
import vendas.model.Produto;

public class ProdutoPrinter {
	
	public Produto capturarProduto(Produto produto) {
		

		boolean isNew = produto.isNew();
		Scanner sca = VendasApp.getScanner();
		if (isNew) {
		}
		System.out.print("Informe o nome do produto");
		System.out.println();
		produto.setNome(sca.nextLine());
		System.out.println();
		System.out.println();
		System.out.print("Informe o valor: ");
		produto.setPreco(Integer.parseInt(sca.nextLine()));
		if (!isNew) {
			System.out.print(" [ anterior = " + produto.getPreco() + "]");
		}
		return produto;
	}
	
	public void exibirLista(Collection<Produto> produtos) {
		for (Produto produto : produtos) {
			System.out.println(
					"nome: " + produto.getNome() + " pre�o: " + produto.getPreco());
		}
	}

	public void exibirProduto(Produto produto) {
		System.out.println(produto);

	}
	public void inserirProduto(Produto produto) {
		System.out.println(produto);
	}
}
