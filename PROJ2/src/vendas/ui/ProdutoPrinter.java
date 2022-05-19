package vendas.ui;

import java.util.Collection;
import java.util.Scanner;
import vendas.app.VendasApp;
import vendas.model.Produto;

public class ProdutoPrinter {
	public Produto capturarProduto(Produto produto) {
		// armazena o estado do produto quando entrar no metodo
		boolean isNew = produto.isNew();

		// faz referencia a scanner
		Scanner sca = VendasApp.getScanner();

//		 se o produto nao for novo exibe o codigo, senao exibe mensagem de novo
//		 produto
//		if (!isNew) {
//			System.out.println("Inserindo novo produto: " + produto.getId());
//		} else {
//			System.out.println("Alterando produto código");
//			System.out.println("Inserindo novo produto: " + produto.getId());
//		}
	//	 se for um novo produto, pergunta o codigo
		if (isNew) {
		//	System.out.println("Informe o código: ");
		//	produto.setId(sca.nextInt());

		}

		// se o produto nao for novo, exibe o nome anterior
		System.out.print("Informe o nome do produto");
		produto.setNome(sca.nextLine());
		if (!isNew) {
			System.out.print(" [produto anterior = " + produto.getNome() + "]");
		}
		System.out.println(":");
		// se o cliente for novo, passa qualquer valor
		// se o cliente nao for novo, passa o novo valor somente
		// se o valor capturado nao for vazio ""
		// funcao trim remove os espaços do final da string
		String nome = sca.nextLine();
		if (isNew || (!isNew && !nome.trim().equals(""))) {
			produto.setNome(nome);
		}

		System.out.println();

		// solicita o valor do produto
		// se o produto nao for novo, exibe o valor anterior
		System.out.print("Informe o valor: ");
		// produto.setPreco(sca.nextInt());
		produto.setPreco(Integer.parseInt(sca.nextLine()));
		if (!isNew) {
			System.out.print(" [ anterior = " + produto.getPreco() + "]");
		}
		return produto;
	}

	public void exibirLista(Collection<Produto> produtos) {
		for (Produto produto : produtos) {
			System.out.println(
					"nome: " + produto.getNome() + " preço: " + produto.getPreco());
		}
	}

	public void exibirProduto(Produto produto) {
		System.out.println(produto);

	}
	public void inserirProduto(Produto produto) {
		System.out.println(produto);
	}
}
