package br.com.fatecpg.swing.view;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.com.fatecpg.swing.model.Usuario;

public class PreferenciasUsuario extends JFrame {
	private String tema = "Claro";
	private String notHabilitadas = "Sim";
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
		setBounds(100, 100, 254, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl_tema.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_tema.setBounds(20, 26, 77, 14);
		contentPane.add(lbl_tema);
		txr_exibir.setBackground(new Color(240, 240, 240));
		
		txr_exibir.setBounds(0, 0, 0, 0);
		contentPane.add(txr_exibir);
		cmb_tema.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
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
		chk_notificacoes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		chk_notificacoes.setSelected(true);
		chk_notificacoes.setHorizontalAlignment(SwingConstants.RIGHT);
		chk_notificacoes.setBounds(103, 67, 106, 23);
		contentPane.add(chk_notificacoes);
		sld_volume.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		sld_volume.setBounds(20, 141, 200, 26);
		contentPane.add(sld_volume);
		btn_salvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_salvar.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btn_salvar.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		
		btn_salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvarAlteracoes();
			}
		});
		btn_salvar.setBounds(139, 177, 89, 23);
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
			txr_exibir.setBackground(Color.DARK_GRAY);
			txr_exibir.setForeground(Color.WHITE);
			tema = "Escuro";
			return "Escuro";
		}
		else {
			getContentPane().setBackground(SystemColor.menu);
			lbl_tema.setForeground(Color.BLACK);
			lbl_notificacoes.setForeground(Color.BLACK);
			lbl_volume.setForeground(Color.BLACK);
			cmb_tema.setBackground(SystemColor.menu);
			cmb_tema.setForeground(Color.BLACK);
			chk_notificacoes.setBackground(SystemColor.menu);
			chk_notificacoes.setForeground(Color.BLACK);
			sld_volume.setBackground(SystemColor.menu);
			txr_exibir.setBackground(SystemColor.menu);
			txr_exibir.setForeground(Color.BLACK);
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
	
	public void salvarAlteracoes() {
		tema = setTema(cmb_tema.getSelectedIndex());
		notHabilitadas = isNotificacoesHabilitada();
		volume = getVolume();
		txr_exibir.setBounds(20, 178, 200, 68);
		setBounds(100, 100, 254, 323);
		btn_salvar.setBounds(139, 248, 89, 23);
		
		Usuario user = new Usuario(tema, notHabilitadas, volume);
		txr_exibir.setText(user.toString());
	}
}
