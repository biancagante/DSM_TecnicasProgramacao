package br.com.fatecpg.swing.view;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.fatecpg.swing.model.Cliente;

public class CadastroForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_nome;
	private final ButtonGroup btnGroupSexo = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroForm frame = new CadastroForm();
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
	public CadastroForm() {
		setTitle("Formulário de Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_nome = new JLabel("Nome");
		lbl_nome.setBounds(25, 21, 51, 20);
		contentPane.add(lbl_nome);
		
		txt_nome = new JTextField();
		txt_nome.setBounds(65, 21, 236, 20);
		contentPane.add(txt_nome);
		txt_nome.setColumns(10);
		
		JLabel lbl_idade = new JLabel("Idade");
		lbl_idade.setBounds(24, 57, 43, 22);
		contentPane.add(lbl_idade);
		
		JSpinner spn_idade = new JSpinner();
		spn_idade.setBounds(22, 86, 43, 23);
		contentPane.add(spn_idade);
		
		JLabel lbl_sexo = new JLabel("Sexo");
		lbl_sexo.setBounds(117, 57, 43, 22);
		contentPane.add(lbl_sexo);
		
		JRadioButton rdb_sexo_mas = new JRadioButton("Masculino");
		rdb_sexo_mas.setSelected(true);
		rdb_sexo_mas.setBounds(115, 86, 99, 23);
		btnGroupSexo.add(rdb_sexo_mas);
		contentPane.add(rdb_sexo_mas);
		
		JRadioButton rdb_sexo_fem = new JRadioButton("Feminino");
		rdb_sexo_fem.setBounds(220, 86, 81, 23);
		btnGroupSexo.add(rdb_sexo_fem);
		contentPane.add(rdb_sexo_fem);
		
		JLabel lbl_resumo = new JLabel("");
		lbl_resumo.setBounds(10, 146, 315, 23);
		contentPane.add(lbl_resumo);
		
		JButton btn_cadastrar = new JButton("Cadastrar");
		btn_cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sexo = "";
				int idadeMenor = (int)spn_idade.getValue();
				int idadeMaior = (int)spn_idade.getValue();
				
				if (txt_nome.getText().isEmpty() || txt_nome.getText().isBlank() || (idadeMenor < 0 && idadeMaior > 120)) {
					lbl_resumo.setText("Você não preencheu algum dos campos corretamente.");
				}
				else {
					if (rdb_sexo_mas.isSelected()) {		
						sexo = "masculino";
					}
					else if (rdb_sexo_fem.isSelected()) {
						sexo = "feminino";
					}
					
					Cliente cliente = new Cliente(txt_nome.getText(), (int)spn_idade.getValue(), sexo);
					lbl_resumo.setText(cliente.toString());
				}
			}
		});
		btn_cadastrar.setBounds(199, 182, 126, 29);
		contentPane.add(btn_cadastrar);
		
		
	}
}
