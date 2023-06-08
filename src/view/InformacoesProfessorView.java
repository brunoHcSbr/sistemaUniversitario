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
import javax.swing.border.LineBorder;

import controller.ProfessorController;

public class InformacoesProfessorView extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JButton btn_ModeloNota = new JButton("");
	JButton btnInicio = new JButton("");
	JButton btn_InserirNotas = new JButton("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformacoesProfessorView frame = new InformacoesProfessorView();
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
	public InformacoesProfessorView() {
		
		
		ProfessorController pController = new ProfessorController();
		pController.consultarProfessor(LoginView2.getMatricula());
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 777);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel containerFundo = new JPanel();
		containerFundo.setLayout(null);
		containerFundo.setBackground(Color.WHITE);
		containerFundo.setBounds(0, 0, 1348, 753);
		contentPane.add(containerFundo);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(69, 69, 69));
		panel.setBounds(-12, -11, 286, 757);
		containerFundo.add(panel);
		
		JLabel lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(46, 282, 49, 23);
		panel.add(lblNewLabel);
		
		JLabel lblInformaesPesssoais = new JLabel("Informações Pesssoais");
		lblInformaesPesssoais.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInformaesPesssoais.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformaesPesssoais.setForeground(new Color(34, 255, 112));
		lblInformaesPesssoais.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblInformaesPesssoais.setBounds(46, 330, 215, 23);
		panel.add(lblInformaesPesssoais);
		
		JButton btn_InformPessoais = new JButton("");
		btn_InformPessoais.setContentAreaFilled(false);
		btn_InformPessoais.setBorderPainted(false);
		btn_InformPessoais.setBounds(46, 330, 215, 23);
		panel.add(btn_InformPessoais);
		
		btnInicio.addActionListener(this);
		btnInicio.setContentAreaFilled(false);
		btnInicio.setBorderPainted(false);
		btnInicio.setBounds(47, 282, 55, 23);
		panel.add(btnInicio);
		
		JLabel lbl_InserirNotas = new JLabel("Inserir Modelos de Notas");
		lbl_InserirNotas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_InserirNotas.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_InserirNotas.setForeground(Color.WHITE);
		lbl_InserirNotas.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lbl_InserirNotas.setBounds(46, 379, 214, 23);
		panel.add(lbl_InserirNotas);
		
		btn_ModeloNota.addActionListener(this);
		btn_ModeloNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_ModeloNota.setContentAreaFilled(false);
		btn_ModeloNota.setBorderPainted(false);
		btn_ModeloNota.setBounds(46, 379, 215, 23);
		panel.add(btn_ModeloNota);
		
		JLabel lbl_InserirNotas_1_1 = new JLabel("Inserir Notas");
		lbl_InserirNotas_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_InserirNotas_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_InserirNotas_1_1.setForeground(Color.WHITE);
		lbl_InserirNotas_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lbl_InserirNotas_1_1.setBounds(44, 425, 197, 23);
		panel.add(lbl_InserirNotas_1_1);
		
		btn_InserirNotas.addActionListener(this);
		btn_InserirNotas.setContentAreaFilled(false);
		btn_InserirNotas.setBorderPainted(false);
		btn_InserirNotas.setBounds(46, 425, 115, 23);
		panel.add(btn_InserirNotas);
		
		JLabel lbl_AlunoDescricao = new JLabel("Professor");
		lbl_AlunoDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_AlunoDescricao.setForeground(Color.WHITE);
		lbl_AlunoDescricao.setFont(new Font("Arial Black", Font.BOLD, 14));
		lbl_AlunoDescricao.setBounds(20, 26, 266, 23);
		panel.add(lbl_AlunoDescricao);
		
		JLabel lbl_Professor = new JLabel("null");
		lbl_Professor.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Professor.setForeground(new Color(55, 255, 115));
		lbl_Professor.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lbl_Professor.setBounds(10, 53, 276, 23);
		panel.add(lbl_Professor);
		
		JLabel lbl_RaDescricao = new JLabel("Matricula");
		lbl_RaDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_RaDescricao.setForeground(Color.WHITE);
		lbl_RaDescricao.setFont(new Font("Arial Black", Font.BOLD, 14));
		lbl_RaDescricao.setBounds(10, 81, 276, 23);
		panel.add(lbl_RaDescricao);
		
		JLabel lbl_Matricula = new JLabel("null");
		lbl_Matricula.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Matricula.setForeground(new Color(55, 255, 115));
		lbl_Matricula.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		lbl_Matricula.setBounds(10, 115, 276, 23);
		panel.add(lbl_Matricula);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(128, 128, 128)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(350, 61, 976, 656);
		containerFundo.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(InformacoesProfessorView.class.getResource("/resources/iconProfessor.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(58, 21, 177, 156);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("INFORMAÇÕES PESSOAIS");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setBounds(382, 21, 488, 37);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(321, 100, 532, 25);
		panel_1.add(panel_2);
		
		JLabel lblNome = new JLabel("null");
		lblNome.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2.add(lblNome);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1.setBounds(321, 154, 155, 25);
		panel_1.add(panel_2_1);
		
		JLabel lblCPF = new JLabel("null");
		lblCPF.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_1.add(lblCPF);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_2.setBounds(321, 242, 191, 25);
		panel_1.add(panel_2_2);
		
		JLabel lblTelefone = new JLabel("TELL");
		lblTelefone.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_2.add(lblTelefone);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_3.setBounds(382, 370, 170, 25);
		panel_1.add(panel_2_3);
		
		JLabel lblCep = new JLabel("null");
		lblCep.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_3.add(lblCep);
		
		JLabel lblNewLabel_3 = new JLabel("NOME");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3.setBounds(274, 100, 37, 23);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("CPF");
		lblNewLabel_3_1.setForeground(Color.GRAY);
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(286, 154, 25, 23);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("DATA DE NASCIMENTO");
		lblNewLabel_3_1_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_1.setBounds(493, 154, 152, 23);
		panel_1.add(lblNewLabel_3_1_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1_1.setBounds(655, 152, 198, 25);
		panel_1.add(panel_2_1_1);
		
		JLabel lblData = new JLabel("DATA");
		lblData.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_1_1.add(lblData);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("TELEFONE");
		lblNewLabel_3_1_2.setForeground(Color.GRAY);
		lblNewLabel_3_1_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2.setBounds(238, 244, 73, 23);
		panel_1.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("E-MAIL");
		lblNewLabel_3_1_2_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2_1.setBounds(585, 242, 54, 23);
		panel_1.add(lblNewLabel_3_1_2_1);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_2_1.setBounds(647, 240, 206, 25);
		panel_1.add(panel_2_2_1);
		panel_2_2_1.setLayout(null);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(10, 6, 186, 13);
		lblEmail.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_2_1.add(lblEmail);
		
		JLabel lblNewLabel_2_1 = new JLabel("Localização");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.GRAY);
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(382, 322, 488, 37);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1_2_2 = new JLabel("CEP");
		lblNewLabel_3_1_2_2.setForeground(Color.GRAY);
		lblNewLabel_3_1_2_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2_2.setBounds(340, 372, 32, 23);
		panel_1.add(lblNewLabel_3_1_2_2);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_4.setBounds(626, 370, 244, 25);
		panel_1.add(panel_2_4);
		
		JLabel lblBairro = new JLabel("null");
		lblBairro.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_4.add(lblBairro);
		
		JLabel lblNewLabel_3_1_2_2_1 = new JLabel("BAIRRO");
		lblNewLabel_3_1_2_2_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2_2_1.setBounds(562, 372, 54, 23);
		panel_1.add(lblNewLabel_3_1_2_2_1);
		
		JLabel lblNewLabel_3_1_2_2_2 = new JLabel("RUA");
		lblNewLabel_3_1_2_2_2.setForeground(Color.GRAY);
		lblNewLabel_3_1_2_2_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2_2_2.setBounds(335, 406, 37, 23);
		panel_1.add(lblNewLabel_3_1_2_2_2);
		
		JPanel panel_2_3_1 = new JPanel();
		panel_2_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_3_1.setBounds(382, 406, 210, 25);
		panel_1.add(panel_2_3_1);
		
		JLabel lblRua = new JLabel("null");
		lblRua.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_3_1.add(lblRua);
		
		JLabel lblNewLabel_3_1_2_2_3 = new JLabel("N°");
		lblNewLabel_3_1_2_2_3.setForeground(Color.GRAY);
		lblNewLabel_3_1_2_2_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2_2_3.setBounds(602, 406, 14, 23);
		panel_1.add(lblNewLabel_3_1_2_2_3);
		
		JPanel panel_2_3_2 = new JPanel();
		panel_2_3_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_3_2.setBounds(626, 404, 54, 25);
		panel_1.add(panel_2_3_2);
		
		JLabel lblNumero = new JLabel("null");
		lblNumero.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_3_2.add(lblNumero);
		
		JLabel lblNewLabel_3_1_2_2_2_1 = new JLabel("CIDADE");
		lblNewLabel_3_1_2_2_2_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_2_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2_2_2_1.setBounds(318, 444, 54, 23);
		panel_1.add(lblNewLabel_3_1_2_2_2_1);
		
		JPanel panel_2_3_1_1 = new JPanel();
		panel_2_3_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_3_1_1.setBounds(382, 442, 210, 25);
		panel_1.add(panel_2_3_1_1);
		
		JLabel lblCidade = new JLabel("null");
		lblCidade.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_3_1_1.add(lblCidade);
		
		JLabel lblNewLabel_3_1_2_2_3_1 = new JLabel("UF");
		lblNewLabel_3_1_2_2_3_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_2_2_3_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2_2_3_1.setBounds(605, 444, 25, 23);
		panel_1.add(lblNewLabel_3_1_2_2_3_1);
		
		JPanel panel_2_3_2_1 = new JPanel();
		panel_2_3_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_3_2_1.setBounds(626, 442, 54, 25);
		panel_1.add(panel_2_3_2_1);
		
		JLabel lblUf = new JLabel("null");
		lblUf.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_3_2_1.add(lblUf);
		
		JPanel panel_2_2_2 = new JPanel();
		panel_2_2_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_2_2.setBounds(321, 200, 191, 25);
		panel_1.add(panel_2_2_2);
		
		JLabel lblRG = new JLabel("TELL");
		lblRG.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_2_2.add(lblRG);
		
		JPanel panel_2_2_2_1 = new JPanel();
		panel_2_2_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_2_2_1.setBounds(647, 200, 191, 25);
		panel_1.add(panel_2_2_2_1);
		
		JLabel lblCategoria = new JLabel("TELL");
		lblCategoria.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_2_2_1.add(lblCategoria);
		
		JLabel lblNewLabel_3_1_2_1_1 = new JLabel("Categoria");
		lblNewLabel_3_1_2_1_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2_1_1.setBounds(562, 200, 77, 23);
		panel_1.add(lblNewLabel_3_1_2_1_1);
		
		JLabel lblNewLabel_3_1_2_1_1_1 = new JLabel("RG");
		lblNewLabel_3_1_2_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2_1_1_1.setBounds(238, 202, 73, 23);
		panel_1.add(lblNewLabel_3_1_2_1_1_1);
		
		lblNome.setText(""+ pController.getNome());
		lbl_Professor.setText(""+ pController.getNome());
		lbl_Matricula.setText(""+ LoginView2.getMatricula());
		lblCPF.setText(""+ pController.getCpf());
		lblRG.setText(""+ pController.getRg());
		lblData.setText(""+ pController.getDataNasc());
		lblBairro.setText(""+ pController.getBairro());
		lblRua.setText(""+ pController.getRua());
		lblNumero.setText(""+ pController.getNumeroCasa());
		lblCategoria.setText(""+ pController.getCategoria());
		lblCep.setText(""+ pController.getCep());
		lblCidade.setText(""+ pController.getCidade());
		lblUf.setText(""+ pController.getUf());
		lblTelefone.setText(""+ pController.getTelefone());
		lblEmail.setText(""+ pController.getEmail());
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_ModeloNota ){
			ModeloNotaView modelo = new ModeloNotaView();
			modelo.setVisible(true);
			
			this.dispose();
		}
		else if(e.getSource() == btn_InserirNotas ) {
			InserirNotaView view = new InserirNotaView ();
			view.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btnInicio) {
			
			HomeProfessorView home = new HomeProfessorView();
			home.setVisible(true);
			this.dispose();
		}
		
		
	}
}
