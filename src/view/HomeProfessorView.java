package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import banco.InicioProfessorDAO;

public class HomeProfessorView extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeProfessorView frame = new HomeProfessorView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	JButton btn_InformaPessoais = new JButton("");
	JButton btn_ModeloNota = new JButton("");
	JButton btn_InserirNotas = new JButton("");
	JButton btnVoltar = new JButton("New button");
	/**
	 * Create the frame.
	 */
	public HomeProfessorView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1365, 781);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel containerFundo = new JPanel();
		containerFundo.setLayout(null);
		containerFundo.setBackground(Color.WHITE);
		containerFundo.setBounds(0, 0, 1348, 746);
		contentPane.add(containerFundo);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(69, 69, 69));
		panel.setBounds(-12, -11, 286, 757);
		containerFundo.add(panel);
		
		JLabel lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(new Color(0, 255, 83));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblNewLabel.setBounds(47, 300, 49, 23);
		panel.add(lblNewLabel);
		
		JLabel lblInformaesPesssoais = new JLabel("Informações Pesssoais");
		lblInformaesPesssoais.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInformaesPesssoais.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformaesPesssoais.setForeground(Color.WHITE);
		lblInformaesPesssoais.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblInformaesPesssoais.setBounds(47, 334, 215, 23);
		panel.add(lblInformaesPesssoais);
		
		JLabel lbl_InserirNotas = new JLabel("Inserir Modelos de Notas");
		lbl_InserirNotas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_InserirNotas.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_InserirNotas.setForeground(Color.WHITE);
		lbl_InserirNotas.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lbl_InserirNotas.setBounds(47, 375, 214, 23);
		panel.add(lbl_InserirNotas);
		
		JLabel lbl_Professor = new JLabel("null");
		lbl_Professor.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Professor.setForeground(new Color(55, 255, 115));
		lbl_Professor.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lbl_Professor.setBounds(10, 57, 276, 23);
		panel.add(lbl_Professor);
		
		JLabel lbl_RaDescricao = new JLabel("Matricula");
		lbl_RaDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_RaDescricao.setForeground(Color.WHITE);
		lbl_RaDescricao.setFont(new Font("Arial Black", Font.BOLD, 14));
		lbl_RaDescricao.setBounds(10, 91, 276, 23);
		panel.add(lbl_RaDescricao);
		
		JLabel lbl_Matricula = new JLabel("null");
		lbl_Matricula.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Matricula.setForeground(new Color(55, 255, 115));
		lbl_Matricula.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		lbl_Matricula.setBounds(10, 120, 276, 23);
		panel.add(lbl_Matricula);
		
		JLabel lbl_AlunoDescricao = new JLabel("Professor");
		lbl_AlunoDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_AlunoDescricao.setForeground(Color.WHITE);
		lbl_AlunoDescricao.setFont(new Font("Arial Black", Font.BOLD, 14));
		lbl_AlunoDescricao.setBounds(10, 23, 266, 23);
		panel.add(lbl_AlunoDescricao);
		
		JButton btnInicio = new JButton("");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInicio.setContentAreaFilled(false);
		btnInicio.setBorderPainted(false);
		btnInicio.setBounds(47, 300, 68, 23);
		panel.add(btnInicio);
		
		JLabel lbl_InserirNotas_1_1 = new JLabel("Inserir Notas");
		lbl_InserirNotas_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_InserirNotas_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_InserirNotas_1_1.setForeground(Color.WHITE);
		lbl_InserirNotas_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lbl_InserirNotas_1_1.setBounds(47, 421, 197, 23);
		panel.add(lbl_InserirNotas_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(HomeProfessorView.class.getResource("/resources/iconPerfil.jpg")));
		lblNewLabel_1.setBounds(454, 58, 151, 113);
		containerFundo.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Informações Pessoais");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_2.setBounds(432, 171, 251, 32);
		containerFundo.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(HomeProfessorView.class.getResource("/resources/iconBoletim.jpg")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(876, 58, 120, 113);
		containerFundo.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Inserir Notas");
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(863, 171, 151, 32);
		containerFundo.add(lblNewLabel_2_1);
		
		JButton btn_infoPessoaisMenu = new JButton("");
		btn_infoPessoaisMenu.setContentAreaFilled(false);
		btn_infoPessoaisMenu.setBorderPainted(false);
		btn_infoPessoaisMenu.setBounds(419, 34, 241, 168);
		containerFundo.add(btn_infoPessoaisMenu);
		
		JButton btn_InserirNotasMenu = new JButton("");
		btn_InserirNotasMenu.setContentAreaFilled(false);
		btn_InserirNotasMenu.setBorderPainted(false);
		btn_InserirNotasMenu.setBounds(807, 35, 241, 168);
		containerFundo.add(btn_InserirNotasMenu);
		
		
		// Mudando a Label do Professor //
		
		
		
		InicioProfessorDAO inicioProfessor = new InicioProfessorDAO();
		inicioProfessor.listarProfessor(LoginView2.getMatricula());
		lbl_Matricula.setText(""+ LoginView2.getMatricula());
		
		lbl_Professor.setText(""+ inicioProfessor.getNomeProfessor());
		
		btn_InformaPessoais.addActionListener(this);
		
		btn_InformaPessoais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btn_InformaPessoais.setBorderPainted(false);
		btn_InformaPessoais.setContentAreaFilled(false);
		btn_InformaPessoais.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_InformaPessoais.setBounds(47, 334, 197, 23);
		panel.add(btn_InformaPessoais);
		
		btn_ModeloNota.addActionListener(this);
		
		btn_ModeloNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btn_ModeloNota.setBorderPainted(false);
		btn_ModeloNota.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ModeloNota.setContentAreaFilled(false);
		btn_ModeloNota.setBounds(47, 375, 197, 23);
		panel.add(btn_ModeloNota);
		
		btn_InserirNotas.addActionListener(this);
		
		btn_InserirNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btn_InserirNotas.setBorderPainted(false);
		btn_InserirNotas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_InserirNotas.setContentAreaFilled(false);
		btn_InserirNotas.setBounds(47, 421, 115, 23);
		panel.add(btn_InserirNotas);
		
		JLabel lblVoltar = new JLabel("New label");
		lblVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVoltar.setIcon(new ImageIcon(HomeProfessorView.class.getResource("/resources/iconVoltar.png")));
		lblVoltar.setBounds(1196, 11, 126, 100);
		containerFundo.add(lblVoltar);
		
		btnVoltar.addActionListener(this);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBounds(1196, 11, 126, 100);
		containerFundo.add(btnVoltar);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Inserir Modelos de Notas");
		lblNewLabel_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_2_1_1.setBounds(437, 430, 268, 32);
		containerFundo.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(HomeProfessorView.class.getResource("/resources/iconBoletim.jpg")));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(454, 289, 206, 113);
		containerFundo.add(lblNewLabel_1_1_1);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_InformaPessoais ){
			InformacoesProfessorView view = new InformacoesProfessorView();
			view.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btn_InserirNotas ) {
			InserirNotaView  view = new InserirNotaView ();
			view.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btn_ModeloNota) {
			
			ModeloNotaView modeloNota = new ModeloNotaView();
			modeloNota.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btnVoltar) {
			
			LoginView2 login = new LoginView2();
			login.setVisible(true);
			this.dispose();
		}
		
		
	}
}
