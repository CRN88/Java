package Frames;

import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import vendas.controller.ClienteControllerDB;
import vendas.model.Cliente;

public class ClienteAtualizar extends JFrame {

	private JPanel contentPane;
	private List list;
	private JTextField textid;
	private JTextField textnome;
	private JTextField textcpf;
	
	ClienteControllerDB clienteC = new ClienteControllerDB();
	
	public void atualizarCliente() throws Exception{
		Cliente cliente = new Cliente();
		int x = Integer.parseInt(textid.getText());
		cliente.setId(x);
		clienteC.buscarCliente(cliente);
		cliente.setNome(textnome.getText());
		cliente.setCpf(textcpf.getText());
		clienteC.atualizarCliente(cliente);
		setVisible(false);
	}

	public void listCliente() throws Exception {
		list.removeAll();
		for(Cliente cliente : clienteC.listarClientes()) {
			list.add(cliente.toString());
		}
	}

	public ClienteAtualizar() {
		setTitle("ATUALIZAR CLIENTE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 623, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("LISTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteAtualizar list = new ClienteAtualizar();
				try {
					list.listCliente();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				list.setVisible(true);
			}
		});
		btnNewButton.setBounds(374, 36, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					atualizarCliente();
					JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");

				}catch(Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
		btnConfirmar.setBounds(40, 272, 89, 23);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancelar.setBounds(140, 272, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_4 = new JLabel("ID");
		lblNewLabel_4.setBounds(38, 109, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("NOME");
		lblNewLabel_4_1.setBounds(38, 148, 46, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("CPF");
		lblNewLabel_4_2.setBounds(38, 188, 46, 14);
		contentPane.add(lblNewLabel_4_2);
		
		textid = new JTextField();
		textid.setBounds(94, 106, 35, 20);
		contentPane.add(textid);
		textid.setColumns(10);
		
		textnome = new JTextField();
		textnome.setColumns(10);
		textnome.setBounds(94, 145, 103, 20);
		contentPane.add(textnome);
		
		textcpf = new JTextField();
		textcpf.setColumns(10);
		textcpf.setBounds(94, 185, 103, 20);
		contentPane.add(textcpf);
		
		List list2 = new List();
		list2.setBounds(253, 65, 333, 312);
		contentPane.add(list2);
		
		JLabel lblNewLabel = new JLabel("  ATUALIZAR CLIENTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(164, 11, 208, 14);
		contentPane.add(lblNewLabel);
	}
}
