package Frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import vendas.controller.ClienteControllerDB;
import vendas.controller.PedidoController;
import vendas.model.Cliente;
import vendas.ui.ClientePrinter;
import vendas.ui.PedidoPrinter;
import vendas.ui.ProdutoPrinter;
import vendasControllerDB.PedidoDB;
import vendasControllerDB.ProdutocontrollerDB;
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MenuFrame extends JFrame {
	
	 

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=354,129
	 */
	private final TextArea textArea = new TextArea();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFrame frame = new MenuFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public MenuFrame() throws Exception {
		setVisible(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuFrame.class.getResource("/IMAGES/download (2).jpg")));
		setTitle("DEV SISTEMAS");
		setFont(null);
		ClientePrinter printer = new ClientePrinter();
		ClienteControllerDB clisql = new ClienteControllerDB();
		ProdutoPrinter printerP = new ProdutoPrinter();
		ProdutocontrollerDB proMenu = new ProdutocontrollerDB();
		PedidoPrinter printerPedido = new PedidoPrinter();
		PedidoDB pediB = new PedidoDB();
		PedidoController pediC = new PedidoController();
		PedidoDB pedi = new PedidoDB();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Cliente cliente = new Cliente();
		//clisql.inserirCliente(printer.capturarCliente(new Cliente()));
	
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
	
			
		
		JMenu btnCliente = new JMenu("CLIENTE");
		btnCliente.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(btnCliente);
		
//		btnCliente.addActionListener(new java.awt.event.ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent argo) {
//				try {
//					clisql.inserirCliente(printer.capturarCliente(new Cliente()));
//				
//				} catch (Exception e) {
//					
//					e.printStackTrace();
//				}
//			}
//		});
		JMenuItem btnClienteInserir = new JMenuItem("INSERIR");
		btnClienteInserir.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnCliente.add(btnClienteInserir);
		Cliente c = new Cliente();	
		
		
		
		
		JMenu mnNewMenu = new JMenu("INSERIR");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnCliente.add(mnNewMenu);
		
		JLabel lblNewLabel_2 = new JLabel("NOME");
		mnNewMenu.add(lblNewLabel_2);
		c.setNome("nome");
		textField = new JTextField();
		mnNewMenu.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CPF");
		mnNewMenu.add(lblNewLabel_3);
		c.setCpf("Cpf");
		
		
		textField_1 = new JTextField();
		mnNewMenu.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("CONFIRMAR");
		mnNewMenu.add(btnNewButton);
		c = clisql.inserirCliente(c);
		
		//c = clisql.inserirCliente(cliente);
		//c = clisql.buscarCliente(c);
		//c = clisql.getCliente(getCursorType());
		
		//btnClienteInserir.addActionListener(clisql.inserirCliente(printer.capturarCliente(new Cliente();
		
		JMenuItem btnClienteExcluir = new JMenuItem("EXCLUIR");
		btnClienteExcluir.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnCliente.add(btnClienteExcluir);
		
		JMenuItem btnClienteAtualizar = new JMenuItem("ATUALIZAR");
		btnClienteAtualizar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnCliente.add(btnClienteAtualizar);
		
		JMenuItem btnClienteListar = new JMenuItem("LISTAR");
		btnClienteListar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnCliente.add(btnClienteListar);
		
		JMenu mnNewMenu_1 = new JMenu("PRODUTOS");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("INSERIR");
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("EXCLUIR");
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("ATUALIZAR");
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("LISTAR");
		mntmNewMenuItem_10.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_1.add(mntmNewMenuItem_10);
		
		JMenu mnNewMenu_2 = new JMenu("PEDIDO");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("INSERIR");
		mntmNewMenuItem_6.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("EXCLUIR");
		mntmNewMenuItem_7.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("ATUALIZAR");
		mntmNewMenuItem_8.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("LISTAR");
		mntmNewMenuItem_11.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_2.add(mntmNewMenuItem_11);
		contentPane = new JPanel();
		contentPane.setBorder(UIManager.getBorder("CheckBox.border"));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("DEV SISTEMAS");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 36));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel lblNewLabel_1 = new JLabel("O melhor para sua empresa");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		Box verticalBox = Box.createVerticalBox();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(198)
							.addComponent(verticalBox, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(verticalBox, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
}
