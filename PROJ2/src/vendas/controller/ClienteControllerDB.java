package vendas.controller;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import vendas.model.Cliente;
import vendas.model.Produto;

public class ClienteControllerDB {

	public void menuPrinter2(ClienteController clieContro, ProdutoController produContro, PedidoController pediContro) {

	}

	/// PESQUISA PELO ID DO CLIENTE ok
	private Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pedido", "root", "fjsistemas");
		return con;
	}
	
	public Cliente getCliente(int id) throws Exception {
		Connection con = getConnection();
		try {
			Cliente cliente = null;
			String sql = "SELECT id, nome, cpf FROM cliente WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");

				cliente = new Cliente();
				cliente.setId(id);
				cliente.setNome(nome);
				cliente.setCpf(cpf);
			}
			rs.close();
			ps.close();

			if (cliente == null) {
				throw new Exception("Cliente not found.");
			}

			return cliente;
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

	// EXIBIR LISTA TODA DE CLIENTES
	public List<Cliente> listarClientes() throws Exception {
		Connection con = getConnection();
		try {
			List<Cliente> Lista = new ArrayList<>();
			String sql = "SELECT id,nome,cpf FROM cliente";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");
				Cliente cliente = new Cliente();
				cliente.setId(id);
				cliente.setNome(nome);
				cliente.setCpf(cpf);
				Lista.add(cliente);
				
				
				//System.out.println("Id:" + id + "Nome:" + nome + " Cpf:" + cpf);
			}

			rs.close();
			ps.close();
			return Lista;
		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}
	}

	/// ADICIONAR CLIENTE ok
	public Cliente inserirCliente(Cliente cliente) throws Exception {
		Connection con = getConnection();
		try {

			String sql = "INSERT INTO cliente (nome,cpf) VALUES (?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());

			//ps.executeUpdate();
			int rowsAffected = ps.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Cliente inserido com sucesso");
			} else {
				System.out.println("Erro ao inserir Cliente. Tente novamente");
			}
			
			sql = "SELECT LAST_INSERT_ID() as id";
			PreparedStatement ps2 = con.prepareStatement(sql);
			ResultSet rs = ps2.executeQuery();
			while (rs.next()) {
				cliente.setId(rs.getInt("id"));
			}
			
			return cliente;
		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}
	}

	// EXCLUIR CLIENTE PELO ID ok
	public void excluirCliente(Cliente cliente) throws Exception {
		Connection con = getConnection();
		try {
			String sql = "DELETE FROM cliente WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cliente.getId());
			ps.executeUpdate();
			int rowsAffected = ps.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Erro ao deletar cliente");
			} else {
				System.out.println("Cliente deletado com sucesso");
			}
		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}

	}

	public Cliente buscarCliente(Cliente cliente) throws Exception {
		Connection con = getConnection();
		try {
			String sql = "SELECT * FROM cliente WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cliente.getId());
			ps.executeQuery();
		} catch (Exception e) {
			System.out.println("Erro aqui");
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}
		return cliente;
	}

	public Cliente atualizarCliente(Cliente cliente) throws Exception {
		Connection con = getConnection();
		try {
			String sql = "UPDATE cliente SET nome = ? ,cpf = ?  WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());
			ps.setInt(3, cliente.getId());
			ps.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}
		return cliente;

	}

//	public void excluirCliente() {
//
//	}
//
//	public void listCliente(Object buscarCliente) {
//	}
//
//	public void buscarCliente(int cli) {
//	}
//
//	public void exibirLista(List<Cliente> listCliente) {
//
//	}
//
//	public void inserirProduto(Object capturarProduto) {
//
//	}

}
