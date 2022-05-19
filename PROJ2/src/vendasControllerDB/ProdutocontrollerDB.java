package vendasControllerDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import vendas.controller.ClienteController;
import vendas.controller.PedidoController;
import vendas.controller.ProdutoController;
import vendas.model.Cliente;
import vendas.model.Produto;

public class ProdutocontrollerDB {
	public void menuPrinter2(ClienteController clieContro, ProdutoController produContro, PedidoController pediContro) {
		
	}
	private Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pedido", "root" ,"fjsistemas");
		return con;
	}
	
	public void inserirProduto(Produto produto) throws Exception {
		Connection con = getConnection();
		try {
			String sql = "INSERT INTO produtos (nome,preco) VALUES (?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setDouble(2, produto.getPreco());
			ps.executeUpdate();		
			int rowsAffected = ps.executeUpdate();
			
			if (rowsAffected > 0) {
				System.out.println("Produto inserido com sucesso");
			} else {
				System.out.println("Erro ao inserir Produto. Tente novamente");
			}
			
		} catch (Exception e) {
			// caso encontre uma excessao, dispara ela
			throw e;
		} finally {
			// caso tenha uma conexao aberta, encerra
			if (con != null) {
				con.close();
			}
		}
	}
	public Produto capturarProduto(Produto produto) {
		// TODO Auto-generated method stub
		return produto;
	}
}
