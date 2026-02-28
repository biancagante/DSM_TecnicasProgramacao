package br.com.fatecpg.associacaolistas.view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.fatecpg.associacaolistas.model.*;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.util.Locale;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JFrame {
	Cliente[] clientes = new Cliente[5];

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JButton btnAdicionar;
	private JLabel lblNomeIncorreto;
	private JLabel lblEmailIncorreto;
	
	Empresa ficticia = new Empresa("Fictícia", "123456XX");
	String listagemClientes = ficticia.exibirClientes();
	TelaClientes tela = new TelaClientes(listagemClientes);
	private JLabel lblLink;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setTitle("Cliente - Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Consolas", Font.BOLD, 12));
		lblNome.setBounds(10, 16, 74, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Consolas", Font.BOLD, 12));
		lblEmail.setBounds(10, 88, 74, 14);
		contentPane.add(lblEmail);
		
		txtNome = new JTextField();
		lblNome.setLabelFor(txtNome);
		txtNome.setLocale(new Locale("pt", "BR"));
		txtNome.setFont(new Font("Consolas", Font.PLAIN, 12));
		txtNome.setBounds(10, 30, 264, 30);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		lblEmail.setLabelFor(txtEmail);
		txtEmail.setLocale(new Locale("pt", "BR"));
		txtEmail.setFont(new Font("Consolas", Font.PLAIN, 12));
		txtEmail.setBounds(10, 103, 264, 30);
		contentPane.add(txtEmail);
		
		lblNomeIncorreto = new JLabel("");
		lblNomeIncorreto.setFont(new Font("Consolas", Font.ITALIC, 10));
		lblNomeIncorreto.setBounds(10, 63, 264, 14);
		contentPane.add(lblNomeIncorreto);
		
		lblEmailIncorreto = new JLabel("");
		lblEmailIncorreto.setFont(new Font("Consolas", Font.ITALIC, 10));
		lblEmailIncorreto.setBounds(10, 137, 264, 14);
		contentPane.add(lblEmailIncorreto);
		
		btnAdicionar = new JButton("Adicionar Cliente");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNome.getText().trim().isEmpty()) {
					lblNomeIncorreto.setText("Campo vazio!");
				}
				else if (txtEmail.getText().trim().isEmpty()) {
					lblEmailIncorreto.setText("Campo vazio!");
				}
				
				else {
					lblNomeIncorreto.setText("");
					lblEmailIncorreto.setText("");
					
					ficticia.adicionarCliente(txtNome.getText(), txtEmail.getText());
					
			        txtNome.setText("");
			        txtEmail.setText("");
	
			        String clientesTexto = ficticia.exibirClientes();
			        System.out.println(clientesTexto);
	
			        if (tela == null || !tela.isVisible()) {
			            tela = new TelaClientes(clientesTexto);
			            tela.setModal(false);
			            tela.setLocationRelativeTo(null);
			            tela.setVisible(true);
			        } else {
			            tela.atualizarLista(clientesTexto);
			            tela.toFront();
			        }
				}
			}
		});
		
		btnAdicionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar.setForeground(new Color(255, 255, 255));
		btnAdicionar.setBackground(new Color(128, 128, 255));
		btnAdicionar.setToolTipText("Adicione um novo cliente");
		btnAdicionar.setFont(new Font("Consolas", Font.BOLD, 12));
		btnAdicionar.setBounds(102, 159, 172, 30);
		contentPane.add(btnAdicionar);
		
		lblLink = new JLabel("<html><u>Funcionários<u></html>");
		lblLink.setForeground(new Color(0, 0, 255));
		lblLink.setFont(new Font("Consolas", Font.PLAIN, 11));
		lblLink.setHorizontalAlignment(SwingConstants.CENTER);
		lblLink.setBounds(10, 206, 264, 14);
		contentPane.add(lblLink);
		lblLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				TelaFuncionarios telaFunc = new TelaFuncionarios(ficticia);
				telaFunc.setVisible(true);
				
			}
		});
	}
}
