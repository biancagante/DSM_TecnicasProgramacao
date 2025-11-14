package br.com.fatecpg.associacaolistas.view;
import br.com.fatecpg.associacaolistas.model.*;


import java.util.Locale;
//import java.text.NumberFormat;
//import java.util.Currency;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import java.awt.Color;

public class TelaFuncionarios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCargo;
	private Empresa empresa;
	TelaDadosFuncionarios telaDadosFunc;
	String funcionariosTexto;

	
	public TelaFuncionarios(Empresa empFicticia) {
		this.empresa = empFicticia;
		
		NumberFormat formatoSalario = NumberFormat.getInstance();
		formatoSalario.setMinimumFractionDigits(2);
		formatoSalario.setMaximumFractionDigits(2);
		
		
		setTitle("Funcionário - Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 264, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Consolas", Font.PLAIN, 11));
		txtNome.setBounds(10, 25, 264, 30);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cargo:");
		lblNewLabel_1.setFont(new Font("Consolas", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 71, 264, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCargo = new JTextField();
		txtCargo.setFont(new Font("Consolas", Font.PLAIN, 11));
		txtCargo.setBounds(10, 85, 264, 30);
		contentPane.add(txtCargo);
		txtCargo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Salário");
		lblNewLabel_2.setFont(new Font("Consolas", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 130, 264, 14);
		contentPane.add(lblNewLabel_2);
		
		JFormattedTextField txtSalario = new JFormattedTextField(formatoSalario);
		txtSalario.setFont(new Font("Consolas", Font.PLAIN, 11));
		txtSalario.setBounds(10, 144, 264, 30);
		contentPane.add(txtSalario);
		
		JButton btnAdicionar = new JButton("Cadastrar");
		btnAdicionar.setForeground(new Color(255, 255, 255));
		btnAdicionar.setBackground(new Color(128, 128, 192));
		btnAdicionar.setFont(new Font("Consolas", Font.BOLD, 11));
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Number salarioNumero = (Number) txtSalario.getValue();
		        double salario = salarioNumero != null ? salarioNumero.doubleValue() : 0.0;

		        if (txtNome.getText().trim().isEmpty() || txtCargo.getText().trim().isEmpty() || salario == 0) {
					JOptionPane.showMessageDialog(btnAdicionar, "Algum campo não foi preenchido corretamente.", "Aviso", JOptionPane.WARNING_MESSAGE);
				}
				
				else {

					empresa.adicionarFuncionario(txtNome.getText(), txtCargo.getText(), salario);
					System.out.println(empresa.exibirFuncionarios());
					
			        funcionariosTexto = empresa.exibirFuncionarios();
	
			        System.out.println(funcionariosTexto);
	
			        if (telaDadosFunc == null || !telaDadosFunc.isVisible()) {
			        	telaDadosFunc = new TelaDadosFuncionarios(funcionariosTexto, empresa);
			        	telaDadosFunc.setModal(false);
			        	telaDadosFunc.setLocationRelativeTo(null);
			        	telaDadosFunc.setVisible(true);
			        } else {
			        	telaDadosFunc.atualizarDados(funcionariosTexto);
			        	telaDadosFunc.toFront();
			        }
			        txtNome.setText("");
			        txtCargo.setText("");
			        txtSalario.setText("");
				}
			}
		});
		btnAdicionar.setBounds(167, 185, 107, 35);
		contentPane.add(btnAdicionar);
	}
}
