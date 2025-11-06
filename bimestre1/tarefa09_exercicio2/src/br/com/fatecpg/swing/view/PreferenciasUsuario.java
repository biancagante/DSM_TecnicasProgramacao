package br.com.fatecpg.swing.view;
import br.com.fatecpg.swing.model.Usuario;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class PreferenciasUsuario extends JFrame {
	private String tema = "Claro";
	private boolean notHabilitadas = true;
	private int volume = 50;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreferenciasUsuario frame = new PreferenciasUsuario();
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
	JLabel lbl_tema = new JLabel("Tema");
	JComboBox cmb_tema = new JComboBox();
	JLabel lbl_notificacoes = new JLabel("Notificações");
	JLabel lbl_volume = new JLabel("Volume");
	JCheckBox chk_notificacoes = new JCheckBox("Habilitadas");
	JSlider sld_volume = new JSlider();
	JButton btn_salvar = new JButton("Salvar");
	JTextArea txr_exibir = new JTextArea();
	
	public PreferenciasUsuario() {
		setTitle("Configurações");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 254, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl_tema.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_tema.setBounds(20, 26, 77, 14);
		contentPane.add(lbl_tema);
		
		cmb_tema.setBounds(139, 23, 70, 20);
		cmb_tema.setModel(new DefaultComboBoxModel(new String[] {"Claro", "Escuro"}));
		cmb_tema.setMaximumRowCount(2);
		contentPane.add(cmb_tema);
		cmb_tema.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	setTema(cmb_tema.getSelectedIndex());
		    }
		});
		
		lbl_notificacoes.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_notificacoes.setBounds(20, 71, 77, 14);
		contentPane.add(lbl_notificacoes);
		
		lbl_volume.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_volume.setBounds(20, 115, 77, 14);
		contentPane.add(lbl_volume);
		
		chk_notificacoes.setSelected(true);
		chk_notificacoes.setHorizontalAlignment(SwingConstants.RIGHT);
		chk_notificacoes.setBounds(103, 67, 106, 23);
		contentPane.add(chk_notificacoes);
		
		sld_volume.setBounds(20, 141, 200, 26);
		contentPane.add(sld_volume);
		
		txr_exibir.setBounds(20, 178, 200, 22);
		contentPane.add(txr_exibir);
		
		btn_salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Usuario user = new Usuario();
//				tema = setTema(temaEscolhido);
//				notHabilitadas = isNotificacoesHabilitada();
//				volume = getVolume();
				
				txr_exibir.setText(tema + " " + isNotificacoesHabilitada() + getVolume());
			}
		});
		btn_salvar.setBounds(142, 222, 89, 23);
		contentPane.add(btn_salvar);
	}
	
	public String setTema(int indiceTema) {
		if (indiceTema == 1) {
			getContentPane().setBackground(Color.DARK_GRAY);
			lbl_tema.setForeground(Color.WHITE);
			lbl_notificacoes.setForeground(Color.WHITE);
			lbl_volume.setForeground(Color.WHITE);
			cmb_tema.setBackground(Color.DARK_GRAY);
			cmb_tema.setForeground(Color.WHITE);
			chk_notificacoes.setBackground(Color.DARK_GRAY);
			chk_notificacoes.setForeground(Color.WHITE);
			sld_volume.setBackground(Color.DARK_GRAY);
			tema = "Escuro";
			return "Escuro";
		}
		else {
			getContentPane().setBackground(Color.WHITE);
			lbl_tema.setForeground(Color.BLACK);
			lbl_notificacoes.setForeground(Color.BLACK);
			lbl_volume.setForeground(Color.BLACK);
			cmb_tema.setBackground(Color.WHITE);
			cmb_tema.setForeground(Color.BLACK);
			chk_notificacoes.setBackground(Color.WHITE);
			chk_notificacoes.setForeground(Color.BLACK);
			sld_volume.setBackground(Color.WHITE);
			tema = "Claro";
			return "Claro";
		}
	}
	
	public String isNotificacoesHabilitada() {
		String notificacao = " ";
		if (chk_notificacoes.isSelected() == false) {
			notificacao = "Não";
		} 
		else { 
			notificacao = "Sim";
		}
		return notificacao;
	}
	
	public int getVolume() {
		return sld_volume.getValue();
	}
}
