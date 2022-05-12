package Model;

import java.util.Date;

import View.PedidoPrinter;

public class Pedido {
	private int id;
	private Date data;
	private Cliente cliente;
	private double valorTotal;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", cliente=" + cliente + ", valorTotal=" + valorTotal + "]";
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public void getNome(PedidoPrinter pedido) {
		
	}
	
	public void datapedido(String string) {
		
	}

	public void getPreco (int i) {

	}
	public static void add(Pedido pedidop) {	
	}
	public void getNome(String string) {
		// TODO Auto-generated method stub
		
	}
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	public Pedido size() {
		// TODO Auto-generated method stub
		return null;
	}

	public void put(int id, Pedido pedido) {
		
	}
}


