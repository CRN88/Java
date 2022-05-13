package vendas.ui;

import java.util.Collection;
import java.util.Scanner;

import vendas.app.VendasApp;
import vendas.model.Produto;

public class ProdutoPrinter {
	public Produto capturarProduto(Produto produto) {
		// armazena o estado do cliente quando entrar no metodo
		boolean isNew = produto.isNew();

		// faz referencia a scanner
		Scanner sca = VendasApp.getScanner();

		// se o cliente nao for novo exibe o codigo, senao exibe mensagem de novo
		// cliente
		if (!isNew) {
			System.out.println("Inserindo novo produto: " + produto.getId());
		} else {
			System.out.println("Alterando produto código");
		}

		System.out.println();

		// se for um novo produto, pergunta o codigo
		if (isNew) {
			System.out.println("Informe o código: ");
			produto.setId(sca.nextInt());
			sca.nextLine();
		}

		// solicita o nome
		// se o produto nao for novo, exibe o nome anterior
		System.out.print("Informe o nome do produto");
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

		// solicita o cpf
		// se o cliente nao for novo, exibe o cpf anterior
		System.out.print("Informe o valor");
		if (!isNew) {
			System.out.print(" [ anterior = " + produto.getPreco() + "]");
		}
		System.out.println(":");
		produto.setPreco(sca.nextInt());

		return produto;
	}
	// faz referencia a scanner

	public void exibirLista(Collection<Produto> produtos) {
		for (Produto produto : produtos) {
			exibirProduto(produto);
		}
	}

	private void exibirProduto(Produto produto) {
		System.out.println(produto);

	}

//	public void exibirProduto(Collection<Cliente> collection) {
//		System.out.println(collection);
//	}
}
// roda certinho
//	Scanner sc = VendasApp.getScanner();
//
//	System.out.println("Inserindo novo produto " + produto.getNome());
//	produto.setNome(sc.nextLine());
//	sc.nextLine();
//	System.out.println("Informe o código: " + produto.getId());
//	produto.setId(sc.nextInt());
//	sc.nextLine();
//	System.out.println("Informe o valor: " + produto.getPreco());
//	produto.setPreco(sc.nextInt());
//	sc.nextLine();
//	return produto;
//
//}
