package vendasControllerDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import vendas.controller.ClienteController;
import vendas.controller.PedidoController;
import vendas.controller.ProdutoController;
import vendas.model.Cliente;
import vendas.model.Produto;

public class ProdutocontrollerDB {
	public void menuPrinter2(ProdutoController produtoController, PedidoController pedidoController, PedidoController pediContro) {

	}

	private Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pedido", "root", "fjsistemas");
		return con;
	}

	/// PESQUISA PELO ID DO PRODUTO
	public Produto getProduto(int id) throws Exception {
		Connection con = getConnection();
		try {
			Produto produto = null;
			String sql = "SELECT id, nome, preco FROM produtos WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				id = rs.getInt("id");
				String nome = rs.getString("nome");
				Double preco = rs.getDouble("preco");

				produto = new Produto();
				produto.setId(id);
				produto.setNome(nome);
				produto.setPreco(preco);
			}
			rs.close();
			ps.close();

			if (produto == null) {
				throw new Exception("Produto not found.");
			}

			return produto;
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

	// INSERIR PRODUTO OK
	public Produto inserirProduto(Produto produto) throws Exception {
		Connection con = getConnection();
		try {
			String sql = "INSERT INTO produtos (nome,preco) VALUES (?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setDouble(2, produto.getPreco());
			// ps.executeUpdate();
			int rowsAffected = ps.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Produto inserido com sucesso");
			} else {
				System.out.println("Erro ao inserir Produto. Tente novamente");
			}
			
			sql = "SELECT LAST_INSERT_ID() as id";
			PreparedStatement ps2 = con.prepareStatement(sql);
			ResultSet rs = ps2.executeQuery();
			while (rs.next()) {
				produto.setId(rs.getInt("id"));
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
		return produto;
	}

	// BUSCAR PRODUTOS CADASTRAD0S OK
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

	// BUSCAR PRODUTOS PELO ID OK
	public Produto buscarProduto(Produto produto) throws Exception {
		Connection con = getConnection();
		try {
			String sql = "SELECT * FROM produtod WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, produto.getId());
			ps.executeQuery();

		} catch (Exception e) {
			System.out.println("Erro aqui");
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}
		return produto;
	}

	// EXCLUIR PRODUTO PELO ID OK
	public Produto excluirProduto(Produto produto) throws Exception {
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
		return produto;
	}

	// ATUALIZAR PRODUTO
	public Produto atualizarProduto(Produto produto) throws Exception {
		Connection con = getConnection();
		try {
			String sql = "UPDATE produtos SET nome = ? , preco = ? WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setDouble(2, produto.getPreco());
			ps.setInt(3, produto.getId());
			ps.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}
		return produto;
	}

//	public void excluirProduto() {
//	}
//
//	public void listProdutos(Object buscarCliente) {
//	}
//
//	public void buscarProduto(int pro) {
//	}
//
//	public void capturarProduto(Produto produto) {
//	}
//
//	public void inserirProduto(Object capturarProduto) {
//	}
//
//	public void excluirProduto(Object produto) {
//
//	}
//
//	public Produto getProduto(Produto produto) {
//		return null;
//	}
	public List<Produto> listProduto(String nome) {
		
			return null;
}
}