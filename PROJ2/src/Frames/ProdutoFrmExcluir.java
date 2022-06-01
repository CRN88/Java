package Frames;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import vendas.model.Produto;
import vendasControllerDB.ProdutocontrollerDB;
import java.awt.TextArea;

public class ProdutoFrmExcluir extends JFrame {

	private JPanel contentPane;
	private JTextField textid;
	private List list;
	ProdutocontrollerDB produtoP = new ProdutocontrollerDB();
	private JList<Produto> listprodu;
	
//	public void listarProdutos() throws Exception{
//		DefaultListModel<Produto> model = new DefaultListModel<>();
//		listprodu.removeAll();
//		for(Produto produto : produtoP.listProdutos()) {
//			model.addElement(produto);
//		}
//		listprodu.setModel(model);
//		
//	}
	
	
	public void excluirProduto2() throws Exception {
		Produto produto = new Produto();
		int x = Integer.parseInt(textid.getText());
		produto.setId(x);
		produtoP.buscarProduto(produto);
		produtoP.excluirProduto(produto);
		setVisible(false);
		
	}
	
//	public void listCliente() throws Exception {
//		list.removeAll();
//		for(Cliente cliente : clienteC.listarClientes()) {
//			list.add(cliente.toString());
//		}
	
	
	@SuppressWarnings("unchecked")
	public void listProdutos() throws Exception {
		list.removeAll(list);
		for(Produto produto : produtoP.listProdutos()) {
			list.add(produto.toString());
		}
	}

	
	
	public void excluirProduto() throws Exception {
		Produto produto = listprodu.getSelectedValue();
		produtoP.excluirProduto(produto);
	}
	
	public void atualizarProduto() throws Exception {
		listprodu.removeAll();
		listProdutos();
	}
	
	public ProdutoFrmExcluir() {
		setTitle("ECLUIR PRODUTO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 497, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("EXCLUIR PRODUTO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(154, 11, 238, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ID PRODUTO");
		lblNewLabel_1.setBounds(23, 44, 67, 14);
		contentPane.add(lblNewLabel_1);

		JButton btnlistar = new JButton("LISTAR");
		btnlistar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProdutoFrmExcluir list = new ProdutoFrmExcluir();
				try {
					listprodu.list();
					list.listProdutos();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		btnlistar.setBounds(347, 40, 89, 23);
		contentPane.add(btnlistar);

		textid = new JTextField();
		textid.setBounds(101, 41, 46, 20);
		contentPane.add(textid);
		textid.setColumns(10);

		JButton btnconfirmar = new JButton("CONFIRMAR");
		btnconfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					excluirProduto();
					excluirProduto2();
					
					JOptionPane.showMessageDialog(null,"Produto excluido com sucesso!");
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		btnconfirmar.setBounds(190, 40, 89, 23);
		contentPane.add(btnconfirmar);
		
		JList list_1 = new JList();
		list_1.setBounds(57, 162, -14, -42);
		contentPane.add(list_1);
		
		java.awt.List list_2 = new java.awt.List();
		list_2.setBounds(10, 84, 461, 330);
		contentPane.add(list_2);
	}
}
