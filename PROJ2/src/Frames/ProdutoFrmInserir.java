package Frames;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import vendas.model.Produto;
import vendasControllerDB.ProdutocontrollerDB;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class ProdutoFrmInserir extends JFrame {

	private JPanel contentPaneConfirmar;
	private JTextField textpreco;
	ProdutocontrollerDB produtoP = new ProdutocontrollerDB();
	private JTextField textnome1;
	
		public void addProduto() throws Exception {
			Produto produto = new Produto();
			//produto.setId(Integer.parseInt(textid.getText()));
			produto.setNome(textnome1.getText());
			produto.setPreco(Double.parseDouble(textpreco.getText()));
			produtoP.inserirProduto(produto);	
			setVisible(false);
		}

	public ProdutoFrmInserir() {
		setTitle("PRODUTO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 406);
		contentPaneConfirmar = new JPanel();
		contentPaneConfirmar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPaneConfirmar);
		contentPaneConfirmar.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE PRODUTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(119, 28, 219, 14);
		contentPaneConfirmar.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRE\u00C7O");
		lblNewLabel_1.setBounds(142, 138, 46, 14);
		contentPaneConfirmar.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("    NOME");
		lblNewLabel_1_2.setBounds(135, 198, 46, 14);
		contentPaneConfirmar.add(lblNewLabel_1_2);
		
		
		
		textpreco = new JTextField();
		textpreco.setColumns(10);
		textpreco.setBounds(191, 135, 127, 20);
		contentPaneConfirmar.add(textpreco);
		
		JButton btnNewButton = new JButton("CONFIRMAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					addProduto();
					JOptionPane.showMessageDialog(null, "Produto inserido com sucesso!");

				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(109, 270, 89, 23);
		contentPaneConfirmar.add(btnNewButton);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 setVisible(false);
			}
			
		});
		btnCancelar.setBounds(273, 270, 89, 23);
		contentPaneConfirmar.add(btnCancelar);
		
		textnome1 = new JTextField();
		textnome1.setBounds(191, 195, 126, 20);
		contentPaneConfirmar.add(textnome1);
		textnome1.setColumns(10);
		textnome1.setColumns(10);
	}
}
