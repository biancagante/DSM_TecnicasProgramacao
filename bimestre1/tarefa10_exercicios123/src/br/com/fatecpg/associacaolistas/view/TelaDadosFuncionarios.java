package br.com.fatecpg.associacaolistas.view;
import br.com.fatecpg.associacaolistas.model.*;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class TelaDadosFuncionarios extends JDialog {

	private static final long serialVersionUID = 1L;
	JLabel lblListaFuncionarios = new JLabel("");
	Empresa empresa;

	public TelaDadosFuncionarios(String dadosFunc, Empresa empresa) {
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(128, 128, 192));
		this.empresa = empresa;
		setBounds(100, 100, 550, 328);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Funcionários");
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 191, 14);
		getContentPane().add(lblNewLabel);
		lblListaFuncionarios.setFont(new Font("Consolas", Font.PLAIN, 11));
		
		lblListaFuncionarios.setVerticalAlignment(SwingConstants.TOP);
		lblListaFuncionarios.setHorizontalAlignment(SwingConstants.LEFT);
		lblListaFuncionarios.setBounds(10, 36, 330, 246);
		getContentPane().add(lblListaFuncionarios);
		
		JLabel lbl_Media = new JLabel("");
		lbl_Media.setFont(new Font("Consolas", Font.PLAIN, 11));
		lbl_Media.setBounds(346, 196, 178, 23);
		getContentPane().add(lbl_Media);
		
		JButton btnCalcular = new JButton("Calcular Média Salarial");
		btnCalcular.setForeground(new Color(255, 255, 255));
		btnCalcular.setBackground(new Color(128, 128, 192));
		btnCalcular.setFont(new Font("Consolas", Font.BOLD, 11));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_Media.setText("");
				lbl_Media.setText("Média: " + empresa.calcularMediaSalarial());
			}
		});
		btnCalcular.setBounds(344, 235, 180, 29);
		getContentPane().add(btnCalcular);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblResultado.setBounds(346, 61, 178, 23);
		getContentPane().add(lblResultado);
		
		JLabel lblNewLabel_1 = new JLabel("Total:");
		lblNewLabel_1.setFont(new Font("Consolas", Font.BOLD, 11));
		lblNewLabel_1.setBounds(344, 36, 180, 14);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Folha de Pagamento");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(128, 128, 192));
		btnNewButton.setFont(new Font("Consolas", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResultado.setText("");
				lblResultado.setText("Folha salarial: " + empresa.calcularFolhaSalarial());
			}
		});
		btnNewButton.setBounds(344, 109, 180, 29);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total:");
		lblNewLabel_1_1.setFont(new Font("Consolas", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(344, 171, 180, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		
		atualizarDados(dadosFunc);
	}
	
	public void atualizarDados(String dados) {
		lblListaFuncionarios.setText("<html>" + dados.replaceAll("\n", "<br>") + "</html>");
	}
}
