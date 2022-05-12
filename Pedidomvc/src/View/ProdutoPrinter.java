package View;

import java.util.Collection;

import Model.Produto;

public class ProdutoPrinter {
	
	public void mostrarProdutoConsole(Collection <Produto> collection) {
		for(Produto produto : collection)
			System.out.println("["+produto.getId()+"]"+" "+produto.getNome()+" - "+"R$"+produto.getPreco());
	}
}
