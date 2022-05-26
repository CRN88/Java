package Frames;

import java.awt.EventQueue;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import vendas.controller.ClienteControllerDB;
import vendas.model.Cliente;

public class ClienteExcluir extends JFrame {

	private JPanel contentPaneID;
	private JTextField textid;
	private JButton btnConfirmar;
	private JLabel lblNewLabel_2;
	private List list;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteExcluir frame = new ClienteExcluir();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	
	

	ClienteControllerDB clienteC = new ClienteControllerDB();
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 416);
		contentPaneID = new JPanel();
		contentPaneID.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneID);
		contentPaneID.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(137dlu;default)"),}));
		
		btnNewButton = new JButton("LISTAR CLIENTES");
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
		contentPaneID.add(btnNewButton, "7, 2, 16, 1");
		
		lblNewLabel_2 = new JLabel("DIGITE O ID");
		contentPaneID.add(lblNewLabel_2, "4, 4");
		
		JLabel lblNewLabel = new JLabel("ID");
		contentPaneID.add(lblNewLabel, "2, 6, right, default");
		
		textid = new JTextField();
		contentPaneID.add(textid, "4, 6, fill, default");
		textid.setColumns(10);
		
		list = new List();
		contentPaneID.add(list, "6, 4, 17, 11");
		
		btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					exCliente();
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		contentPaneID.add(btnConfirmar, "4, 8");
	}

}
