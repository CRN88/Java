package vendas.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int id;

	private Date date;

	private Cliente cliente;

	private double valorTotal;

	private List<Produto> produtos;

	public Pedido() {
		produtos = new ArrayList<>();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Pedido date=" + date + ", cliente=" + cliente + ", produtos=" + produtos
				+ ", valorTotal=" + valorTotal ;
	}
	//ESSE METODO VAI SOMAR O VALOR TOTAL DO PEDIDO
	//DECLARANDO A CARIAVEL EM "0"  E ADICXIONADO VALOR (produto.getPreco()) CONFORME
	//O FOR REPETE ELE ADICIONA OS ITENS DO PEDIDO.
	public void somar() {
		valorTotal = 0 ;
		for(Produto produto: produtos) {
			valorTotal += produto.getPreco();
		}
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public boolean isNew() {
		return false;
	}


}
