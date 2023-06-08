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



public class HomeAdminView extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btnAluno = new JButton("New button");
	JButton btnProfessor = new JButton("New button");
	JButton btnCurso = new JButton("New button");
	JButton btnDisciplina = new JButton("New button");
	JButton btnCurriculo = new JButton("New button");
	JButton btnTurma = new JButton("New button");
	JButton btnTurmaAluno = new JButton("New button");
	JButton btnVoltar = new JButton("New button");
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeAdminView frame = new HomeAdminView();
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
	public HomeAdminView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1365, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1349, 736);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 85, 113));
		panel_1.setBounds(0, 31, 1349, 66);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu do Administrador do Sistema");
		lblMenu.setForeground(new Color(255, 255, 255));
		lblMenu.setBounds(423, 11, 501, 36);
		panel_1.add(lblMenu);
		lblMenu.setFont(new Font("Arial Black", Font.BOLD, 25));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(HomeAdminView.class.getResource("/resources/logoFATEC.jpg")));
		lblNewLabel_1.setBounds(10, 621, 292, 88);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setIcon(new ImageIcon(HomeAdminView.class.getResource("/resources/iconAluno.png")));
		lblNewLabel_1_1.setBounds(171, 148, 189, 180);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1.setIcon(new ImageIcon(HomeAdminView.class.getResource("/resources/iconProfessor.png")));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(589, 148, 189, 180);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon(HomeAdminView.class.getResource("/resources/iconCurso.png")));
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(1072, 148, 189, 180);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon(HomeAdminView.class.getResource("/resources/iconDisciplina.png")));
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setBounds(31, 378, 189, 180);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1_1_1_1.setIcon(new ImageIcon(HomeAdminView.class.getResource("/resources/iconCurriculo.png")));
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setBounds(353, 378, 189, 180);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1_1_1_1_1.setIcon(new ImageIcon(HomeAdminView.class.getResource("/resources/iconTurma.jpg")));
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_1.setBounds(770, 378, 189, 180);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Aluno");
		lblNewLabel.setForeground(new Color(2, 78, 123));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(231, 120, 71, 14);
		panel.add(lblNewLabel);
		
		JLabel lblProfessor = new JLabel("Professor");
		lblProfessor.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfessor.setForeground(new Color(2, 78, 123));
		lblProfessor.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblProfessor.setBounds(610, 123, 133, 14);
		panel.add(lblProfessor);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurso.setForeground(new Color(2, 78, 123));
		lblCurso.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblCurso.setBounds(1110, 123, 133, 14);
		panel.add(lblCurso);
		
		JLabel lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisciplina.setForeground(new Color(2, 78, 123));
		lblDisciplina.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblDisciplina.setBounds(61, 339, 146, 28);
		panel.add(lblDisciplina);
		
		JLabel lblCurriculo = new JLabel("Curriculo");
		lblCurriculo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurriculo.setForeground(new Color(2, 78, 123));
		lblCurriculo.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblCurriculo.setBounds(393, 339, 146, 28);
		panel.add(lblCurriculo);
		
		JLabel lblTurma = new JLabel("Turma");
		lblTurma.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurma.setForeground(new Color(2, 78, 123));
		lblTurma.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblTurma.setBounds(802, 341, 133, 24);
		panel.add(lblTurma);
		
		btnAluno.addActionListener(this);
		
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnAluno.setBorderPainted(false);
		btnAluno.setContentAreaFilled(false);
		btnAluno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAluno.setBounds(167, 148, 196, 180);
		panel.add(btnAluno);
		
		btnProfessor.addActionListener(this);
		
		btnProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnProfessor.setContentAreaFilled(false);
		btnProfessor.setBorderPainted(false);
		btnProfessor.setBounds(579, 148, 196, 180);
		panel.add(btnProfessor);
		
		btnCurso.addActionListener(this);
		
		btnCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnCurso.setContentAreaFilled(false);
		btnCurso.setBorderPainted(false);
		btnCurso.setBounds(1081, 148, 196, 180);
		panel.add(btnCurso);
		
		
		btnDisciplina.addActionListener(this);
		
		btnDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnDisciplina.setContentAreaFilled(false);
		btnDisciplina.setBorderPainted(false);
		btnDisciplina.setBounds(31, 378, 196, 180);
		panel.add(btnDisciplina);
		
		
		btnCurriculo.addActionListener(this);
		
		btnCurriculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnCurriculo.setContentAreaFilled(false);
		btnCurriculo.setBorderPainted(false);
		btnCurriculo.setBounds(353, 378, 196, 180);
		panel.add(btnCurriculo);
		
		btnTurma.addActionListener(this);
		
		btnTurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnTurma.setContentAreaFilled(false);
		btnTurma.setBorderPainted(false);
		btnTurma.setBounds(770, 378, 196, 180);
		panel.add(btnTurma);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1_1_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1_1_1_1_1_1.setIcon(new ImageIcon(HomeAdminView.class.getResource("/resources/iconTurma.jpg")));
		lblNewLabel_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(1102, 388, 189, 180);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JLabel lblInserirAlunoEm = new JLabel("Inserir Aluno em uma Turma");
		lblInserirAlunoEm.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserirAlunoEm.setForeground(new Color(2, 78, 123));
		lblInserirAlunoEm.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblInserirAlunoEm.setBounds(1026, 339, 299, 24);
		panel.add(lblInserirAlunoEm);
		btnTurmaAluno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnTurmaAluno.addActionListener(this);
		
		btnTurmaAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTurmaAluno.setContentAreaFilled(false);
		btnTurmaAluno.setBorderPainted(false);
		btnTurmaAluno.setBounds(1081, 378, 196, 180);
		panel.add(btnTurmaAluno);
		
		JLabel lblVoltar = new JLabel("New label");
		lblVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVoltar.setIcon(new ImageIcon(HomeAdminView.class.getResource("/resources/iconVoltar.png")));
		lblVoltar.setBounds(10, 108, 126, 100);
		panel.add(lblVoltar);
		btnVoltar.setBorderPainted(false);
		
		btnVoltar.addActionListener(this);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBounds(0, 108, 161, 100);
		panel.add(btnVoltar);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnAluno) {
			CadastroAluno a = new CadastroAluno();
			a.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btnProfessor) {
			CadastroProfessorView p = new CadastroProfessorView();
			p.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btnCurso) {
			CadastrarCurso c = new CadastrarCurso();
			c.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btnDisciplina) {
			CadastrarDisciplinaView d = new CadastrarDisciplinaView();
			d.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btnCurriculo) {
			CadastrarCurriculoView c = new CadastrarCurriculoView();
			c.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btnTurma) {
			CadastrarTurmaView t = new CadastrarTurmaView();
			t.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btnTurmaAluno) {
			TurmaAlunoView t = new TurmaAlunoView();
			t.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == btnVoltar) {
			LoginView2 login = new LoginView2();
			login.setVisible(true);
			this.dispose();
		}
		
	}
}
