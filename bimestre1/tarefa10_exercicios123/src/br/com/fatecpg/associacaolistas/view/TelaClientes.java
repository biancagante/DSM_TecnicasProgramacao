package br.com.fatecpg.associacaolistas.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TelaClientes extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	JLabel lblListaClientes = new JLabel("");

	public TelaClientes(String dadosClientes) {
		setBounds(100, 100, 300, 210);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblListaClientes.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblListaClientes.setVerticalAlignment(SwingConstants.TOP);
		lblListaClientes.setBounds(10, 30, 264, 130);
		contentPanel.add(lblListaClientes);
		
		JLabel lblNewLabel_1 = new JLabel("Clientes: ");
		lblNewLabel_1.setFont(new Font("Consolas", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 11, 79, 14);
		contentPanel.add(lblNewLabel_1);
		
		atualizarLista(dadosClientes);
	}
	
	public void atualizarLista(String dadosClientes) {
		lblListaClientes.setText("<html>" + dadosClientes.replaceAll("\n", "<br>") + "</html>");
	}
}
