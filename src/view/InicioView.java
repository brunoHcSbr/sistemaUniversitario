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

import banco.InicioAlunoDAO;
import model.Login;

public class InicioView extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Login login = new Login();

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioView frame = new InicioView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	JButton btn_InformPessoais = new JButton("");
	JButton btn_boletimMenu = new JButton("");
	JButton btn_BoletimMenu2 = new JButton("");
	JButton btn_infoPessoaisMenu = new JButton("");
	
	
	
	
	
	/**
	 * Create the frame.
	 */
	public InicioView() {
		
		
		
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
		lblNewLabel.setBounds(46, 282, 49, 23);
		panel.add(lblNewLabel);
		
		JLabel lblInformaesPesssoais = new JLabel("Informações Pesssoais");
		lblInformaesPesssoais.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInformaesPesssoais.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformaesPesssoais.setForeground(Color.WHITE);
		lblInformaesPesssoais.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblInformaesPesssoais.setBounds(46, 330, 215, 23);
		panel.add(lblInformaesPesssoais);
		
		JLabel lblBoletim = new JLabel("Boletim");
		lblBoletim.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBoletim.setHorizontalAlignment(SwingConstants.LEFT);
		lblBoletim.setForeground(Color.WHITE);
		lblBoletim.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblBoletim.setBounds(46, 381, 69, 23);
		panel.add(lblBoletim);
		
		JLabel lbl_Nome = new JLabel("------ Nome Aluno -------");
		lbl_Nome.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Nome.setForeground(new Color(55, 255, 115));
		lbl_Nome.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lbl_Nome.setBounds(10, 57, 276, 23);
		panel.add(lbl_Nome);
		
		JLabel lbl_RaDescricao = new JLabel("RA");
		lbl_RaDescricao.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_RaDescricao.setForeground(Color.WHITE);
		lbl_RaDescricao.setFont(new Font("Arial Black", Font.BOLD, 14));
		lbl_RaDescricao.setBounds(57, 87, 25, 23);
		panel.add(lbl_RaDescricao);
		
		JLabel lbl_RA = new JLabel("-----RA ALUNO----");
		lbl_RA.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_RA.setForeground(new Color(55, 255, 115));
		lbl_RA.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		lbl_RA.setBounds(46, 90, 196, 23);
		panel.add(lbl_RA);
		
		JLabel lbl_AlunoDescricao = new JLabel("Aluno");
		lbl_AlunoDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_AlunoDescricao.setForeground(Color.WHITE);
		lbl_AlunoDescricao.setFont(new Font("Arial Black", Font.BOLD, 14));
		lbl_AlunoDescricao.setBounds(10, 23, 266, 23);
		panel.add(lbl_AlunoDescricao);
		
		lbl_RA.setText(""+ LoginView2.getRA());

		InicioAlunoDAO alunoDAO = new InicioAlunoDAO();
		alunoDAO.listarAluno(LoginView2.getRA());
		
		//InformaAluno informaAluno = new InformaAluno();
		lbl_Nome.setText(""+ alunoDAO.getNomeAluno());
		btn_boletimMenu.setBorderPainted(false);
		
		btn_boletimMenu.addActionListener(this);
		btn_boletimMenu.setContentAreaFilled(false);
		btn_boletimMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_boletimMenu.setBounds(41, 381, 81, 23);
		panel.add(btn_boletimMenu);
		btn_InformPessoais.setBorderPainted(false);
		
		btn_InformPessoais.addActionListener(this);
		
		btn_InformPessoais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btn_InformPessoais.setContentAreaFilled(false);
		btn_InformPessoais.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_InformPessoais.setBounds(46, 330, 215, 23);
		panel.add(btn_InformPessoais);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBounds(47, 282, 68, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setIcon(new ImageIcon(InicioView.class.getResource("/resources/iconAluno.png")));
		lblNewLabel_1.setBounds(472, 221, 230, 180);
		containerFundo.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Informações Pessoais");
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_2.setBounds(484, 412, 251, 32);
		containerFundo.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.setIcon(new ImageIcon(InicioView.class.getResource("/resources/iconBoletim.jpg")));
		lblNewLabel_1_1.setBounds(919, 275, 120, 113);
		containerFundo.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("BOLETIM");
		lblNewLabel_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(931, 412, 125, 32);
		containerFundo.add(lblNewLabel_2_1);
		
		btn_infoPessoaisMenu.addActionListener(this);
		btn_infoPessoaisMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_infoPessoaisMenu.setContentAreaFilled(false);
		btn_infoPessoaisMenu.setBorderPainted(false);
		btn_infoPessoaisMenu.setBounds(472, 275, 241, 168);
		containerFundo.add(btn_infoPessoaisMenu);
		
		btn_BoletimMenu2.addActionListener(this);
		btn_BoletimMenu2.setContentAreaFilled(false);
		btn_BoletimMenu2.setBorderPainted(false);
		btn_BoletimMenu2.setBounds(860, 276, 241, 168);
		containerFundo.add(btn_BoletimMenu2);
	}







	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_InformPessoais || e.getSource() == btn_infoPessoaisMenu){
			InformacoesAlunoView informacoesAluno = new InformacoesAlunoView();
			informacoesAluno.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btn_boletimMenu || e.getSource() == btn_BoletimMenu2) {
			InserirNotaView  view = new InserirNotaView ();
			view.setVisible(true);
			this.dispose();
		}
		
		
		
	}
}
