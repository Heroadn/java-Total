package Janelas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Listas.ListaProduto;
import Listas.ListaCliente;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public JMenu(ListaCliente lista_cliente, ListaProduto lista_produto) {
		//Cria��o do JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);//para o frame ficar no meio da tela
		
		//JButton que leva a ListagemPessoa
		JButton btnPessoas = new JButton("Clientes");
		btnPessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListagemCliente frame = new ListagemCliente(lista_cliente);
				frame.setVisible(true);
				dispose();
			}
		});
		btnPessoas.setBounds(170, 74, 91, 23);
		contentPane.add(btnPessoas);
		
		//JButton que leva a ListagemProduto
		JButton btnCoisas = new JButton("Produto");
		btnCoisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListagemProduto frame = new ListagemProduto(lista_produto);
				frame.setVisible(true);
				dispose();
			}
		});
		btnCoisas.setBounds(170, 144, 91, 23);
		contentPane.add(btnCoisas);
	}
}
