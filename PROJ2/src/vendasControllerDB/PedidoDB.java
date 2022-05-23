package vendasControllerDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import vendas.model.Pedido;
import vendas.model.Produto;

public class PedidoDB {
	

	private Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pedido", "root", "fjsistemas");
		return con;
	}

	public void inserirPedido(Pedido pedido) throws Exception {
		Connection con = getConnection();
		try {

			String sql = "INSERT INTO pedido (data, idcliente, valortotal) VALUES (?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDate(1, pedido.getDate());
			ps.setInt(2, pedido.getCliente().getId());
			ps.setDouble(3, pedido.getValorTotal());

			ps.executeUpdate();
			ps.close();

			sql = "SELECT LAST_INSERT_ID() as id";
			PreparedStatement ps2 = con.prepareStatement(sql);
			ResultSet rs = ps2.executeQuery();
			while (rs.next()) {
				pedido.setId(rs.getInt("id"));
			}
			sql = "INSERT INTO pedido_produto (idpedido,idproduto) VALUES (?,?)";
			for (Produto produto : pedido.getProdutos()) {
				PreparedStatement ps3 = con.prepareStatement(sql);
				ps3.setInt(1, pedido.getId());
				ps3.setInt(2, produto.getId());
				ps3.close();
			}
		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}
	}

	/// PESQUISA PELO ID DO PEDIDO TESTE
	public Pedido getPedido(int id) throws Exception {
		Connection con = getConnection();
		try {
			Pedido pedido = null;
			String sql = "SELECT id, data, valortotal FROM produtos WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				id = rs.getInt("id");
				//Date data = rs.getDate("data");
				Double valorTotal = rs.getDouble("valorTotal");

				pedido = new Pedido();
				pedido.setId(id);
			//	pedido.setData(data);
				pedido.setValorTotal(valorTotal);
			}
			rs.close();
			ps.close();

			if (pedido == null) {
				throw new Exception("Produto not found.");
			}

			return pedido;
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

	// EXCLUIR PEDIDO PELO ID TESTE
	public void excluirPedido(Pedido pedido) throws Exception {
		Connection con = getConnection();
		try {
			String sql = "DELETE FROM pedido WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, pedido.getId());
			ps.executeUpdate();
			int rowsAffected = ps.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Erro ao deletar pedido");
			} else {
				System.out.println("pedido deletado com sucesso");
			}
		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}

	}

	public void excluirPedido() {
	}

	public void buscarPedido(int pro) {
	}

	public void excluirPedido(Object produto) {
	}

	public void setProduPedi(Pedido produto) {
	}

	public void setData(Date stringToDate) {
	}
}
