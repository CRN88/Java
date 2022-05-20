package vendasControllerDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import vendas.controller.ClienteController;
import vendas.controller.PedidoController;
import vendas.controller.ProdutoController;
import vendas.model.Produto;

public class ProdutocontrollerDB {
	public void menuPrinter2(ClienteController clieContro, ProdutoController produContro, PedidoController pediContro) {

	}

	private Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pedido", "root", "fjsistemas");
		return con;
	}

	// INSERIR PRODUTO OK
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
			//BUSCAR PRODUTOS CADASTRAD0S OK
	public void buscarProdutos() throws Exception {
		Connection con = getConnection();
		try {
			String sql = "SELECT id,nome,preco FROM produtos";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String preco = rs.getString("preco");
				System.out.println("Id: " + id + " Nome:" + nome + " preco:" + preco);
			}

			rs.close();
			ps.close();

		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}
	}
	// EXCLUIR PRODUTO PELO ID
		public void excluirProduto(Produto produto) throws Exception {
			Connection con = getConnection();
			try {
				String sql = "DELETE FROM produtos WHERE id = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, produto.getId());
				ps.executeUpdate();
				int rowsAffected = ps.executeUpdate();

				if (rowsAffected > 0) {
					System.out.println("Erro ao deletar produto");
				} else {
					System.out.println("Produto deletado com sucesso");
				}
			} catch (Exception e) {
				throw e;
			} finally {
				if (con != null) {
					con.close();
				}
			}

		}
	public Produto capturarProduto(Produto produto) {
		
		return produto;
	}

	public void excluirProduto(int i) {	
	}

	public Produto getId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void excluirProduto() {
		// TODO Auto-generated method stub
		
	}
	
}
