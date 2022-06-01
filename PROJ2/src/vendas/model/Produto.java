package vendas.model;

import java.awt.Component;

public class Produto {
	private int id;

	private String nome;

	private double preco;

	public Produto(int id, String nome, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public Produto() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "[Produto:" + nome + " Preco:" + preco+"]"+"\n" ;
	}

	public void replace(int id, Produto produto) {

	}

	public void put(int id, Produto produto) {
	}

	public boolean isNew() {
		if (id == 0) {
			return true;
		} else {
			return false;
		}

	}

	public double getValor() {
	
		return 0;
	}

	public void setValor(int i) {
		
	}

	public void getId(int idProduto) {
		// TODO Auto-generated method stub
		
	}
}
