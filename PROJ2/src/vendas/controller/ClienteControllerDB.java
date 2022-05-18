package vendas.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import vendas.model.Cliente;

public class ClienteControllerDB {

	/// PESQUISA PELO ID DO CLIENTE
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

	/// ADICIONAR CLIENTE
	public void inserirCliente(Cliente cliente) throws Exception {
		Connection con = getConnection();
		try {

			String sql = "INSERT INTO cliente (nome,cpf) VALUES (?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());

			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}
	}

	public void excluirCliente(Cliente cliente) throws Exception {
		Connection con = getConnection();
		try {
			String sql = "DELETE FROM cliente WHERE cliente_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cliente.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}

	}

	public void buscarCliente(Cliente cliente) throws Exception {
		Connection con = getConnection();
		try {
			String sql = "SELECT * FROM cliente WHERE cliente_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cliente.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null) {
				con.close();
			}
		}
	}
	public void atualizarCliente(Cliente cliente) throws Exception{
		Connection  con = getConnection();
		try {
			String sql = "UPDATE cliente SET nome = ? ,cpf = ?  WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());
			ps.setInt(3, cliente.getId());
			ps.executeUpdate();

		}catch (Exception e) {
			throw e;
		}finally {
			if(con !=null) {
				con.close();
			}
		}

	}
	
}
