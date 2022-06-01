package Frames;

import java.awt.EventQueue;
import java.awt.Font;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClienteInserir extends JFrame {

	private JPanel contentPane;
	private JTextField textnome;
	private JTextField textcpf;

	
	ClienteControllerDB clienteC = new ClienteControllerDB();
	public void addCliente() throws Exception {
		Cliente cliente = new Cliente();
		cliente.setNome(textnome.getText());
		cliente.setCpf(textcpf.getText());
		clienteC.inserirCliente(cliente);
		setVisible(false);
	}
	
	public ClienteInserir() {
		setTitle("CADASTAR CLIENTE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("  CADASTRO DE CLIENTES");
		lblNewLabel_3.setBounds(110, 21, 253, 22);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_3);
		
		textnome = new JTextField();
		textnome.setBounds(158, 114, 193, 20);
		contentPane.add(textnome);
		textnome.setColumns(10);
		
		textcpf = new JTextField();
		textcpf.setBounds(158, 159, 193, 20);
		contentPane.add(textcpf);
		textcpf.setColumns(10);
		
		JButton btnNewButton = new JButton("CONFIRMAR");
		btnNewButton.setBounds(84, 256, 125, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					addCliente();
					JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					setVisible(false);
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnCancelar.setBounds(270, 256, 125, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("NOME");
		lblNewLabel.setBounds(102, 117, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel cpf = new JLabel("CPF");
		cpf.setBounds(102, 162, 46, 14);
		contentPane.add(cpf);
	}

}
