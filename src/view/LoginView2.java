											package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.LoginController;

public class LoginView2 extends JFrame implements ActionListener {
	
	private String valSql;
	private static String RA;
	private static String Matricula;

	public static String getMatricula() {
		return Matricula;
	}

	public static void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public String getValSql() {
		return valSql;
	}

	public void setValSql(String valSql) {
		this.valSql = valSql;
	}

	public static String getRA() {
		return RA;
	}

	public static void setRA(String rA) {
		RA = rA;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_RA;
	public JTextField getTextField_RA() {
		return textField_RA;
	}

	public void setTextField_RA(JTextField textField_RA) {
		this.textField_RA = textField_RA;
	}

	public JPasswordField getPasswordField_RA() {
		return passwordField_RA;
	}

	public void setPasswordField_RA(JPasswordField passwordField_RA) {
		this.passwordField_RA = passwordField_RA;
	}

	public JTextField getTextField_Matricula() {
		return textField_Matricula;
	}

	public void setTextField_Matricula(JTextField textField_Matricula) {
		this.textField_Matricula = textField_Matricula;
	}

	public JPasswordField getPasswordField_Funcionario() {
		return passwordField_Funcionario;
	}

	public void setPasswordField_Funcionario(JPasswordField passwordField_Funcionario) {
		this.passwordField_Funcionario = passwordField_Funcionario;
	}

	private JPasswordField passwordField_RA;
	private JTextField textField_Matricula;
	private JPasswordField passwordField_Funcionario;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView2 frame = new LoginView2();
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
	JButton btn_entrarFuncionario = new JButton("Entrar");
	
	JButton btn_entrarAluno = new JButton("Entrar");
	
	public LoginView2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1365, 801);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel conteiner_fundo = new JPanel();
		conteiner_fundo.setBackground(Color.WHITE);
		conteiner_fundo.setBounds(0, 0, 1334, 754);
		contentPane.add(conteiner_fundo);
		conteiner_fundo.setLayout(null);
		
		JPanel container_aluno = new JPanel();
		container_aluno.setBounds(288, 261, 225, 47);
		container_aluno.setLayout(null);
		container_aluno.setBackground(new Color(0, 128, 128));
		conteiner_fundo.add(container_aluno);
		
		JLabel lbl_Aluno = new JLabel("Aluno");
		lbl_Aluno.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_Aluno.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Aluno.setForeground(Color.WHITE);
		lbl_Aluno.setFont(new Font("Arial", Font.BOLD, 20));
		lbl_Aluno.setBounds(80, 11, 63, 24);
		container_aluno.add(lbl_Aluno);
		
		JLabel lbl_ra = new JLabel("R.A");
		lbl_ra.setBounds(298, 319, 46, 14);
		lbl_ra.setForeground(Color.GRAY);
		lbl_ra.setFont(new Font("Arial", Font.BOLD, 15));
		conteiner_fundo.add(lbl_ra);
		
		textField_RA = new JTextField();
		textField_RA.setBounds(288, 337, 225, 34);
		textField_RA.setHorizontalAlignment(SwingConstants.CENTER);
		textField_RA.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_RA.setColumns(10);
		conteiner_fundo.add(textField_RA);
		
		JLabel lbl_senhaAluno = new JLabel("Senha");
		lbl_senhaAluno.setBounds(298, 382, 46, 14);
		lbl_senhaAluno.setForeground(Color.GRAY);
		lbl_senhaAluno.setFont(new Font("Arial", Font.BOLD, 15));
		conteiner_fundo.add(lbl_senhaAluno);
		
		passwordField_RA = new JPasswordField();
		passwordField_RA.setBounds(288, 407, 225, 30);
		passwordField_RA.setHorizontalAlignment(SwingConstants.CENTER);
		conteiner_fundo.add(passwordField_RA);
		
		
		btn_entrarAluno.setBounds(321, 482, 146, 47);
		
		btn_entrarAluno.addActionListener(this);
		
		
		btn_entrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				LoginController loginControll = new LoginController();
				loginControll.loginAluno(this);
				
				
				
				
			}
		});
		btn_entrarAluno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_entrarAluno.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_entrarAluno.setForeground(Color.WHITE);
		btn_entrarAluno.setFont(new Font("Arial", Font.BOLD, 14));
		btn_entrarAluno.setBackground(new Color(51, 255, 153));
		conteiner_fundo.add(btn_entrarAluno);
		
		JPanel container_funcionario = new JPanel();
		container_funcionario.setBounds(630, 261, 225, 47);
		container_funcionario.setLayout(null);
		container_funcionario.setBackground(new Color(0, 128, 128));
		conteiner_fundo.add(container_funcionario);
		
		JLabel lblFuncionario = new JLabel("Funcionario");
		lblFuncionario.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionario.setForeground(Color.WHITE);
		lblFuncionario.setFont(new Font("Arial", Font.BOLD, 20));
		lblFuncionario.setBounds(29, 11, 172, 24);
		container_funcionario.add(lblFuncionario);
		
		JLabel lbl_Matricula = new JLabel("Matricula");
		lbl_Matricula.setBounds(630, 320, 92, 14);
		lbl_Matricula.setForeground(Color.GRAY);
		lbl_Matricula.setFont(new Font("Arial", Font.BOLD, 15));
		conteiner_fundo.add(lbl_Matricula);
		
		textField_Matricula = new JTextField();
		textField_Matricula.setBounds(630, 337, 225, 34);
		textField_Matricula.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Matricula.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_Matricula.setColumns(10);
		conteiner_fundo.add(textField_Matricula);
		
		JLabel lbl_SenhaFuncionario = new JLabel("Senha");
		lbl_SenhaFuncionario.setBounds(630, 383, 46, 14);
		lbl_SenhaFuncionario.setForeground(Color.GRAY);
		lbl_SenhaFuncionario.setFont(new Font("Arial", Font.BOLD, 15));
		conteiner_fundo.add(lbl_SenhaFuncionario);
		
		passwordField_Funcionario = new JPasswordField();
		passwordField_Funcionario.setBounds(630, 412, 225, 30);
		passwordField_Funcionario.setHorizontalAlignment(SwingConstants.CENTER);
		conteiner_fundo.add(passwordField_Funcionario);
		
	
		btn_entrarFuncionario.addActionListener(this);
		
		
		btn_entrarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginController loginControll = new LoginController();
				loginControll.loginProfessor(this);
				
			}
		});
		btn_entrarFuncionario.setBounds(669, 482, 146, 47);
		btn_entrarFuncionario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_entrarFuncionario.setForeground(Color.WHITE);
		btn_entrarFuncionario.setFont(new Font("Arial", Font.BOLD, 14));
		btn_entrarFuncionario.setBackground(new Color(0, 255, 153));
		conteiner_fundo.add(btn_entrarFuncionario);
		
		JLabel lblFatec = new JLabel("New label");
		lblFatec.setBounds(43, 35, 391, 161);
		lblFatec.setHorizontalAlignment(SwingConstants.CENTER);
		lblFatec.setIcon(new ImageIcon("C:\\Users\\seifd\\Downloads\\7891db4bc8ef093b42767df592a00a22.jpg"));
		conteiner_fundo.add(lblFatec);
	}
	

	@SuppressWarnings("deprecation")
	@Override
	/**
	 * ActionEvent que irá puxar os metodos do LoginController para validar o login do estudante e funcionario
	 */
		public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_entrarFuncionario) {
			LoginController loginControll = new LoginController();
			
			if(textField_Matricula.getText().matches("") || passwordField_Funcionario.getText().matches("") ) {
				JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!");
			}
			else {
			
				
				if(loginControll.loginProfessor(this) == "Consultado") {
						
						JOptionPane.showInternalMessageDialog(null, "Seja Bem vindo!!!");
						
						setMatricula(LoginController.getValMatricula());
						HomeProfessorView professorView = new HomeProfessorView();
						
						this.dispose();
						professorView.setVisible(true);
						
					}
				else if(loginControll.loginAdmin(this) == "Consultado") {
					
					JOptionPane.showInternalMessageDialog(null, "Seja Bem vindo!!!");
					
					setMatricula(LoginController.getValMatricula());
					HomeAdminView adminView = new HomeAdminView();
					
					this.dispose();
					adminView.setVisible(true);
					
				}
				
				else if(loginControll.loginProfessor(this) == "Erro") {
					JOptionPane.showInternalMessageDialog(null, "Erro Verifique seu Login!!!");
					
				}	
					
					
	
			
			}
		}
		
		else if(e.getSource() == btn_entrarAluno){
			LoginController loginControll = new LoginController();
			System.out.println(LoginController.getValRA());
			if(textField_RA.getText().matches("") || passwordField_RA.getText().matches("") ) {
				JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!");
			}
			else {
				
				try {	
					if(loginControll.loginAluno(this) == "n") {
						JOptionPane.showInternalMessageDialog(null, "Erro Verifique seu Login!!!");
						
					}
					else {
						
						JOptionPane.showInternalMessageDialog(null, "Seja Bem vindo!!!");
						setRA(LoginController.getValRA());
						InicioView inicioView = new InicioView();
						this.dispose();
						inicioView.setVisible(true);
						
						
					}
					
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
			}
			}
		}
		
		
}
	
}