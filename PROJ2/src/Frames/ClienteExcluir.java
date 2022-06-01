package Frames;

import java.awt.EventQueue;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import vendas.controller.ClienteControllerDB;
import vendas.model.Cliente;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Panel;
import java.awt.Label;

public class ClienteExcluir extends JFrame {

	private JPanel contentPaneID;
	private JTextField textid;
	private JButton btnConfirmar;
	private JLabel lblNewLabel_2;
	private List list;
	private JButton btnNewButton;

	ClienteControllerDB clienteC = new ClienteControllerDB();
	private JLabel lblNewLabel_1;
	private JButton btnDelete;
	public void exCliente() throws Exception {
		Cliente cliente = new Cliente();
		int x = Integer.parseInt(textid.getText());
		cliente.setId(x);
		clienteC.buscarCliente(cliente);
		clienteC.excluirCliente(cliente);
		setVisible(false);
	}
	
	public void listCliente() throws Exception {
		list.removeAll();
		for(Cliente cliente : clienteC.listarClientes()) {
			list.add(cliente.toString());
		}
	}
	
	public ClienteExcluir() {
		setTitle("CLIENTE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 473, 499);
		contentPaneID = new JPanel();
		contentPaneID.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneID);
		
		btnNewButton = new JButton("LISTAR");
		btnNewButton.setBounds(342, 51, 78, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteExcluir list = new ClienteExcluir();
				try {
					list.listCliente();
				}catch (Exception e1) {
					e1.printStackTrace();
				}					
				list.setVisible(true);
			}
		});
		contentPaneID.setLayout(null);
		contentPaneID.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("DIGITE O ID");
		lblNewLabel_2.setBounds(27, 55, 93, 14);
		contentPaneID.add(lblNewLabel_2);
		
		textid = new JTextField();
		textid.setBounds(90, 52, 78, 20);
		contentPaneID.add(textid);
		textid.setColumns(10);
		
		list = new List();
		list.setBounds(27, 90, 401, 360);
		contentPaneID.add(list);
		
		btnConfirmar = new JButton("CONFIR");
		btnConfirmar.setBounds(178, 51, 72, 23);
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					exCliente();
					JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");

				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		contentPaneID.add(btnConfirmar);
		
		lblNewLabel_1 = new JLabel("EXCLUIR CLIENTE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(153, 11, 209, 14);
		contentPaneID.add(lblNewLabel_1);
		
		btnDelete = new JButton("CANCELA");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnDelete.setBounds(260, 51, 72, 23);
		contentPaneID.add(btnDelete);
	}
}
