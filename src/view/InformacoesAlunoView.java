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

import banco.InicioAlunoDAO;
import controller.AlunoController;

public class InformacoesAlunoView extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JButton btnBoletim = new JButton("");
	JButton btnInicio = new JButton("");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformacoesAlunoView frame = new InformacoesAlunoView();
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
	public InformacoesAlunoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1365, 792);
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
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblNewLabel.setBounds(46, 282, 49, 23);
		panel.add(lblNewLabel);
		
		JLabel lblInformaesPesssoais = new JLabel("Informações Pesssoais");
		lblInformaesPesssoais.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInformaesPesssoais.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformaesPesssoais.setForeground(new Color(34, 255, 112));
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
		
		JLabel lbl_Nome = new JLabel("null");
		lbl_Nome.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Nome.setForeground(new Color(0, 255, 134));
		lbl_Nome.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lbl_Nome.setBounds(10, 57, 276, 23);
		panel.add(lbl_Nome);
		
		JLabel lbl_RaDescricao = new JLabel("RA");
		lbl_RaDescricao.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_RaDescricao.setForeground(Color.WHITE);
		lbl_RaDescricao.setFont(new Font("Arial Black", Font.BOLD, 14));
		lbl_RaDescricao.setBounds(57, 87, 25, 23);
		panel.add(lbl_RaDescricao);
		
		JLabel lbl_RA = new JLabel("null");
		lbl_RA.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_RA.setForeground(new Color(0, 255, 134));
		lbl_RA.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		lbl_RA.setBounds(46, 90, 196, 23);
		panel.add(lbl_RA);
		
		lbl_RA.setText(""+ LoginView2.getRA());
		
		JLabel lbl_AlunoDescricao = new JLabel("Aluno");
		lbl_AlunoDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_AlunoDescricao.setForeground(Color.WHITE);
		lbl_AlunoDescricao.setFont(new Font("Arial Black", Font.BOLD, 14));
		lbl_AlunoDescricao.setBounds(10, 23, 266, 23);
		panel.add(lbl_AlunoDescricao);
		
		btnBoletim.addActionListener(this);
		btnBoletim.setBorderPainted(false);
		btnBoletim.setContentAreaFilled(false);
		btnBoletim.setBounds(41, 381, 81, 23);
		panel.add(btnBoletim);
		
		JButton btn_InformPessoais = new JButton("");
		btn_InformPessoais.setBorderPainted(false);
		btn_InformPessoais.setContentAreaFilled(false);
		btn_InformPessoais.setBounds(46, 330, 215, 23);
		panel.add(btn_InformPessoais);
		
		btnInicio.addActionListener(this);
		btnInicio.setBorderPainted(false);
		btnInicio.setContentAreaFilled(false);
		btnInicio.setBounds(47, 282, 55, 23);
		panel.add(btnInicio);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(128, 128, 128)));
		panel_1.setBounds(350, 61, 976, 656);
		containerFundo.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(63, 58, 155, 114);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\seifd\\Downloads\\4519678.jpg"));
		
		JLabel lblNewLabel_2 = new JLabel("INFORMAÇÕES PESSOAIS");
		lblNewLabel_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setBounds(382, 21, 488, 37);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(382, 100, 471, 25);
		panel_1.add(panel_2);
		
		JLabel lbl_nomeInfo = new JLabel("Bruno Henrique Correia da Silva");
		lbl_nomeInfo.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2.add(lbl_nomeInfo);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1.setBackground(new Color(192, 192, 192));
		panel_2_1.setBounds(382, 152, 155, 25);
		panel_1.add(panel_2_1);
		
		JLabel lbl_cpfInfo = new JLabel("CPF");
		lbl_cpfInfo.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_1.add(lbl_cpfInfo);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_2.setBounds(382, 203, 191, 25);
		panel_1.add(panel_2_2);
		
		JLabel lbl_TelefoneInfo = new JLabel("TELL");
		lbl_TelefoneInfo.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_2.add(lbl_TelefoneInfo);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_3.setBounds(382, 370, 170, 25);
		panel_1.add(panel_2_3);
		
		JLabel lbl_cepInfo = new JLabel("CEP");
		lbl_cepInfo.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_3.add(lbl_cepInfo);
		
		JLabel lblNewLabel_3 = new JLabel("NOME");
		lblNewLabel_3.setForeground(new Color(128, 128, 128));
		lblNewLabel_3.setBounds(335, 100, 37, 23);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		
		JLabel lblNewLabel_3_1 = new JLabel("CPF");
		lblNewLabel_3_1.setForeground(Color.GRAY);
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(345, 149, 25, 23);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("DATA DE NASCIMENTO");
		lblNewLabel_3_1_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_1.setBounds(547, 154, 152, 23);
		panel_1.add(lblNewLabel_3_1_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(new Color(192, 192, 192));
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_1.setBounds(709, 152, 144, 25);
		panel_1.add(panel_2_1_1);
		
		JLabel lbl_dataInfo = new JLabel("DATA");
		lbl_dataInfo.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_1_1.add(lbl_dataInfo);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("TELEFONE");
		lblNewLabel_3_1_2.setForeground(Color.GRAY);
		lblNewLabel_3_1_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2.setBounds(299, 205, 73, 23);
		panel_1.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("E-MAIL");
		lblNewLabel_3_1_2_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2_1.setBounds(593, 205, 54, 23);
		panel_1.add(lblNewLabel_3_1_2_1);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_2_1.setBounds(647, 203, 206, 25);
		panel_1.add(panel_2_2_1);
		
		JLabel lbl_emailInfo = new JLabel("EMAIL");
		lbl_emailInfo.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_2_1.add(lbl_emailInfo);
		
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
		
		JLabel lbl_bairroInfo = new JLabel("BAIRRO");
		lbl_bairroInfo.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_4.add(lbl_bairroInfo);
		
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
		
		JLabel lbl_ruaInfo = new JLabel("RUA");
		lbl_ruaInfo.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_3_1.add(lbl_ruaInfo);
		
		JLabel lblNewLabel_3_1_2_2_3 = new JLabel("N°");
		lblNewLabel_3_1_2_2_3.setForeground(Color.GRAY);
		lblNewLabel_3_1_2_2_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2_2_3.setBounds(602, 406, 14, 23);
		panel_1.add(lblNewLabel_3_1_2_2_3);
		
		JPanel panel_2_3_2 = new JPanel();
		panel_2_3_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_3_2.setBounds(626, 404, 54, 25);
		panel_1.add(panel_2_3_2);
		
		JLabel lbl_numeroCasaInfo = new JLabel("N°");
		lbl_numeroCasaInfo.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_3_2.add(lbl_numeroCasaInfo);
		
		JLabel lblNewLabel_3_1_2_2_2_1 = new JLabel("CIDADE");
		lblNewLabel_3_1_2_2_2_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_2_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2_2_2_1.setBounds(318, 444, 54, 23);
		panel_1.add(lblNewLabel_3_1_2_2_2_1);
		
		JPanel panel_2_3_1_1 = new JPanel();
		panel_2_3_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_3_1_1.setBounds(382, 442, 210, 25);
		panel_1.add(panel_2_3_1_1);
		
		JLabel lbl_cidadeInfo = new JLabel("CIDADE");
		lbl_cidadeInfo.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_3_1_1.add(lbl_cidadeInfo);
		
		JLabel lblNewLabel_3_1_2_2_3_1 = new JLabel("UF");
		lblNewLabel_3_1_2_2_3_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_2_2_3_1.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel_3_1_2_2_3_1.setBounds(605, 444, 25, 23);
		panel_1.add(lblNewLabel_3_1_2_2_3_1);
		
		JPanel panel_2_3_2_1 = new JPanel();
		panel_2_3_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_3_2_1.setBounds(626, 442, 54, 25);
		panel_1.add(panel_2_3_2_1);
		
		JLabel lbl_ufInfo = new JLabel("UF");
		lbl_ufInfo.setFont(new Font("Arial", Font.BOLD, 11));
		panel_2_3_2_1.add(lbl_ufInfo);
		
		InicioAlunoDAO alunoDAO = new InicioAlunoDAO();
		alunoDAO.listarAluno(LoginView2.getRA());
		
		AlunoController aController = new AlunoController();
		aController.consultaAluno(LoginView2.getRA());
		
		
		lbl_Nome.setText(""+ alunoDAO.getNomeAluno());
		lbl_nomeInfo.setText(""+ alunoDAO.getNomeAluno());
		lbl_cpfInfo.setText(""+ alunoDAO.getCpfAluno());
		lbl_cepInfo.setText(""+alunoDAO.getCepAluno());
		lbl_ruaInfo.setText(""+aController.getRua());
		lbl_ufInfo.setText(""+alunoDAO.getUfAluno());
		lbl_cidadeInfo.setText(""+alunoDAO.getCidadeAluno());
		lbl_bairroInfo.setText(""+alunoDAO.getBairroAluno());
		lbl_numeroCasaInfo.setText(""+alunoDAO.getNumCasaAluno());
		lbl_TelefoneInfo.setText(""+aController.getTelefone());
		lbl_emailInfo.setText(""+aController.getEmail());
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnBoletim ){
			
		}
		else if(e.getSource() == btnInicio) {
			InicioView view = new InicioView();
			view.setVisible(true);
			this.dispose();
		}
		
		
	}
}
