package vendas.model;

import java.util.Date;
import java.util.List;

public class Pedido {
	private int id;
	
	private Date data;
	
	private Cliente cliente;
	
	private double valorTotal;
	
	private List<Produto> produtos;
	
	public Pedido() {
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", cliente=" + cliente + ", valorTotal=" + valorTotal
				+ ", produtos=" + produtos + "]";
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Pedido pedido, Cliente cliente) {
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
		// TODO Auto-generated method stub
		return false;
	}


	public void put(int id2, Pedido pedido) {
		// TODO Auto-generated method stub
		
	}


	public void replace(int id2, Pedido pedido) {
		// TODO Auto-generated method stub
		
	}


	public void setCliente(int f) {
		// TODO Auto-generated method stub
		
	}


	public void setProdutos(int k) {
		// TODO Auto-generated method stub
		
	}


	public void setData(String h) {
		// TODO Auto-generated method stub
		
	}


	public double getPrecoTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
}
